package tableHandle_study;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table_ex {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Daily_Notes\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);	
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='product']//tr"));
		System.out.println("No. of rows are "+rows.size());
		Thread.sleep(1000);	
		List<WebElement> column = driver.findElements(By.xpath("//table[@id='product']//tr[1]/th"));
		System.out.println("No. of column are "+column.size());
		Thread.sleep(1000);	
		List<WebElement> data = driver.findElements(By.xpath("//table//tr//td"));
		System.out.println(data.size());

       System.out.println("----------------------------------------------");
		for(int i=1;i<=rows.size();i++)
		{
			for(int j=i;j<=column.size();j++)
				System.out.println(rows.get(j).getText()+"  ");
			
			System.out.println();
		}
		
		
		
		
	
		
		
		
		
	}

}
