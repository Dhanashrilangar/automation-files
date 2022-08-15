package listboxmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class method_listbox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");
		
	WebDriver method=new ChromeDriver();
	
	 method.manage().window().maximize();
	 
	method.get("https://www.facebook.com/login/");
		
	Thread.sleep(1000);
		
		method.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		
		Thread.sleep(1000);
		
		method.findElement(By.name("firstname")).sendKeys("Group number");
		
		Thread.sleep(1000);
		
		method.findElement(By.name("lastname")).sendKeys("W11");
		
		Thread.sleep(1000);

	method.findElement(By.name("reg_email__")).sendKeys("1111111111");
		
	Thread.sleep(1000);
	method.findElement(By.name("reg_passwd__")).sendKeys("w11rrsd");
	Thread.sleep(3000);

WebElement date = method.findElement(By.id("day"));  //identify list box

		Select s=new Select(date);  
		Thread.sleep(3000);

		s.selectByValue("2");
		Thread.sleep(3000);

		WebElement month = method.findElement(By.id("month"));
		Select s1 = new Select(month);
		s1.selectByVisibleText("Feb");
		
		Thread.sleep(3000);

		WebElement Year = method.findElement(By.id("year"));
		Select s2 = new Select(Year);
		s2.selectByValue("2020");
		
		Thread.sleep(1000);

		
	}

}
