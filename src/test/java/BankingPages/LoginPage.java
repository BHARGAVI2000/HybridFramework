package BankingPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BankingBase.BaseClass;

public class LoginPage {

	// public LoginPage(WebDriver rdriver) {
	//	ldriver=rdriver;
	//	PageFactory.initElements(rdriver, this);} //use this when you are create a framework for everypage we have to create
	//// in order the make the webpages initialized when the pages are called or else i just in the login testcase itself



	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);}


	@FindBy(id="user_login")
	public WebElement username;

	@FindBy(id="user_password")
	public WebElement password;

	@FindBy(name="submit")
	public WebElement submit;

	@FindBy(id="details-button")
	public WebElement detailbutton;

	@FindBy(id="proceed-link")
	public WebElement proceedlink;



	public void enterUserName(String uname) {

		username.sendKeys(uname);

	}

	public void enterPassword(String pswd)
	{
		password.sendKeys(pswd);

	}

	public void clickSubmit() {
		submit.click();	
	}

	public void clickDetailButton() {
		detailbutton.click();

	}
	public void clickProceedLink() {
		proceedlink.click();
	}

	// or use the code below instead the above three username, password , submit method


	public void  doLogin(String uname, String pswd) {
		username.sendKeys(uname);
		password.sendKeys(pswd);
		submit.click();



	}



}