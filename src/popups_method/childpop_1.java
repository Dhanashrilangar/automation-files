package popups_method;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childpop_1 {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		Thread.sleep(2000);
		// to get single id(main page)-->
        String mainpagelink = driver.getWindowHandle();
        Thread.sleep(1000);
        System.out.println("===========main page link =================");
		System.out.println("mainpage link "+mainpagelink);
		Thread.sleep(1000);
        //to get multiple ids-->
        Set<String> childpoppage = driver.getWindowHandles();      
		ArrayList link=new ArrayList(childpoppage);  //convert set to arraylist 
		Object a1 = link.get(0);
		Object b1 = link.get(1);
		System.out.println("======================================");
		System.out.println("link of mainpage "+a1);
		System.out.println("======================================");
		System.out.println("link of childpop page link "+b1);
		Thread.sleep(4000);
		driver.close();
		driver.switchTo().window(mainpagelink);
		Thread.sleep(1000);
		//driver.close();

		
	}

}
