package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

	WebDriver driver;

	public LogInPage(WebDriver driver1) {
		PageFactory.initElements(driver1, this);
	}

	// Change this URL for targeting different envoirments
	public static String URL = "https://qa-sandbox.apps.htec.rs";

	// Button ID's
	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-lg btn-secondary']")
	private WebElement txtbx_LogInSecondary;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Login')]")
	private WebElement txtbx_LogIn;

	@FindBy(how = How.XPATH, using = " //a[contains(text(),'Forgot Password')]")
	private WebElement txtbx_ForgotPassword;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary btn-block mt-4']")
	private WebElement txtbx_Submit;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Email Address']")
	private WebElement txtbx_UserName;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Password']")
	private WebElement txtbx_Password;

	@FindBy(how = How.XPATH, using = "//input[contains(@placeholder,'* Email Address')]")
	private WebElement txtbx_EmailAdress;

	@FindBy(how = How.XPATH, using = "//button[contains(@class,'btn btn-primary mt-4 float-right')]")
	private WebElement txtbx_Submit2;

	@FindBy(how = How.XPATH, using = "//img[contains(@class,'footer-logo')]")
	private WebElement txtbx_FooterLogo;

	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[@class='App']/div[@class='container']/div[@class='dashboard']/div[@class='container noselect']/div[@class='row']/div[2]/div[1]/a[1]/div[1]  \r\n"
			+ "")
	private WebElement txtbx_UseCases;

	@FindBy(how = How.XPATH, using = "//a[@class='btn mb-4 btn-primary float-right']")
	private WebElement txtbx_CreateUseCase;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='* Title']")
	private WebElement txtbx_Title;

	@FindBy(how = How.XPATH, using = "//textarea[@placeholder='Description']")
	private WebElement txtbx_Description;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='* Expected Result']")
	private WebElement txtbx_ExpectedResult;

	@FindBy(how = How.XPATH, using = "//span[@class='text-primary']")
	private WebElement txtbx_AddStep;

	@FindBy(how = How.XPATH, using = "//label[@class='pt-1 ml-2']")
	private WebElement txtbx_Autotest;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary mt-4 float-right']")
	private WebElement txtbx_Submit3;

	@FindBy(how = How.XPATH, using = "//input[@id='stepId']")
	private WebElement txtbx_Step1;

	@FindBy(how = How.XPATH, using = "//div[6]//div[1]//div[1]//input[1]")
	private WebElement txtbx_Step2;

	@FindBy(how = How.XPATH, using = "//div[7]//div[1]//div[1]//input[1]")
	private WebElement txtbx_Step3;

	@FindBy(how = How.XPATH, using = "//div[8]//div[1]//div[1]//input[1]")
	private WebElement txtbx_Step4;

	@FindBy(how = How.XPATH, using = "//div[9]//div[1]//div[1]//input[1]")
	private WebElement txtbx_Step5;

	@FindBy(how = How.XPATH, using = "//div[10]//div[1]//div[1]//input[1]")
	private WebElement txtbx_Step6;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Negative log in test 1')]")  
	private WebElement txtbx_NegativeTestCase1;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Negative Log In test 2')]")   
	private WebElement txtbx_NegativeTestCase2;
	
	@FindBy(how = How.XPATH, using = "//body//a[3]")   
	private WebElement txtbx_LoginTestCase;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Forgot password test')]")   
	private WebElement txtbx_ForgotPasswortTestCase;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Test redirection to HTEC web site')]")  
	private WebElement txtbx_RedirectionTestCase;
	
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-secondary ml-2 mb-3 btn-dark btn-lg pull-right']")   
	private WebElement txtbx_DeleteTestCase;
	
	@FindBy(how = How.XPATH, using = "//button[contains(@class,'btn btn-lg btn-danger')] ")   
	private WebElement txtbx_ConfirmDelete;


	// Actions
	public void click_logIn() {
		txtbx_LogInSecondary.click();
	}

	public void click_menu() {
		txtbx_LogIn.click();
	}

	public void click_submit() {
		txtbx_Submit.click();
	}

	public void click_forgot_password() {
		txtbx_ForgotPassword.click();
	}

	public void enter_email() {
		txtbx_UserName.sendKeys("pavledimovic@gmail.com");
	}
	
	public void enter_invalid_email() {
		txtbx_UserName.sendKeys("pavledimovic@com");
	}

	public void enter_password() {
		txtbx_Password.sendKeys("beta8b");
	}
	
	public void enter_invalid_password() {
		txtbx_Password.sendKeys("12345678");
	}

	public void enter_email2() {
		txtbx_EmailAdress.sendKeys("pavledimovic@gmail.com");
	}

	public void click_submit2() {
		txtbx_Submit2.click();
	}

	public void click_footer_logo() {
		txtbx_FooterLogo.click();
	}

	public void click_use_cases() {
		txtbx_UseCases.click();
	}

	public void click_create_use_case() {
		txtbx_CreateUseCase.click();
	}

	public void click_add_step() {
		txtbx_AddStep.click();
	}

	public void click_Autotest_toggle() {
		txtbx_Autotest.click();
	}

	public void click_Submit3() {
		txtbx_Submit3.click();
	}

	public void click_NegativeTestCase1() {
		txtbx_NegativeTestCase1.click();
	}
	
	public void click_NegativeTestCase2() {
		txtbx_NegativeTestCase2.click();
	}
	
	public void click_LoginTestCase() {
		txtbx_LoginTestCase.click();
	}
	
	public void click_ForgotPasswordTestCase() {
		txtbx_ForgotPasswortTestCase.click();
	}
	
	public void click_RedirectionTestCase() {
		txtbx_RedirectionTestCase.click();
	}
	
	public void click_DeleteTestCase() {
		txtbx_DeleteTestCase.click();
	}
	
	public void click_ConfirmDelete() {
		txtbx_ConfirmDelete.click();
	}

	// Log In elements actions
	public void enter_UserName(String UserName) {
		txtbx_UserName.sendKeys(UserName);
	}

	public void enter_Password(String Password) {
		txtbx_Password.sendKeys(Password);
	}

	// Auto fill log in credentials
	public void fill_Details() throws InterruptedException {

		Thread.sleep(1000);
		enter_UserName("pavledimovic@gmail.com");
		enter_Password("beta8b");
		click_submit();

	}

	// Negative log in test 1
	public static String UCEdit = "-Edited 743578";

	public static String UC = "Negative log in test 1";
	public static String UC1 = "After we put correct username and wrong password log in should not be possible\r\n"
			+ "Base URL: https://qa-sandbox.apps.htec.rs/";
	public static String UC2 = "Toast message \"Wrong password\" is displayed and log in is not possible, user is left in Log In page";
	public static String UC3 = "Click Log In button";
	public static String UC4 = "Type email: \"pavledimovic@gmail.com\" in \"Email address\" field";
	public static String UC5 = "Type incorrect password \"12345678\" in \"password\" field";
	public static String UC6 = "Click Log In option";

	// Actions
	public void enter_UC(String UC) {
		txtbx_Title.sendKeys(UC);
	}

	public void enter_UC1(String UC1) {
		txtbx_Description.sendKeys(UC1);
	}

	public void enter_UC2(String UC2) {
		txtbx_ExpectedResult.sendKeys(UC2);
	}

	public void enter_UC3(String UC3) {
		txtbx_Step1.sendKeys(UC3);
	}

	public void enter_UC4(String UC4) {
		txtbx_Step2.sendKeys(UC4);
	}

	public void enter_UC5(String UC5) {
		txtbx_Step3.sendKeys(UC5);
	}

	public void enter_UC6(String UC6) {
		txtbx_Step4.sendKeys(UC6);
	}

	public void fill_DetailsNegativeTestCase1() throws InterruptedException {

		Thread.sleep(1000);
		enter_UC(UC);
		enter_UC1(UC1);
		enter_UC2(UC2);
		enter_UC3(UC3);
		click_add_step();
		enter_UC4(UC4);
		click_add_step();
		enter_UC5(UC5);
		click_add_step();
		enter_UC6(UC6);

		click_Submit3();

	}

	// Actions Edit
	public void enter_UCEdit(String UCEdit) {
		txtbx_Title.sendKeys(UCEdit);
	}

	public void enter_UCEdit1(String UCEdit) {
		txtbx_Description.sendKeys(UCEdit);
	}

	public void enter_UCEdit2(String UCEdit) {
		txtbx_ExpectedResult.sendKeys(UCEdit);
	}

	public void enter_UCEdit3(String UCEdit) {
		txtbx_Step1.sendKeys(UCEdit);
	}

	public void enter_UCEdit4(String UCEdit) {
		txtbx_Step2.sendKeys(UCEdit);
	}

	public void enter_UCEdit5(String UCEdit) {
		txtbx_Step3.sendKeys(UCEdit);
	}

	public void enter_UCEdit6(String UCEdit) {
		txtbx_Step4.sendKeys(UCEdit);
	}

	public void fill_DetailsEditNegativeTestCase1() throws InterruptedException {

		Thread.sleep(1000);
		enter_UCEdit(UCEdit);
		enter_UCEdit1(UCEdit);
		enter_UCEdit2(UCEdit);
		enter_UCEdit3(UCEdit);
		enter_UCEdit4(UCEdit);
		enter_UCEdit5(UCEdit);
		enter_UCEdit6(UCEdit);

		click_Submit3();

	}

	// Negative log in test 2
	public static String UC7 = "Negative Log In test 2";
	public static String UC8 = "After we put correct username and wrong password log in should not be possible\r\n"
			+ "Base URL: https://qa-sandbox.apps.htec.rs/";
	public static String UC9 = "Toast with message \"Wrong \" is displayed and log in is not possible, user is left in Log In page";
	public static String UC10 = "Click Login button";
	public static String UC11 = "Type email: \"pavledimovic@com\" in \"Email adress\" field";
	public static String UC12 = "Type correct password \"beta8b\" in \"password\" field";
	public static String UC13 = "Click Log In option";

	// Actions
	public void enter_UC7(String UC7) {
		txtbx_Title.sendKeys(UC7);
	}

	public void enter_UC8(String UC8) {
		txtbx_Description.sendKeys(UC8);
	}

	public void enter_UC9(String UC9) {
		txtbx_ExpectedResult.sendKeys(UC9);
	}

	public void enter_UC10(String UC10) {
		txtbx_Step1.sendKeys(UC10);
	}

	public void enter_UC11(String UC11) {
		txtbx_Step2.sendKeys(UC11);
	}

	public void enter_UC12(String UC12) {
		txtbx_Step3.sendKeys(UC12);
	}

	public void enter_UC13(String UC13) {
		txtbx_Step4.sendKeys(UC13);
	}

	public void fill_DetailsNegativeTestCase2() throws InterruptedException {

		Thread.sleep(1000);
		enter_UC7(UC7);
		enter_UC8(UC8);
		enter_UC9(UC9);
		enter_UC10(UC10);
		click_add_step();
		enter_UC11(UC11);
		click_add_step();
		enter_UC12(UC12);
		click_add_step();
		enter_UC13(UC13);

		click_Submit3();
	}

	// Actions Edit
	public void enter_UCEdit7(String UCEdit) {
		txtbx_Title.sendKeys(UCEdit);
	}

	public void enter_UCEdit8(String UCEdit) {
		txtbx_Description.sendKeys(UCEdit);
	}

	public void enter_UCEdit9(String UCEdit) {
		txtbx_ExpectedResult.sendKeys(UCEdit);
	}

	public void enter_UCEdit10(String UCEdit) {
		txtbx_Step1.sendKeys(UCEdit);
	}

	public void enter_UCEdit11(String UCEdit) {
		txtbx_Step2.sendKeys(UCEdit);
	}

	public void enter_UCEdit12(String UCEdit) {
		txtbx_Step3.sendKeys(UCEdit);
	}

	public void enter_UCEdit13(String UCEdit) {
		txtbx_Step4.sendKeys(UCEdit);
	}

	public void fill_DetailsEditNegativeTestCase2() throws InterruptedException {

		Thread.sleep(1000);
		enter_UCEdit7(UCEdit);
		enter_UCEdit8(UCEdit);
		enter_UCEdit9(UCEdit);
		enter_UCEdit10(UCEdit);
		enter_UCEdit11(UCEdit);
		enter_UCEdit12(UCEdit);
		enter_UCEdit13(UCEdit);

		click_Submit3();

	}

	// Login test case
	public static String UC14 = "Log In test";
	public static String UC15 = "Test that Log In is possible with valid Email address and valid password\r\n"
			+ "Base URL: https://qa-sandbox.apps.htec.rs/";
	public static String UC16 = "User is logged in and redirected to main page";
	public static String UC17 = "Click Log In Button";
	public static String UC18 = "Type email: \"pavledimovic@gmail.com\" in \"Email address\" field";
	public static String UC19 = "Type correct password \"beta8b\" in \"password\" field";
	public static String UC20 = "Click Log In option";

	// Actions
	public void enter_UC14(String UC14) {
		txtbx_Title.sendKeys(UC14);
	}

	public void enter_UC15(String UC15) {
		txtbx_Description.sendKeys(UC15);
	}

	public void enter_UC16(String UC16) {
		txtbx_ExpectedResult.sendKeys(UC16);
	}

	public void enter_UC17(String UC17) {
		txtbx_Step1.sendKeys(UC17);
	}

	public void enter_UC18(String UC18) {
		txtbx_Step2.sendKeys(UC18);
	}

	public void enter_UC19(String UC19) {
		txtbx_Step3.sendKeys(UC19);
	}

	public void enter_UC20(String UC20) {
		txtbx_Step4.sendKeys(UC20);
	}

	public void fill_DetailsLoginTestCase() throws InterruptedException {

		Thread.sleep(1000);
		enter_UC14(UC14);
		enter_UC15(UC15);
		enter_UC16(UC16);
		enter_UC17(UC17);
		click_add_step();
		enter_UC18(UC18);
		click_add_step();
		enter_UC19(UC19);
		click_add_step();
		enter_UC20(UC20);

		click_Submit3();
	}

	// Actions Edit
	public void enter_UCEdit14(String UCEdit) {
		txtbx_Title.sendKeys(UCEdit);
	}

	public void enter_UCEdit15(String UCEdit) {
		txtbx_Description.sendKeys(UCEdit);
	}

	public void enter_UCEdit16(String UCEdit) {
		txtbx_ExpectedResult.sendKeys(UCEdit);
	}

	public void enter_UCEdit17(String UCEdit) {
		txtbx_Step1.sendKeys(UCEdit);
	}

	public void enter_UCEdit18(String UCEdit) {
		txtbx_Step2.sendKeys(UCEdit);
	}

	public void enter_UCEdit19(String UCEdit) {
		txtbx_Step3.sendKeys(UCEdit);
	}

	public void enter_UCEdit20(String UCEdit) {
		txtbx_Step4.sendKeys(UCEdit);
	}

	public void fill_DetailsEditLoginTestCase() throws InterruptedException {

		Thread.sleep(1000);
		enter_UCEdit14(UCEdit);
		enter_UCEdit15(UCEdit);
		enter_UCEdit16(UCEdit);
		enter_UCEdit17(UCEdit);
		enter_UCEdit18(UCEdit);
		enter_UCEdit19(UCEdit);
		enter_UCEdit20(UCEdit);

		click_Submit3();

	}

	// Forgot password test case
	public static String UC21 = "Forgot password test";
	public static String UC22 = "Testing that Forgot password option is working correctly \r\n"
			+ "Base URL: https://qa-sandbox.apps.htec.rs/\r\n" + "\r\n"
			+ "NOTE: We can also go to inbox and see that corresponding Email has arrived.";
	public static String UC23 = "Email is sent, and pop up message \"Email successfully sent\" is shown ";
	public static String UC24 = "Click on \"Forgot password\" option";
	public static String UC25 = "Type valid email in \"Email address\" field";
	public static String UC26 = "Click send option";

	// Actions
	public void enter_UC21(String UC21) {
		txtbx_Title.sendKeys(UC21);
	}

	public void enter_UC22(String UC22) {
		txtbx_Description.sendKeys(UC22);
	}

	public void enter_UC23(String UC23) {
		txtbx_ExpectedResult.sendKeys(UC23);
	}

	public void enter_UC24(String UC24) {
		txtbx_Step1.sendKeys(UC24);
	}

	public void enter_UC25(String UC25) {
		txtbx_Step2.sendKeys(UC25);
	}

	public void enter_UC26(String UC26) {
		txtbx_Step3.sendKeys(UC26);
	}

	public void fill_DetailsForgotPasswordTestCase() throws InterruptedException {

		Thread.sleep(1000);
		enter_UC21(UC21);
		enter_UC22(UC22);
		enter_UC23(UC23);
		enter_UC24(UC24);
		click_add_step();
		enter_UC25(UC25);
		click_add_step();
		enter_UC26(UC26);

		click_Submit3();
	}

	// Actions Edit
	public void enter_UCEdit21(String UCEdit) {
		txtbx_Title.sendKeys(UCEdit);
	}

	public void enter_UCEdit22(String UCEdit) {
		txtbx_Description.sendKeys(UCEdit);
	}

	public void enter_UCEdit23(String UCEdit) {
		txtbx_ExpectedResult.sendKeys(UCEdit);
	}

	public void enter_UCEdit24(String UCEdit) {
		txtbx_Step1.sendKeys(UCEdit);
	}

	public void enter_UCEdit25(String UCEdit) {
		txtbx_Step2.sendKeys(UCEdit);
	}

	public void enter_UCEdit26(String UCEdit) {
		txtbx_Step3.sendKeys(UCEdit);
	}

	public void fill_DetailsEditForgotPasswordTestCase() throws InterruptedException {

		Thread.sleep(1000);
		enter_UCEdit21(UCEdit);
		enter_UCEdit22(UCEdit);
		enter_UCEdit23(UCEdit);
		enter_UCEdit24(UCEdit);
		enter_UCEdit25(UCEdit);
		enter_UCEdit26(UCEdit);
		enter_UCEdit27(UCEdit);

		click_Submit3();

	}

	// Redirection test case
	public static String UC27 = "Test redirection to HTEC web site";
	public static String UC28 = "Testing that user is redirected to to HTEC web site when we click on HTEC logo in bottom of the page\r\n"
			+ "Base URL: https://qa-sandbox.apps.htec.rs/";
	public static String UC29 = "User is redirected to HTEC web site , URL: https://htecgroup.com/";
	public static String UC30 = "Click on HTEC Logo in the bottom of web page";

	// Actions
	public void enter_UC27(String UC27) {
		txtbx_Title.sendKeys(UC27);
	}

	public void enter_UC28(String UC28) {
		txtbx_Description.sendKeys(UC28);
	}

	public void enter_UC29(String UC29) {
		txtbx_ExpectedResult.sendKeys(UC29);
	}

	public void enter_UC30(String UC30) {
		txtbx_Step1.sendKeys(UC30);
	}

	public void fill_DetailsRedirectionTestCase() throws InterruptedException {

		Thread.sleep(1000);
		enter_UC27(UC27);
		enter_UC28(UC28);
		enter_UC29(UC29);
		enter_UC30(UC30);
		click_add_step();

		click_Submit3();
	}

	// Actions Edit
	public void enter_UCEdit27(String UCEdit) {
		txtbx_Title.sendKeys(UCEdit);
	}

	public void enter_UCEdit28(String UCEdit) {
		txtbx_Description.sendKeys(UCEdit);
	}

	public void enter_UCEdit29(String UCEdit) {
		txtbx_ExpectedResult.sendKeys(UCEdit);
	}

	public void enter_UCEdit30(String UCEdit) {
		txtbx_Step1.sendKeys(UCEdit);
	}

	public void fill_DetailsEditRedirectionTestCase() throws InterruptedException {

		Thread.sleep(1000);
		enter_UCEdit27(UCEdit);
		enter_UCEdit28(UCEdit);
		enter_UCEdit29(UCEdit);
		enter_UCEdit30(UCEdit);

		click_Submit3();

	}

}
