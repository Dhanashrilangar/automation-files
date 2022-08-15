package kitepom_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteclass3_pom {
	//1. Data member should be declared globally with access level private using @findby anatation
      @FindBy(xpath="//span[@class='user-id']") private WebElement user ;
	@FindBy(xpath="//a[@target='_self']") private WebElement logout;
	
	public kiteclass3_pom(WebDriver driver) {
		
	PageFactory.initElements(driver, this);
}
public void vlidateuser()
{
	String exceptedresult = "ELR321";
	String actualresult = user.getText();
	if(exceptedresult.equals(actualresult))
	{
		System.out.println("test case pass");
	}
	else {
		
	
	System.out.println("test case fail");
	}
}
	public void logout() throws InterruptedException
	{
		user.click();
		Thread.sleep(1000);
		logout.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
