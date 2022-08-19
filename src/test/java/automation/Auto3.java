package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Auto3 {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement txt_Email=driver.findElement(By.xpath("//input[@id='email']"));
		txt_Email.sendKeys("test@gmail.com");
		
   	    WebElement txt_password=driver.findElement(By.xpath("//input[@id='pass']"));
   	    txt_password.sendKeys("123456");
   	    
   	      WebElement  btn_login=driver.findElement(By.xpath("//button[@ name='login']"));
   	   btn_login.click();
   	   
   	
		
				
		
	

	}

}
