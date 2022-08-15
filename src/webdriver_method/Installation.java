package webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Installation {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\daily notes\\chromedriver.exe");
		
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
	}

}
