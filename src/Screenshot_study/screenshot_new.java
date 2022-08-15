package Screenshot_study;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenshot_new {
	public static void main(String[] args) throws InterruptedException, IOException {
System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	   driver.get("https://www.flipkart.com/");
	   Thread.sleep(1000);
// taking screenshot of full page
	   
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String Random = RandomString.make(3);
	File dest=new File("F:\\Daily_Notes\\java notes\\selenium notes\\screenshot\\" +Random +"image.png");
	FileHandler.copy(src, dest);
	   Thread.sleep(2000);

	   //taking screenshot of particular part on page
	   File src2 = driver.findElement(By.className("kJjFO0 _3DIhEh")).getScreenshotAs(OutputType.FILE);
	   File dest2=new File("F:\\Daily_Notes\\java notes\\selenium notes\\screenshot\\praticular.jpg");
	   FileHandler.copy(src2, dest2);

   //use hiddendivision popup method
	   
	   driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	   Thread.sleep(1000);
	
	}

}
