package findelements_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamichandle_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_833o4zmtnn_b&adgrpid=55759171661&hvpone=&hvptwo=&hvadid=294130660745&hvpos=&hvnetw=g&hvrand=11501285858371930896&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062118&hvtargid=kwd-326600735004&hydadcr=5840_1914862&gclid=EAIaIQobChMI5vvJwaLi-AIVzhwrCh1YCwE2EAAYASAAEgIoyvD_BwE");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung mobile");
	    Thread.sleep(1000);
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(1000);
        WebElement review = driver.findElement(By.xpath("((//div[@class='sg-col-inner'])[9]//span)[16]"));
         Thread.sleep(1000);

	    System.out.println("review of Samsung Galaxy M33 "+review.getText());
	    
	}

}
