package findelements_method;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ullist {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	   driver.get("https://www.google.com/?gws_rd=ssl");
	   Thread.sleep(1000);
	  driver.findElement(By.name("q")).sendKeys("applewatch");
	  List<WebElement> list = driver.findElements(By.xpath("//ul[@class='erkvQe']//li"));
	  
	  for( WebElement l:list)
	  {
			System.out.println(l.getText());  
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	}

}
