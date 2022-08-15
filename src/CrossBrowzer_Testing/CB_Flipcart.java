package CrossBrowzer_Testing;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class CB_Flipcart {
	@Parameters ("browzername")
  @Test
  public void flipcart_launch(String browzername) 
  {
	  WebDriver driver=null;
	  
	  if(browzername.equals("chrome"))
	  {
	  System.setProperty("webdriver.chrome.driver", "F:\\\\Daily_Notes\\chromedriver.exe");
	   driver=new ChromeDriver();
	  
	  }
	  else if(browzername.equals("Firefox"))
	  {
	  System.setProperty("webdriver.gecko.driver", "F:\\\\Daily_Notes\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  
	  }
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	  
	  driver.get("https://www.flipkart.com/");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
