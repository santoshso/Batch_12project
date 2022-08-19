package Testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testfacebook extends test_D_3 {
	
	
	
	
	@Test(priority=0)
public void facebook() {
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Test@12344");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.close();
		
	}
	@Test(priority=1)
public void Instgram() {
	
	driver.get("https://www.instagram.com/accounts/login/");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Test@12344");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
	
	driver.close();
		
	}
}
	
	
	
	
	
	
	
	


