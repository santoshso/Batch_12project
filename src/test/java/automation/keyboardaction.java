package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyboardaction {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();

		Actions act = new Actions (driver);
		WebElement txt_eamil=driver.findElement(By.xpath("//input[@id='email']"));
		act.keyDown(txt_eamil, Keys.SHIFT).sendKeys("test").keyUp(Keys.SHIFT).build().perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		WebElement txt_password =driver.findElement(By.xpath("//input[@id='pass']"));
		
		txt_password.click();
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		WebElement btn_login =driver.findElement(By.xpath("//button[@name='login']"));
		 
		 btn_login.sendKeys(Keys.ENTER);
		
		
		
		
		
		
		
	}

}
