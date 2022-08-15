package findelements_method;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class unorderlistexmple2 {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	   driver.get("https://www.google.com/?gws_rd=ssl");
	   Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("oneplus");
		Thread.sleep(1000);
		  
List<WebElement> oneplusmobile = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));


System.out.println(oneplusmobile.size());
		   
		   
		   for(WebElement o:oneplusmobile)
		   {
			   System.out.println(o.getText());
		   }
		
		   for(WebElement o:oneplusmobile)
		   {
			 String ex = "oneplus nord";
			String ac = o.getText();
			
			if(ex.equals(ac))
			{
				o.click();
				break;
	
			}
			
		   }
		driver.findElement(By.linkText("News")).click();	
	}

}
