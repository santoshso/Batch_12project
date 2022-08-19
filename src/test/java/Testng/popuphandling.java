package Testng;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class popuphandling {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		
		String parentindowAdd =driver.getWindowHandle();
		System.out.println(parentindowAdd);
		
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set <String> AllAddress =driver.getWindowHandles();
		
		
		System.out.println(AllAddress);
		
		Iterator <String> it=AllAddress.iterator();
		
		while(it.hasNext()) {
			
			String ChildWindowAdd=it.next();
					
					if(!parentindowAdd.equals(ChildWindowAdd)) {
						
						
						driver.switchTo().window(ChildWindowAdd);
						
						
						driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("12345678");
						
						
						
						driver.close();
						
					}	
			
			
		}
		
		driver.switchTo().window(parentindowAdd);
		driver.close();
		
		}
		
	}


