package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
	WebDriver driver;
	
	@FindBy(xpath="//input[contains(@value,'Hello')]") WebElement welcomeMessageLink;
	@FindBy(xpath="//a[text()='Logout']") WebElement logoutLink;
	@FindBy(xpath="//a[text()='Search Hotel']") WebElement searchHotelLink;
	@FindBy(xpath="//input[@id='Submit']") WebElement submitButton;
	@FindBy(xpath="//input[@id='Reset']") WebElement resetButton;
//	@FindBy(xpath="//input[@id='username']") WebElement username;

	public HomePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void validateWelcomeMessage(String user) {
		try {
			
			String actualWelcomeMessage = welcomeMessageLink.getText();
			Assert.assertEquals(actualWelcomeMessage, "Welcome "+user+"!");
		} catch(Exception e) {
			System.out.println("Exception caught: "+e.getMessage());
		}
		
	}
	
	public void logout() {
		try {
			Assert.assertTrue(logoutLink.isDisplayed());
			logoutLink.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception caught: "+e.getMessage());
		}
		
	}
	
	

}
