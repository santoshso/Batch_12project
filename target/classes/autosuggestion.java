import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autosuggestion {

	public static void main(String[] args) {
           
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver ();
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 
		 Webelement txt_search =driver.findElement(By.xpath("//input[@name='q']));

				 txt_search.sendKeys("maven");
				 
				
				 
				 
	}

}
