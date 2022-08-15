package popups_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddenpopup_practice {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");
		
	WebDriver  driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(1000);
		
//		driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]")).sendKeys("7498404919");
//		Thread.sleep(1000);
//        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Dhanashri@123");
//		Thread.sleep(1000);
	   // driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        //Thread.sleep(1000);
        //driver.findElement(By.name("_2KpZ6l _2doB4z")).click();
		//Thread.sleep(2000);
        
           driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
           Thread.sleep(1000);
          
   	
		
	}

}
