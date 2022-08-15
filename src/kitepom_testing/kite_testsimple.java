package kitepom_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kite_testsimple {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
	    Thread.sleep(1000);
		
	  WebElement USERID = driver.findElement(By.id("userid"));
	  WebElement PASSWORD = driver.findElement(By.id("password"));
	  WebElement LOGIN = driver.findElement(By.xpath("//button[@type='submit']"));
		USERID.sendKeys("ELR321");
		PASSWORD.sendKeys("Dhana1111");
		LOGIN.click();
	    Thread.sleep(1000);

		WebElement PIN = driver.findElement(By.id("pin"));
		WebElement CONTINUE = driver.findElement(By.xpath("//button[@type='submit']"));
		PIN.sendKeys("982278");
		CONTINUE.click();
	    Thread.sleep(1000);
	    
	 WebElement ID = driver.findElement(By.xpath("//span[@class='user-id']"));
	 String exceptedid = "ELR321";
	 String actualid = ID.getText();
	    Thread.sleep(1000);

	 if(exceptedid.equals(actualid))
	 {
		 System.out.println("Test case is pass");
	 }
	 else {
		 System.out.println("Test case is fail");
	 }

		ID.click();
	    Thread.sleep(1000);
      WebElement LOGOUT = driver.findElement(By.xpath("//a[@target='_self']"));
		LOGOUT.click();
	    Thread.sleep(1000);
       driver.close();
		
		
		
		
		
		
		
		
		
	}

}
