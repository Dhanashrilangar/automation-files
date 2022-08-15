package wait_type;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dyanamic_implicitewait {

	public static void main(String[] args) {

	     //1.implicite wait;
		//Applicable: complete webpage
		// 1 parameter: time value (seconds)
		//2000ms 100ms1900 release wait time

		System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
	//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(120));
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(02));
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
