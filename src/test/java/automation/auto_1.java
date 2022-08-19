package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class auto_1 {
	

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver ();
		driver.get("https://www.facebook.com/");  ///url
		driver.manage().window().maximize();
		
	String	title=driver.getTitle();
		System.out.println(title);
		
     String url=driver.getCurrentUrl(); // facebook log in or sing up
     
     driver.navigate().to("https://mvnrepository.com/");
     Thread.sleep(5000);
     driver.navigate().back();
     Thread.sleep(5000);
     driver.navigate().forward();
     Thread.sleep(5000);
     driver.navigate().refresh();
     
     driver.close();
     
     
     
     
     
     
     
     
	}

}
