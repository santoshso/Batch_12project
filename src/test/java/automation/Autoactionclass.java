package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autoactionclass {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
	
		//one click
	WebElement sel =driver.findElement(By.xpath("//a[@data-toggle='dropdown']"));	
	Actions act = new Actions(driver);
	act.moveToElement(sel).click().build().perform();
	Thread.sleep(5000);
	
	// Right click on element on web page
	
	WebElement right =driver.findElement(By.xpath("//span[text()='right click me']"));
	act.contextClick(right).click().build().perform();
	
	// double click on element on web page

WebElement Double=	driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	act.doubleClick(Double).click().build().perform();
	
	driver.close();
		

	}
	
	}

