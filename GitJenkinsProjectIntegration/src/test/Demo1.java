package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo1 {
	
	WebDriver driver;
	
	@BeforeSuite	
	@Parameters({ "browsername", "url" })
	public void setup(@Optional("chrome")String browsername,String url) {	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rokas.jonusas\\Desktop\\Testing\\Selenium\\chromedriver\\chromedriver.exe");
		
		switch (browsername) {
		case "IE":
		//Code to initialize webdriver instance
			driver.get(url);
			break;
		case "Firefox":
			//Code to initialize webdriver instance
			driver.get(url);
			break;
		case "chrome":
			//Code to initialize webdriver instance
			driver=new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			break;	
		}	
	}
	
	 
	  @Test
	  public void login() 
	  {	 
		   //Code to Login to the application
			  
		   driver.findElement(By.id("body_txtUserID")).sendKeys("donhere");
		   driver.findElement(By.id("body_txtPassword")).sendKeys("don@123");
		   driver.findElement(By.id("body_btnLogin")).click();
	      
	            try
				{
		         //verifying the presence of webelement
				
				}
				catch(Exception e)
				{
					System.out.println("Login failure");
					
				}
				
				
		  }
		
	  

	
	  @AfterSuite
	  public void tearDown() {
		  driver.quit();	  
	  }

}
