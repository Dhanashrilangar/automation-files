package wait_type;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fluent_wait {

	public static void main(String[] args) {

		//3. Fluent wait:
			//   Applicable: single element
			//   1 parameter: time value(seconds)//1000ms
			//   2 parameter: Condition (isselected, isdisplayed, isenabled)
			//   3 frequency: time(time in sec)- 5 m sec10ms

		System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		
		 WebElement name = driver.findElement(By.id("name"));
			name .sendKeys("dhanashri");
		
		//1. create object of fluent wait and store in one ref variable 
		
		FluentWait t= new FluentWait(driver);
		
		//2.call fluentclass method and give time and cndition
		
		t.withTimeout(Duration.ofSeconds(1000)).withMessage("dhanashri");
		t.withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(100));
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
