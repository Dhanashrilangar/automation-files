package findelements_method;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linksOnWebpage {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	   driver.get("https://www.flipkart.com/");
	   Thread.sleep(1000);
	   
	   List<WebElement> links = driver.findElements(By.tagName("a"));
	   
	   for(WebElement l:links)
	   {
		   System.out.println(l.getText());
	   }
	
	}

}
