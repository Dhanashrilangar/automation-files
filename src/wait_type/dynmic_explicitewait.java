package wait_type;

import org.bouncycastle.oer.its.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dynmic_explicitewait {

	public static void main(String[] args) {
		
		//2. Explicit wait:
			  // Applicable: single element
			  // 1 parameter: time value(seconds)
			  // 2 parameter: Condition (isselected, isdisplayed, isenabled)

		System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(200));
		
		 WebElement name = driver.findElement(By.id("name"));
				name .sendKeys("dhanashri");
		
		//1.create webdriver wait object store in ref variable pass argument duration in sencod
		
		WebDriverWait w=new WebDriverWait(driver,java.time.Duration.ofSeconds(200));
		
		//2. call untilclass and with expectedconditions method pass condition 
		//if condition satisfy it will be release 
		
		//w.until(ExpectedConditions.visibilityOf(name));
		w.until(ExpectedConditions.titleContains("dhanashri"));
		driver.close();
		
		
		
		
	}

}
