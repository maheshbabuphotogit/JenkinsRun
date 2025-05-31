package commonPackage;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterSuite;

public class CommonFunctionsClass {
	
	public static WebDriver driver;
	public Properties property;
	
	
@BeforeTest
	public void loadpropertyfile() throws IOException {
		
		FileInputStream FIS = new FileInputStream("config.properties");
		
		property = new Properties();
		property.load(FIS);
		
	}
	
@BeforeSuite
	public void launchBrowser() throws IOException {
		loadpropertyfile() ;
		String browser =property.getProperty("BROWSER");
		String url = property.getProperty("appURL");
		
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();
			
			
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
			
		}
		
		driver.get(url);
		driver.manage().window().maximize();
	    String BrowserTitle= driver.getTitle();
	    System.out.println("The Title is :" + BrowserTitle);
	    
}

	@AfterSuite
	public void quitbrowser() {
		
	}

}

