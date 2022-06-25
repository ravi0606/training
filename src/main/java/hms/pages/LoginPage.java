package hms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hms.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(xpath="//img[@src='http://triotend.com/tts/backend/images/s_logo.png']")WebElement logo;
	@FindBy(xpath="//h3[contains(text(),'Admin Login')]")WebElement logtxt;
	@FindBy(xpath="//input[@name='username']")WebElement usertxt;
	@FindBy(xpath="//input[@name='password']")WebElement passtxt;
	@FindBy(xpath="/html/body/div[1]/div/div/div/div/div/div[2]/form/button")WebElement signin;
	@FindBy(xpath="//img[@class='topuser-image']")WebElement primage;
	@FindBy(xpath="//h5[contains(text(),'Super Admin')]")WebElement prtxt;
	@FindBy(xpath="//a[contains(text(),'Logout')]")WebElement logout;
	
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
		
	}

	public String getPageTitle() {
		
		return driver.getTitle();
		
	}
	
	public boolean logoDisplayed() {
		
		return logo.isDisplayed();
	}
	
	public String getLoginText() {
		return logtxt.getText();
	}
	
	public FrontOfficePage1 adminLogin(String Uname,String pass) {
		usertxt.sendKeys(Uname);
		passtxt.sendKeys(pass);
		signin.click();
		return new FrontOfficePage1();
	}
	
	public void clickprimage() {
		primage.click();
	}
	
	public String getpretext() {
		return prtxt.getText();
		
	}
	
	public void adminLogout() {
		logout.click();
	}
}
