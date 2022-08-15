package popups_method;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_popupmethod {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize(); 
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(1000);
		
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(1000);

	Alert clickbutton = driver.switchTo().alert();	
		System.out.println(clickbutton.getText());
		Thread.sleep(1000);
		clickbutton.accept();
//		clickbutton.dismiss();
//		clickbutton.getText();
		driver.switchTo().defaultContent();
//		
		Thread.sleep(1000);

		System.out.println(driver.findElement(By.className("icon")).isSelected());
		driver.findElement(By.className("icon")).click();
	
	}

}
