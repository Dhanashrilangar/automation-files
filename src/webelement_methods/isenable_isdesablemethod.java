package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class isenable_isdesablemethod {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	driver.get("https://www.facebook.com/login/");
		
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
	Thread.sleep(1000);
	
    //6. isSelected(): This method is use to verify radio button/checkbox is selected or not. Return type of isSelected function is boolean.
	//If radio button/checkbox is selected then it returns true otherwise it returns false.
	
		System.out.println("redio button is select " + driver.findElement(By.name("sex")).isSelected());
		
	WebElement female = driver.findElement(By.name("sex"));
	Thread.sleep(1000);

	female.click();
	Thread.sleep(1000);
    System.out.println("radio button is selected "+female);
    Thread.sleep(1000);
    
    //5. isEnabled(): This method is use to verify element is enebled or disabled.
    //Return type of isenabled function boolean if element is enabled then it returns true otherwise it returns false

    WebElement male = driver.findElement(By.xpath("//input[@value='2']"));
    male.isEnabled();
    System.out.println("radio button enabled "+male);
    Thread.sleep(1000);
    male.click();
	}

}
