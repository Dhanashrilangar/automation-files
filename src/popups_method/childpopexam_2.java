package popups_method;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childpopexam_2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);		
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
        driver.manage().window().maximize();

	String mainpagelink = driver.getWindowHandle();
		
		System.out.println(mainpagelink);
		System.out.println("-------------------------------");
		
	Set<String> links = driver.getWindowHandles();
	ArrayList abc = new ArrayList(links);
	Thread.sleep(2000);
    Object a1 = abc.get(0);
	Thread.sleep(2000);
	System.out.println("-------------------------------");

    Object b1 = abc.get(1);
    Thread.sleep(2000);
    driver.manage().window().maximize();
    Thread.sleep(2000);

    driver.switchTo().window(mainpagelink);

    System.out.println(a1);
		
		
		
		
		
	}

}
