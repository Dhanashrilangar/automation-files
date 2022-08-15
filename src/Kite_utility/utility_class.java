package Kite_utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;



public class utility_class 
{

	public static String readexcel_data(int rownum,int cellnum) throws EncryptedDocumentException, IOException
	{
		File myfile = new File("F:\\Daily_Notes\\PRACTICE EXCEL.xlsx");
		Sheet kitesheet = WorkbookFactory.create(myfile).getSheet("kitetest");
	    String value = kitesheet.getRow(rownum).getCell(cellnum).getStringCellValue();
	    
	    return value;
	
	}
	
	public static void capture_sc(WebDriver driver , String TCID) throws IOException
	{
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("F:\\Daily_Notes\\java notes\\selenium notes\\screenshot\\"+TCID +"image.png");
	FileHandler.copy(src, dest);
	
	Reporter.log("screenshot got");
	}
	
	
		public static Timeouts waits( WebDriver driver,int seconds)
		{
		 Timeouts wait = driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        return wait;
		}
	
	
	
	
	
	
}
