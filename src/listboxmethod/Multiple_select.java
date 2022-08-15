package listboxmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_select {


		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");
					
					WebDriver driver= new ChromeDriver();
					
					driver.manage().window().maximize();
					Thread.sleep(1000);

					driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
					
					Thread.sleep(1000);
					WebElement States = driver.findElement(By.name("States"));
					
					Select s= new Select(States);
					Thread.sleep(1000);

					System.out.println(s.isMultiple());
					
					s.selectByVisibleText("California");
					Thread.sleep(1000);
					
					s.selectByVisibleText("New York");
					Thread.sleep(1000);
					
					s.selectByVisibleText("Washington");
					Thread.sleep(1000);
					
					s.deselectByVisibleText("California");
					
					//s.deselectAll();
					


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
