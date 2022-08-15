package Kite_base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Kite_utility.utility_class;

public class Base_class{

	protected WebDriver driver=null;
	
	
public void openbrowzer()
{
	System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

