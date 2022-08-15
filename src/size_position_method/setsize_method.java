package size_position_method;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setsize_method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		
		//1.create object of dimension class
		
		org.openqa.selenium.Dimension d =new org.openqa.selenium.Dimension(500, 100);
		
		//2 call setsize method
		
		System.out.println(driver.manage().window().getSize());
		driver.manage().window().setSize(d);
	}
	
	
	

}
