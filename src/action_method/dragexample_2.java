package action_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragexample_2 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
        act.dragAndDrop(src, dest).perform();
		Thread.sleep(1000);
		
	    WebElement src2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement dest2 = driver.findElement(By.xpath("//li[@class='placeholder']"));
		act.dragAndDrop(src2, dest2).perform();
		Thread.sleep(1000);

		 WebElement src3 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement dest3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		act.dragAndDrop(src3, dest3).perform();

		Thread.sleep(1000);
			
       

		
		
		
		
		
	}

}
