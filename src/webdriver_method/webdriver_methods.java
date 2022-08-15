package webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_methods {

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");  //get method
		
		driver.close();     //close method
		
		driver.quit();      //quit method
		
		driver.manage().window().maximize();    //maximize method
		
	//	driver.manage().window().minimize();       //minimise method
		
		driver.get("https://www.youtube.com/");
		
		Thread.sleep(10000);
		
		//driver.navigate().to("https://www.youtube.com/feed/library");  //navigate method
		
		//Thread.sleep(1000);
		
		//driver.navigate().back();  //navigate back method
		//driver.navigate().forward(); //navigate forward method
		//driver.navigate().refresh(); //navigate refresh method
		
	String title = driver.getTitle();  //create title object
		
	System.out.println("driver gettitle method "+title);  //gettitle method
	
String url = driver.getCurrentUrl();

System.out.println("url is "+url);  //geturl method


Thread.sleep(500);
//driver.navigate().refresh();
//driver.close();
//Thread.sleep(500);
//driver.quit();

//String title = driver.getTitle();

//System.out.println(title);
		
	}

}
