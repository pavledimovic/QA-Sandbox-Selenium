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

public class NegativeLogInTest2 {

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
	public void negativeLoginTest2() throws InterruptedException {

		// Get web page URl and manage browser window to required size
		driver.get(LogInPage.URL);
		driver.manage().window().maximize();
		Thread.sleep(2500);

		LogInPage Action = new LogInPage(driver);

		// Click on Log In button
		Action.click_logIn();

		// Try to Log In with invalid email and valid password
		Action.enter_invalid_email();
		Action.enter_password();
		Thread.sleep(2500);
		Action.click_submit();

		Thread.sleep(2000);

		// TEST that correct toast is displayed
		String toastText = driver.findElement(By.xpath("//div[@class='invalid-feedback']")).getText();
		WebElement toast = driver.findElement(By.xpath("//div[@class='invalid-feedback']"));

		if (toast.isDisplayed()) {
			System.out.println("PASS Email is invalid toast is displayed");
		} else {
			System.out.println("FAIL Email is invalid toast is NOT displayed");
			fail();

		}
		if (toastText.equals("Email is invalid")) {
			System.out.println("PASS Correct text is displayed");
		} else {
			System.out.println("FAIL Email is invalid text doesnt match for selected element");
			fail();
		}

		// TEST that log in with invalid credentials is not possible
		driver.findElement(By.xpath("//div[@class='col-md-8 m-auto']")).isDisplayed();
		System.out.println("PASS Login with wrong password was not possible");
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