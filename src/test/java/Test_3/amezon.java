package Test_3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class amezon  {
	
	
     WebDriver driver;
	@Test
	@BeforeMethod
	
	public void test_1() throws IOException {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
WebElement	txt=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
txt.sendKeys("Mobile");

		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		driver.findElement(By.xpath("//span[@class='a-truncate-cut']")).click();
			
		//path of screenshot
		String path="C:\\Users\\dell\\eclipse-workspace\\Bug12_pune\\screenshot1";
	String tm=RandomString.make(3);
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destn = new File (path+"\\+tm+.png");
        FileUtils.copyFile(src, destn);
        
	
        
        
	
        //verify
        
 WebElement India =driver.findElement(By.xpath("//img[@alt='Amazon App']"));
        
        String Army =India.getText();   
        String Actual= Army;
        String Expect= "Shopping made easy | Download the app";
        
        // use Assert
       Assert.assertEquals(Actual, Expect);
        System.out.println("Testing done");
	
	}        // Assert 
  
    		//String expected="Happy Independance Day";
    		//String actual="Happy Independance Day";  //if name spelling was changed in that condition test will show as fail status. 
    		
  		//assertEquals(actual, expected);
    		
    		//System.out.println("Happy Independance Day");	
        
        @AfterMethod
        public void AM() {
        
        	driver.close();
        }
	}
        
        
    		
    	
    		
        
        
		
	
	
	
	


