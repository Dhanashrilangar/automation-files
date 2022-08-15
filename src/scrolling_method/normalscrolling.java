package scrolling_method;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class normalscrolling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		
		//1. first we need to type cast javascritexcutor interface with driver
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(1000);

		//2. use excutscript method to scroolling
		
		js.executeScript("window.scrollBy(400,600)");
		
		
		
		
		
		
		
	}

}
