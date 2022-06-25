package adminappTest;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import hms.base.TestBase;
import hms.pages.FrontOfficePage1;
import hms.pages.LoginPage;
import hms.pages.VisitorPage;

public class VisitorTest extends TestBase {
	
	VisitorPage vp;
	FrontOfficePage1 fop;
	LoginPage objlog;
	
	
	@BeforeMethod
	public void setup() {
		initialization();
		objlog=new LoginPage();
		fop=objlog.adminLogin(prop.getProperty("USERNAME"),prop.getProperty("PASSWORD"));
		fop.frontoffice();
		vp=fop.visitorBook();
	}
	
	@Test
	public void AddVisitorDetails() {
		
		String ExpectedBoxTitle="Visitor List";
		String ActualBoxTitle=vp.getboxTitle();
		Assert.assertEquals(ActualBoxTitle, ExpectedBoxTitle);
		
		vp.clickOnAddVisitor();
		
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		//String ExpectedScreenTitle="Add Visitor";
		//String ActualScreenTitle=vp.getScreenTitle();
		//Assert.assertEquals(ActualScreenTitle, ExpectedScreenTitle);
		
		
		vp.AddVisitorDetails();
		
		
		
		
		
		
		
		
		
		
		
	}

 

}
