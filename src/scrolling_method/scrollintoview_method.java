package scrolling_method;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class scrollintoview_method {


	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//1. find xpath of  webelement and store in one ref variable

		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);

//		//by using javascriptexcutor sendkey() method
	JavascriptExecutor js = (JavascriptExecutor)driver;
	    WebElement name= driver.findElement(By.id("name"));	
	    js.executeScript("arguments[0].scrollIntoView();", name);
		Thread.sleep(1000);

        js.executeScript("arguments[0].value='dhanashri';",name);
		Thread.sleep(1000);
		
		//by using javascriptexcutor click() method
		
	    WebElement selectbox = driver.findElement(By.id("dropdown-class-example"));
	    js.executeScript("arguments[0].scrollIntoView();",selectbox);
		Thread.sleep(1000);

        js.executeScript("arguments[0].click();",selectbox);
	    
	    //take screenshot of output
	  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		String Random = RandomString.make(3);
	  File dec = new File("F:\\Daily_Notes\\java notes\\selenium notes\\screenshot\\"+Random +"image.jpg");
	  FileHandler.copy(src, dec);

	}

}
