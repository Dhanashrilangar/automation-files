package findelements_method;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class HandleUL {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	   driver.get("https://www.google.com/?gws_rd=ssl");
	   Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("apple watch");
	   Thread.sleep(1000);
	
		List<WebElement> watch = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
		System.out.println(watch.size());
		
		for(WebElement w:watch)
		{
			System.out.println(w.getText());
		}
		for(WebElement w:watch)
		{
			
			String ex = "apple watch series 5";
			String ac = w.getText();
			
			if(ac.equals(ex))      //check ex=ac 
			{
			w.click();
			break;
			}
		}	
			driver.findElement(By.linkText("Images")).click();
			
File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
String random = RandomString.make(3);
File des = new File("F:\\Daily_Notes\\java notes\\selenium notes\\screenshot\\image"+random+".jpg");	
		FileHandler.copy(src, des);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
