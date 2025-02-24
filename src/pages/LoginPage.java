package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='username']") WebElement username;
	@FindBy(xpath="//input[@id='password']") WebElement password;
	@FindBy(xpath="//a[text()='Forgot Password?']") WebElement forgotPasswordLink;
	@FindBy(xpath="//input[@id='login']") WebElement loginButton;
//	@FindBy(xpath="//input[@id='username']") WebElement username;
//	@FindBy(xpath="//input[@id='username']") WebElement username;

	public LoginPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void login(String user, String pwd) {
		try {
			
//		Assert.assertTrue(username.isDisplayed());
		username.sendKeys(user);
//		Assert.assertTrue(password.isDisplayed());
		password.sendKeys(pwd);
//		Assert.assertTrue(loginButton.isEnabled());
		loginButton.click();
		} catch(Exception e) {
			System.out.println("Exception caught: "+e.getMessage());
		}
		
	}
	
	public void verifyAllButtons() {
		Assert.assertTrue(username.isDisplayed());
		Assert.assertTrue(password.isDisplayed());
		Assert.assertTrue(loginButton.isEnabled());
		Assert.assertTrue(forgotPasswordLink.isDisplayed());
	}
	
	

}
