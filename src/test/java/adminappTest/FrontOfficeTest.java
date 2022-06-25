package adminappTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import hms.base.TestBase;
import hms.pages.FrontOfficePage1;
import hms.pages.LoginPage;

public class FrontOfficeTest extends TestBase {

	FrontOfficePage1 fop;
	LoginPage objlog;
	
	public FrontOfficeTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		objlog=new LoginPage();
		fop=objlog.adminLogin(prop.getProperty("USERNAME"),prop.getProperty("PASSWORD"));
	}
	
	@Test
	public void frontoffice() {
		
	
		fop.frontoffice();
		
		String expectedBoxTitle="Appointment Details";
		String ActualBoxTitle=fop.getboxTitle();
		Assert.assertEquals(ActualBoxTitle, expectedBoxTitle);
	
		fop.visitorBook();
	}
		
	@AfterMethod
	public void teardown() {
		//driver.close();
	
	
	}
	
	
	
	
}
