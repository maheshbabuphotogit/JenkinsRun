package pageObjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {
	
	@FindBy(name="username")
	public static WebElement username;
	@FindBy(name="password")
	public static WebElement password;
	@FindBy(xpath="//button[contains(@class,'oxd-button oxd-button--medium')]")
	public static WebElement submit;

}

