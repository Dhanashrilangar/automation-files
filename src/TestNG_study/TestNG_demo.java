package TestNG_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_demo {
  @Test
  public void demo1()
  {
	  System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
	  
	  
	  
	  
	  
  }
}
