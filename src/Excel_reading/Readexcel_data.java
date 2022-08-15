package Excel_reading;

import java.io.File;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readexcel_data {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException  {

 File Excelsheet = new File("F:\\Daily_Notes\\PRACTICE EXCEL.xlsx");
 String value = WorkbookFactory.create(Excelsheet).getSheet("sheet 1").getRow(0).getCell(0).getStringCellValue();
 System.out.println(value);

 String value1 = WorkbookFactory.create(Excelsheet).getSheet("sheet 1").getRow(1).getCell(1).getStringCellValue();
 System.out.println(value1);
		
 System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");
 WebDriver driver= new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://vctcpune.com/selenium/practice.html");
 Thread.sleep(1000);	
		
 driver.findElement(By.id("autocomplete")).sendKeys(value1);
			
	}

}
