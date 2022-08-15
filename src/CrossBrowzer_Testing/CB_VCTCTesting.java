package CrossBrowzer_Testing;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import webdriver_method.webdriver_methods;

public class  CB_VCTCTesting {

	@ Parameters ("browzername")
  @Test
  public void VCTC_Launch(String browzername) 
  {
		WebDriver driver= null;


		//for chrome browzer
		if(browzername.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(browzername.equals("Firefox"))
		{
		//for firefox browzer
		System.setProperty("webdriver.gecko.driver", "F:\\Daily_Notes\\geckodriver.exe");
		
		driver= new FirefoxDriver();
		
		}
		driver.manage().window().maximize();	
		driver.get("https://vctcpune.com/selenium/practice.html");
		
  }
}
