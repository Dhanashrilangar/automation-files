package action_method;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard_method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		Thread.sleep(1000);		
	    Actions act = new Actions(driver);
	    Thread.sleep(1000);		
	
		WebElement day = driver.findElement(By.id("day"));
		act.click(day).perform();
		for(int i=1;i<=2;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();

		}
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		act.sendKeys(Keys.ARROW_DOWN).perform();
		
		act.sendKeys(Keys.ENTER).perform();
	    Thread.sleep(1000);		

//		WebElement month = driver.findElement(By.id("month"));
//		act.click(month).perform();
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		act.sendKeys(Keys.ENTER).perform();
//	    Thread.sleep(1000);		
//
//		WebElement year = driver.findElement(By.id("year"));	
//		act.click(year).perform();
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		act.sendKeys(Keys.ENTER).perform();
//	    Thread.sleep(1000);		
//		System.out.println("date is "+day+month+year);
//		
//		
		
		
		
		
		
		
		
		
	}

}
