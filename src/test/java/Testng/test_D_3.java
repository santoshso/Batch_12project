package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_D_3 {
	
	WebDriver driver;

	   @BeforeMethod
	   public void Setup() {
		   
		   //browser open code
		   WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		   
		   driver.get("https://www.facebook.com/");
		   driver.manage().window().maximize();
		   
	   }
	 
	   
	
		   
	   @AfterMethod
	   public void tearDown() {
		   //browser close code
		driver.close();  
		   
		   
		   
	   }
			   
	
	
	
}
