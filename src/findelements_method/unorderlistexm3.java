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

public class unorderlistexm3 {

	public static void main(String[] args) throws InterruptedException, IOException {

System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	   driver.get("https://www.google.com/?gws_rd=ssl");
	   Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("Dress");
		Thread.sleep(1000);
		List<WebElement> dress = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		System.out.println(dress.size());
		for(WebElement d:dress)
		{
			System.out.println(d.getText());
		}
		for(WebElement d:dress)
		{
			String x = "dress for girls";
			String y = d.getText();
			if(x.equals(y))
			{
			d.click();
			break;
			}	
		}
		driver.findElement(By.linkText("Images")).click();
		Thread.sleep(1000);
		
           //take screenshot of image page
		
           File a = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
           String random=RandomString.make(4); 
           File B = new File("F:\\Daily_Notes\\java notes\\selenium notes\\screenshot\\dress "+random+".jpg");    
           FileHandler.copy(a, B);
          
        

           
		
		
		
		
		
		
		
		
	}

}
