package com.sandbox.qa;

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

public class EditTestCases {

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
	public void editTestCases() throws InterruptedException {

		// Get web page URl and manage browser window to required size
		driver.get(LogInPage.URL);
		driver.manage().window().maximize();
		Thread.sleep(2500);

		LogInPage Action = new LogInPage(driver);

		// Click on Log In button
		Action.click_logIn();

		// Log In with valid email and valid password
		Action.fill_Details();
		Thread.sleep(2500);

		Action.click_use_cases();
		Thread.sleep(2500);
		
        // Edit Negative Login Test 1
		Action.click_NegativeTestCase1();
		Thread.sleep(2500);
		Action.fill_DetailsEditNegativeTestCase1();
		Thread.sleep(2500);
		
		// Edit Negative Login Test 2
		Action.click_NegativeTestCase2();
		Thread.sleep(2500);
		Action.fill_DetailsEditNegativeTestCase2();
		Thread.sleep(2500);
		
		// Edit Login Test 
		Action.click_LoginTestCase();
		Thread.sleep(2500);
		Action.fill_DetailsEditLoginTestCase();
		Thread.sleep(2500);
		
		// Edit Forgot Password Test 
		Action.click_ForgotPasswordTestCase();
		Thread.sleep(2500);
		Action.fill_DetailsEditForgotPasswordTestCase();
		Thread.sleep(2500);

        // Edit Redirection test
		Action.click_RedirectionTestCase();
		Thread.sleep(2500);
		Action.fill_DetailsEditRedirectionTestCase();
		Thread.sleep(2500);

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
