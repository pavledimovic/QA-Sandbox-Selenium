package com.sandbox.qa;

import static org.testng.Assert.fail;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LogInPage;
import utils.Utility;

public class RedirectionToWebSiteTest {

	static WebDriver driver;

	@BeforeMethod
	@Parameters("browser")
	public void setup(@Optional("Chrome") String browser) throws Exception {
		// Check if parameter passed from TestNG is 'Chrome'
		if (browser.equalsIgnoreCase("chrome")) {
			// set path to chromedriver.exe
			System.setProperty("webdriver.chrome.driver", "C:/Selenium/Chrome/ChromeDriver.exe");
			// create chrome instance
			driver = new ChromeDriver();
		}
		// Check if parameter passed as 'firefox'
		else if (browser.equalsIgnoreCase("firefox")) {
			// create firefox instance
			System.setProperty("webdriver.gecko.driver", "C:/Selenium/Mozilla/GeckoDriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void redirectionTest() throws InterruptedException {

		// Get web page URl and manage browser window to required size
		driver.get(LogInPage.URL);
		driver.manage().window().maximize();
		Thread.sleep(2500);

		LogInPage Action = new LogInPage(driver);

		// Click on HTEC logo
		Action.click_footer_logo();

		// Get window handlers as list
		List<String> browserTabs = new ArrayList<String>(driver.getWindowHandles());
		// Switch to new tab
		driver.switchTo().window(browserTabs.get(1));

		// Check is it correct page opened or not
		Thread.sleep(2500);
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		if (currentURL.equals("https://htecgroup.com/")) {
			System.out.println("PASS Redirection to HTEC landing page was sucsessfoul");
		} else {
			System.out.println("FAIL Redirection to HTEC landing page was NOT sucsessfoul");
			fail();
		}

		// Close newly opened tab and get back
		driver.close();
		driver.switchTo().window(browserTabs.get(0));

	}

	@AfterMethod
	public void tearDown(ITestResult result) throws InterruptedException {
		if (ITestResult.FAILURE == result.getStatus()) {
			Utility.captureScreenshot(driver, result.getName());
		}
		Thread.sleep(4000);
		driver.quit();
	}

}