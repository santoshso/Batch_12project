package automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excle {

	public static void main(String[] args) throws Exception {
	
	//open browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
		
		//identify the webelement
		
		WebElement txt_email =driver.findElement(By.xpath("//input[@id='email']"));
		
		WebElement txt_password =driver.findElement(By.xpath("//input[@id='pass']"));
		
		//txt_email.sendKeys("Test");

		//how to fetch excel from excel
		String path = "C:\\Users\\dell\\eclipse-workspace\\Bug12_pune\\testdata\\data1.xlsx";
		FileInputStream fis= new FileInputStream(path);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		
		
		// fetch string record from excel
		String data_1=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data_1);
		
		String data_2=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(data_2);
		
		String data_3=wb.getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
		System.out.println(data_3);
		
		
		//sending test data from excel to Webelement
		txt_email.sendKeys(data_1);
		txt_password.sendKeys(data_2);
		
		// numerics data fetching
		
		double data_4=wb.getSheet("Sheet1").getRow(0).getCell(3).getNumericCellValue();//123456
		System.out.println(data_4);
		
		String data_4_S=String.valueOf(data_4);
		String data =data_4_S.replace(".0", " ");
		System.out.println(data);
		txt_password.sendKeys(data);
		
		
	


		
		

		
		
		

	}

}
