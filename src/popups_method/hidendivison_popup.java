package popups_method;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class hidendivison_popup {

	    public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		
    driver.findElement(By.name("q")).sendKeys("i phone 12");
    
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(1000);	
    driver.findElement(By.xpath("//button[@type='submit']")).click();
   Thread.sleep(1000);

//	    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	    String random = RandomString.make(4);
//	    File dest=new File("F:\\Daily_Notes\\java notes\\selenium notes\\screenshot\\"+ random +"image.jpg");
//	    FileHandler.copy(src, dest);
	
	
	
	
		
	}

}
