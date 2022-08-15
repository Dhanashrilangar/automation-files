package Kite_utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class utility_amazone 
{
	
	public static String readpropertyfiledata(String key) throws IOException
	{
		Properties prop = new Properties();  //create object of property class
		FileInputStream myfile =new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\SeliniumStudy\\Propertyfile.properties");//getpath of i/o of file
		 prop.load(myfile); //load the propetyfile by using load method\
		   		 String value = prop.getProperty(key);
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
