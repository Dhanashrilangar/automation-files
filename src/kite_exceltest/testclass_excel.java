package kite_exceltest;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testclass_excel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		 File practice_excel=new File("F:\\Daily_Notes\\PRACTICE EXCEL.xlsx");
	       Sheet kitesheet = WorkbookFactory.create(practice_excel).getSheet("kitetest");
	          String UID = kitesheet.getRow(0).getCell(0).getStringCellValue();
	        String PWD = kitesheet.getRow(0).getCell(1).getStringCellValue();
	       String PIN = kitesheet.getRow(0).getCell(2).getStringCellValue();
		    Thread.sleep(1000);
		    System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://kite.zerodha.com/");
			    Thread.sleep(1000);
			    
		    class1_parameterisation class1=new class1_parameterisation(driver);
		    class1.userid(UID);
		    class1.password(PWD);
		    class1.login();
		    Thread.sleep(1000);

		    class2_parameterisation class2=new class2_parameterisation(driver);
		    class2.pin(PIN);
		    class2.loginbutton();
		    Thread.sleep(1000);

		    class3_parameterisation class3=new class3_parameterisation(driver);
		    class3.vlidateuser(UID);
		    class3.logout();
		    driver.close();
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
	}

}
