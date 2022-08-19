package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Auto2 {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//identify the webelement-------->locators--->id
		
		WebElement txt_email=driver.findElement(By.id("email"));
		txt_email.sendKeys("test@gmail.com");
		WebElement txt_password=driver.findElement(By.id("pass"));
		txt_password.sendKeys("12345678");
		
		// identify Webelement ----name locator.
		
		WebElement btn_login=driver.findElement(By.name("login"));
		btn_login.click();
	
   String     title=driver.getTitle();
   System.out.println(title);
   driver.close();        
		
		
		
		

	}

}
