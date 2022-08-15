package Kite_base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Kite_utility.utility_amazone;

public class base_amazone
{
     protected WebDriver driver;
     
	public void openbrowzer() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get(utility_amazone.readpropertyfiledata("url"));
	     utility_amazone.waits(driver, 1000);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
