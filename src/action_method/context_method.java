package action_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class context_method {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	    Actions act = new Actions(driver);
	    Thread.sleep(2000);	
	WebElement rightclick =driver.findElement(By.xpath("//span[text()='right click me']"));
	act.contextClick(rightclick).perform();
    Thread.sleep(1000);	

	WebElement quit = driver.findElement(By.xpath("(//ul[@class='context-menu-list context-menu-root']/li)[7]"));
	act.doubleClick(quit).perform();

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
