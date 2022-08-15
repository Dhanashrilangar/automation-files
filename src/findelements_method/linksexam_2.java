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

public class linksexam_2 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	   driver.get("https://www.flipkart.com/");
	   Thread.sleep(1000);
	   //handle hiddendivision popup
	   driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	   Thread.sleep(1000);
       // find links on unorderlist box
	   driver.findElement(By.name("q")).sendKeys("gifts");
	   List<WebElement> rr = driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1 _38UFBk']"));
	 for(WebElement a:rr)
	 {
		 System.out.println(a.getText());
	 }
	 //handle dynamic review
	 driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
    Thread.sleep(1000);
    WebElement review = driver.findElement(By.xpath("((//div[@class='_4ddWXP'])[1]//span)[2]"));
    Thread.sleep(1000);
    System.out.println(review.getText());
	 //take screenshot of result page
	File result = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String Random = RandomString.make(3);
	File store=new File("F:\\Daily_Notes\\java notes\\selenium notes\\screenshot\\result"+Random+".jpg");
	FileHandler.copy(result, store);
	
	}

}
