package automation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class screenshot {

	public static void main(String[] args) throws Exception {
		
              WebDriverManager.chromedriver().setup();
              WebDriver driver = new ChromeDriver();
              driver.get("https://www.facebook.com/login/");
              driver.manage().window().maximize();
              
              WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
             
              email.sendKeys("test@afdhhhf");
              
              WebElement password =driver.findElement(By.xpath("//input[@id='pass']"));
              password .sendKeys("12345566");
              
              WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
              login.click();
              
              String  path="C:\\Users\\dell\\eclipse-workspace\\Bug12_pune\\src\\test\\java\\automation\\screenshot";
              String rm= RandomString.make(2);
              TakesScreenshot ts = (TakesScreenshot)driver;
              File src =ts.getScreenshotAs(OutputType.FILE);
              File destn = new File(path+"\\+rm.png");
              FileUtils.copyFile(src, destn);
              
              driver.close();
              
              
              
              
              
              
              
              
	}

}
