package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class TC01_ValidateLogin extends TestBase{
	LoginPage lp=new LoginPage(driver);
	HomePage hp=new HomePage(driver);
	
	@Parameters({"username","password"})
	@Test
	public void validateLogin(String username, String password) {
//		"shafurul", "0FSY4J"
		lp.verifyAllButtons();
		lp.login(username,password);
		hp.validateWelcomeMessage(username);
		hp.logout();
	}
	
	
	
}
