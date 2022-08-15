package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeymethod_use {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		
		//1. Sendkeys():  This method is use to enter value in the input/text field
		
		//driver.findElement(By.xpath("//input[@id='name']")).sendKeys("welcome");
		Thread.sleep(1000);
		
		//2. Clear():This method is use to clear value in the text field.
		
		//driver.findElement(By.xpath("//input[@id='name']")).clear();
		
		//Thread.sleep(500);

		//3. Click(): Click method is use to click on buttons, links also use to select radio buttons & checkboxes.
		
		//driver.get("https://support.google.com/mail/answer/8494?hl=en&co=GENIE.Platform%3DDesktop");
		//Thread.sleep(500);
		//driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
		
		
		
	}

	
	}


