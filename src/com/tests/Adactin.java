package com.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public class Adactin {
	WebDriver driver;
	
	
  @Test
  public void validateLogin() {
	  
  }
  
//  @BeforeMethod
//  public void launchApp(String url) {
//	  driver.get(url);
//	  driver.manage().window().maximize();
//  }
  
  @Parameters("url")
  @BeforeSuite
  public void initializeDriver(String url) {
	  System.out.println("Before Suite");
	  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Documents\\Selenium\\dependencies\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.get(url);
		  driver.manage().window().maximize();
		
  }

  @AfterSuite
  public void closeBrowser() {
//	  System.out.println(result.getStatus());
	  System.out.println("After Suite");
	  driver.quit();
  }

}
