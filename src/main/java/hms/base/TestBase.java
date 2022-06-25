package hms.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static Properties prop;
	public static WebDriver driver;
	
	
	public TestBase() {
		
		try {
			FileInputStream ipconfig=new FileInputStream("./src/main/java/hms/config/appconfig.properties");
			prop=new Properties();
			prop.load(ipconfig);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void initialization() {
		
		String browser=prop.getProperty("BROWSER");
		
		if(browser.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}
		else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().deleteAllCookies();
		
		driver.get(prop.getProperty("URL"));
		
	}
	
}
