package tests;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class TestBase {
	WebDriver driver;

	@Parameters({"browser"})
	@BeforeSuite
	  public void initializeDriver(String browser) {
		System.out.println("Before Suite");
		  
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Documents\\Selenium\\dependencies\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\PC\\Documents\\Selenium\\dependencies\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else if(browser.equalsIgnoreCase("headless")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("headless");
			driver = new ChromeDriver(options);
		}
	  }
	
	@Parameters({"url"})
	@BeforeClass
	public void launchApp(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void afterMethod(Method method) {
		System.out.println(method.getName());
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

	  @AfterSuite
	  public void tearDown() {
		  driver.quit();
	  }
}
