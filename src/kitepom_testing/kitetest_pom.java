package kitepom_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kitetest_pom {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://kite.zerodha.com/");
		    Thread.sleep(1000);
		
		kiteclass1_pom page1 = new kiteclass1_pom(driver);
	    page1.userid();
		page1.password();
		page1.login();
	    Thread.sleep(1000);

		kiteclass2_pom page2=new kiteclass2_pom(driver);
		page2.pin();
		page2.loginbutton();
	    Thread.sleep(1000);

	    kiteclass3_pom page3=new kiteclass3_pom(driver);
		
		page3.vlidateuser();
		page3.logout();
	    Thread.sleep(1000);
driver.close();
		
		
		
	}

}