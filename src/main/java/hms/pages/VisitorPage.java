package hms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import hms.base.TestBase;

public class VisitorPage extends TestBase {

	
	@FindBy(xpath="//h3[text()='Visitor List']")WebElement boxtitle;
	@FindBy(xpath="//a[@class='btn btn-primary btn-sm']")WebElement addvisitor;
	@FindBy(xpath="//h4[contains(text(),' Add Visitor')]")WebElement screentitle;
	//@FindBy(xpath="//select[@name='purpose' and @autocomplete='off']")WebElement purpose;
	@FindBy(xpath="//input[@name='name' and @autocomplete='off']")WebElement Pname;
	@FindBy(xpath="//input[@name='contact' and @autocomplete='off']")WebElement Pphone;
	@FindBy(xpath="//input[@name='id_proof' and @autocomplete='off']")WebElement Pid;
	@FindBy(xpath="//input[@name='pepples' and @autocomplete='off']")WebElement PNOP;
	@FindBy(xpath="//textarea[@name='note' and @autocomplete='off']")WebElement Pnote;
	@FindBy(xpath="//input[@name='file' and @autocomplete='off']")WebElement Pupload;
	@FindBy(xpath="//input[@name='date' and @autocomplete='off']")WebElement Pdate;
	
	
	public VisitorPage() {
		PageFactory.initElements(driver,this);
		
	}
	
	public String getboxTitle() {
		return boxtitle.getText();
	}
	
	public void clickOnAddVisitor() {
		addvisitor.click();
	}
	
	public String getScreenTitle() {
		return screentitle.getText();
	}
	
	public void AddVisitorDetails() {
		
		//Select drp=new Select(purpose);
		//drp.selectByVisibleText("checkup");
		Pname.sendKeys("monkey");
		Pphone.sendKeys("787945541");
		Pid.sendKeys("Aadhar");
		PNOP.sendKeys("2");
		Pnote.sendKeys("jbdjbjb");
		
		
		
		
		
		
		
		
		
	}
}
