package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dragdrop {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		
		WebElement btn_src=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		
		WebElement destn =driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		act.dragAndDrop(btn_src, destn).build().perform();
		
			
    WebElement btn_try=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		
		WebElement desi =driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
	act.dragAndDrop(btn_try, desi).build().perform();
	
		
    WebElement btn_fy=driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		
		WebElement dek =driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
	act.dragAndDrop(btn_fy, dek).build().perform();
		
		

    WebElement btn_fi=driver.findElement(By.xpath("((//a[@class='button button-orange'])[2]"));
		
		WebElement dejj =driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
	act.dragAndDrop(btn_fi, dejj).build().perform();
		
		
		
		
		

	}

}
