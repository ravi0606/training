package hms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hms.base.TestBase;

public class FrontOfficePage1 extends TestBase {

	@FindBy(xpath="//span[contains(text(),'Front Office')]")WebElement ffmenu;
	@FindBy(xpath="//h3[contains(text(),'Appointment Details')]")WebElement fftitle;
	@FindBy(xpath="//a[contains(text(),'Visitor Book')]")WebElement visitorbook;
	
public FrontOfficePage1() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void frontoffice() {
		ffmenu.click();
	}
	
	public String getboxTitle() {
		return fftitle.getText();
	}
	
	public VisitorPage visitorBook() {
		visitorbook.click();
		return new VisitorPage();
		
	}
	
	
}
