package Verification_byTestNG;
import org.testng.annotations.Test;
import com.beust.jcommander.Parameter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import static org.testng.Assert.assertEquals;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class KiteTest_bytestng {
	WebDriver driver=null;
	File myfile;
	Sheet kitesheet;
	Kite_page1 page1;
	Kite_page2 page2;
	Kite_page3 page3;
    @Parameters("browzername")
	@BeforeClass
  public void lauch_browzer(String browzername) throws EncryptedDocumentException, IOException
  {
	if(browzername.equals("chrome"))
	{
    	System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");
	driver=new ChromeDriver();
	}
	else if(browzername.equals("Firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "F:\\Daily_Notes\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	myfile=new File("F:\\Daily_Notes\\PRACTICE EXCEL.xlsx");
	kitesheet = WorkbookFactory.create(myfile).getSheet("kitetest");
	Reporter.log("Browzer launch",true);
	  page1=  new Kite_page1 (driver);
	  page2 = new Kite_page2(driver);
	  page3 = new Kite_page3(driver);
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  }
    @Parameters("browzername")
  @BeforeMethod
  public void kiteloginpage (String browzername) 
  {
	  Reporter.log("login kite site",true);
	  page1.userid(kitesheet.getRow(0).getCell(0).getStringCellValue());
	  page1.password(kitesheet.getRow(0).getCell(1).getStringCellValue());
	  page1.login();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
      page2.pin(kitesheet.getRow(0).getCell(2).getStringCellValue());
      page2.loginbutton();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  }
   @Parameters("browzername")
  @Test
  public void ValidateUser(String browzername)
  {
	String expectedUser = (kitesheet.getRow(0).getCell(0).getStringCellValue());
	 String actualresult = page3.vlidateuser();
	 Reporter.log("validate user id tc is pass",true);
	 assertEquals(expectedUser,actualresult);
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
  }
   @Parameters("browzername")
@AfterMethod
  public void logoutkite(String browzername) throws InterruptedException
  {
	Reporter.log("logout kite",true);
	page3.logout();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
  }
   @Parameters("browzername")
  @AfterClass
  public void closebrowzer(String browzername) 
  {
	  Reporter.log("close browzer",true);
	  driver.close();
  }

}
