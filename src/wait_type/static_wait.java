package wait_type;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class static_wait {

	public static void main(String[] args) throws InterruptedException {

		//Static wait/java wait;
		//Wait time is fixed, irrespective of condition. 
		//Script will be hold for mentioned seconds.
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);             //static wait/java wait
		
		
		
		
		
		
		
		
		
	}

}
