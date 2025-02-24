package com.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;

public class DataProvider {
	WebDriver driver;
	
	@DataProvider(name = "loginData")
    public Object[][] provideLoginData() {
        return new Object[][] {
            { "user1", "password1" },
            { "user2", "password2" },
            { "user3", "password3" }
        };
    }
	
	 @Test(dataProvider = "loginData")
	    public void testLogin(String username, String password) {
		 System.out.println("user:"+username);
		 System.out.println("password:"+password);
	       
	    }

}
