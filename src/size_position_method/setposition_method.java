package size_position_method;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setposition_method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		
		//1.to set position method create object of point class and store in one referance variable
		
		Point p=new Point(400, 700);
		
		//2.call setpoint method
		
		System.out.println(driver.manage().window().getPosition());//current position
		
		driver.manage().window().setPosition(p);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
