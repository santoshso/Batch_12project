package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autoinst_5 {

	public static void main(String[] args) {
		
               WebDriverManager.chromedriver().setup();
               WebDriver driver=new ChromeDriver();
               driver.get("https://www.flipkart.com/");
               driver.manage().window().maximize();
               
  WebElement txt_email= driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
  
  txt_email.sendKeys("test@gmail.com");
 WebElement btn_password=driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
 
 btn_password.sendKeys("123456");
 
 
WebElement btn_login= driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));

btn_login.click();
 
 
               
               
	

	}
}
