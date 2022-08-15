package Iframe_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchtoiframe_use {

	public static void main(String[] args) throws InterruptedException {

     System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	    driver.get("https://vctcpune.com/selenium/practice.html");
		
	    Thread.sleep(1000);
		
	    driver.switchTo().frame("iframe-name");
	  Thread.sleep(2000);

	driver.findElement(By.xpath("(//a[text()='Velocity Foundation'])[1]")).click();
		
    Thread.sleep(2000);

	driver.switchTo().defaultContent();
    Thread.sleep(2000);

		driver.findElement(By.id("autocomplete")).sendKeys("welcome");
		
		
		
		
		
		
		
		
		
	}

}
