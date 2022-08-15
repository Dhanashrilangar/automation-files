package action_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement_method {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);		
		//move to element method
		//1. create object of actions class and store in ref variable
	Actions act = new Actions(driver);
	Thread.sleep(1000);		
	act.click(); //return type is click where mouse is allready present
		
	WebElement contactUS = driver.findElement(By.xpath("//a[text()='Contact Us']"));
		
	act.moveToElement(contactUS).perform(); //1 way to click method
	act.click().perform();
	Thread.sleep(1000);		
    act.click(contactUS).perform();         //2 way of click method
	Thread.sleep(1000);		
	act.moveToElement(contactUS).click().build().perform(); //3 way of click method
	Thread.sleep(1000);		
    driver.findElement(By.id("name")).sendKeys("dhanashri");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
