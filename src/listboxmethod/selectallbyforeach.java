package listboxmethod;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectallbyforeach {


		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");
					
					WebDriver driver= new ChromeDriver();
					
					driver.manage().window().maximize();
					Thread.sleep(1000);

					driver.get("https://en-gb.facebook.com/");
					
					TreeSet<String>ts= new TreeSet<String>();
							
					Thread.sleep(1000);

					driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']")).click();
					Thread.sleep(1000);
					WebElement Month = driver.findElement(By.id("month"));
					Thread.sleep(1000);
					Select s= new Select(Month);
					List<WebElement> AvailableMonths = s.getOptions();
					
					for(WebElement we:AvailableMonths)
					{
						String Text = we.getText();
						System.out.println(Text);
						ts.add(Text);
					}

					System.out.println(ts);
					
//					for(String s1:ts)
//					{
//						System.out.println(s1);
//					}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
