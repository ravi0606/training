package adminappTest;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import hms.base.TestBase;
import hms.pages.LoginPage;

public class LoginTest extends TestBase {

	LoginPage objlog;
	
	public LoginTest() {
		super();
		
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		objlog=new LoginPage();
	}
	
	@Test
	public void adminLoginTest() {
		
		String ExpectedPageTitle="Smart Hospital : Hospital Management System";
		String ActualPageTitle=objlog.getPageTitle();
		
		Assert.assertEquals(ActualPageTitle, ExpectedPageTitle);
		
		Assert.assertTrue(objlog.logoDisplayed());
		
		String ExpectedLoginTitle="Admin Login";
		String ActualLoginTitle=objlog.getLoginText();
		Assert.assertEquals(ExpectedLoginTitle, ActualLoginTitle);
		
		
		objlog.adminLogin(prop.getProperty("USERNAME"),prop.getProperty("PASSWORD"));
		
		objlog.clickprimage();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		
		String Actualprofiletext=objlog.getpretext();
		System.out.println(Actualprofiletext);
		String Expectedprofiletext="Super Admin";
		
		
		Assert.assertEquals(Expectedprofiletext,Actualprofiletext);
	
		
		//objlog.adminLogout();
		

	}
	
	@AfterMethod
	public void teardown() {
		
	//driver.close();
		
	}
	
}
