package Iframe_method;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class iframe_assignment {
	public static void main(String[] args) throws InterruptedException, IOException {
		
System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	    Thread.sleep(1000);
		
	    driver.switchTo().frame("frame1");
	    Thread.sleep(1000);
        driver.findElement(By.tagName("input")).sendKeys("selenium practice");
	    Thread.sleep(2000); 
	    
	   driver.switchTo().frame("frame3");
	    Thread.sleep(1000);
	   System.out.println(driver.findElement(By.id("a")).isSelected());
	   driver.findElement(By.id("a")).click();
	    Thread.sleep(2000);

		driver.switchTo().defaultContent();
	    Thread.sleep(2000);
        driver.switchTo().frame("frame2");
        WebElement Animals = driver.findElement(By.id("animals"));
		Animals.click();
		Select s = new Select(Animals);
		s.selectByIndex(2);
	    Thread.sleep(1000);
        driver.switchTo().defaultContent();
	    
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE)		;
		String random = RandomString.make(3);
	    File destination=new File("F:\\Daily_Notes\\java notes\\selenium notes\\screenshot\\"+random +"image.jpg");
	    FileHandler.copy(source, destination);

	
	}

}
