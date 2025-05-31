package testCases;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonPackage.CommonFunctionsClass;
import pageObjects.LoginPageObjects;

public class LoginTestCase extends CommonFunctionsClass {
	

	@Test
	public void logintestcases() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String UserName = property.getProperty("USERNAME");
		String Password = property.getProperty("PASSWORD");
		
		PageFactory.initElements(driver, LoginPageObjects.class);
		LoginPageObjects.username.sendKeys(UserName);
		LoginPageObjects.password.sendKeys(Password);
		LoginPageObjects.submit.click();
		 
		
	}
	
	
	
	

}

