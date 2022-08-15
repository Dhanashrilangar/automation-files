package size_position_method;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class size_method {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		
		//1. for size method we need create object of dimention class and store in ref variable
		
		Dimension d=new Dimension(200, 600);
		
		//2. call size method 
		
		System.out.println(driver.manage().window().getSize()); //get current size of page in concole
		
		driver.manage().window().setSize(d);
		
		
		
		
	}

}
