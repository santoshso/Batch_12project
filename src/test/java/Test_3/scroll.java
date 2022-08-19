package Test_3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scroll {
	
	
	@Test
	public void Test_2() throws Exception {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	driver.manage().window().maximize();
	
	// scroll by pixel
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	js.executeScript("window.scrollBy(0,500)", "");
	
	Thread.sleep(4000);
	
	js.executeScript("window.scrollBy(0,-500)", "");
	
	Thread.sleep(5000);
	// scroll by element
	
WebElement	english=driver.findElement(By.xpath("//a[@class='_sv4']"));

js.executeScript("arguments[0].scrollIntoView()", english);
	
	
	
	}

		public static void custom_scrollByElement(WebDriver driver,WebElement element) {
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			js.executeScript("arguments[0].scrollIntoView()",  element);
			
		}
		
	public static void custom_handleDropDown (WebElement element, String text ) {
		
	Select sel = new Select (element);
		sel.selectByVisibleText(text);
		
	}
	
	
	
	

}
