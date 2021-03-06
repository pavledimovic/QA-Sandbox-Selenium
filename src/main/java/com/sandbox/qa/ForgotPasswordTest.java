package com.sandbox.qa;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

public class ForgotPasswordTest {

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
	public void forgotPasswordTest() throws InterruptedException {

		// Get web page URl and manage browser window to required size
		driver.get(LogInPage.URL);
		driver.manage().window().maximize();
		Thread.sleep(2500);

		LogInPage Action = new LogInPage(driver);

		// Click on Log In button
		Action.click_logIn();

		// Log In with valid email and valid password
		Action.click_forgot_password();
		Thread.sleep(2500);
		Action.enter_email2();
		Thread.sleep(2500);
		Action.click_submit2();
		Thread.sleep(1500);

		// TEST that toast "Email is sent" has been displayed
		WebElement toast = driver.findElement(By
				.xpath("//div[contains(@class,'Toastify__toast-container Toastify__toast-container--bottom-right')]"));

		if (toast.isDisplayed()) {
			System.out.println("PASS Email was sent toast has been displayed");
		} else {
			System.out.println("FAIL Email was sent toast was NOT displayed ");
			fail();
		}

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