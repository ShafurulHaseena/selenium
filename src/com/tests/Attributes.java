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

public class Attributes {
	
  @Test(groups = {"g1","g2"})
  public void login() throws InterruptedException {
	  System.out.println("login");
//	  driver.get("https://www.google.com/");
  }

  @Test(groups = {"g2"})
  public void logout() {
	  System.out.println("logout");
  }
  
  @Test(groups = {"g3"})
  public void signup() {
	  System.out.println("signup");
  }
	

}
