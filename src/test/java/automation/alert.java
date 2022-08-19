package automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert {

	public static void main(String[] args) throws Exception {
	
               WebDriverManager.chromedriver().setup();
               WebDriver driver = new ChromeDriver();
               driver.get("https://demo.guru99.com/test/delete_customer.php");
               driver.manage().window().maximize();
               
               
               WebElement txt_email =driver.findElement(By.xpath("//input[@name='cusid']"));
               txt_email.sendKeys("123456789");
               
               WebElement btn_submit=driver.findElement(By.xpath("//input[@name='submit']"));
               
               btn_submit.click();
               
               //driver nevigate alert window
               Alert alt = driver.switchTo().alert();
               System.out.println(alt.getText());
               
               //alt.dismiss();
               alt.accept();
               
               Thread.sleep(3000);
               
               String txt=alt.getText();
               System.out.println(txt);
               alt.accept();
               driver.close();
               
               
               
               
               
               
	}

}
