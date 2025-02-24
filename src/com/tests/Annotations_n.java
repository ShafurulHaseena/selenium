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

public class Annotations_n {
	WebDriver driver;
	
  @Parameters({"login"})
  @Test
  public void login(@Optional("dummy") String parameter) {
	  System.out.println("login");
//	  driver.get("https://www.google.com/");
	  System.out.println(parameter);
  }
  
  @Parameters({"logout"})
  @Test
  public void logout(@Optional("dummy") String parameter) {
	  System.out.println("logout");
	  System.out.println(parameter);
  }
  
  @Parameters({"signup"})
  @Test
  public void signup(@Optional("dummy") String parameter) {
	  System.out.println("signup");
	  System.out.println(parameter);
  }
	

  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
		 System.out.println("take screenshot");

  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite");
	  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Documents\\Selenium\\dependencies\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();	
		
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite");
	  driver.quit();
  }

}
