package findelements_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicelement_handleexp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.flipkart.com/");
	    Thread.sleep(1000);
	    
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();		
	    Thread.sleep(1000);
	    
        driver.findElement(By.name("q")).sendKeys("hplaptop");
        
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	    Thread.sleep(3000);
	    
	// WebElement laptopreview = driver.findElement(By.xpath("((//div[@class='_3pLy-c row'])[1]//span)[6]"));
	WebElement laptopreview = driver.findElement(By.xpath("((//div[@class='_3pLy-c row'])[1]//span[1])[1]"));

	 System.out.println("review on HP 14s Core i3 11th Gen-8 "+laptopreview.getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
