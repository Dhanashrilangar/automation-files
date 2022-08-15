package Verification_byTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.Return;

public class Kite_page3 
{

	//1. Data member should be declared globally with access level private using @findby anatation
    @FindBy(xpath="//span[@class='user-id']") private WebElement user ;
	@FindBy(xpath="//a[@target='_self']") private WebElement logout;
	
	public Kite_page3 (WebDriver driver) 
	{
		
	PageFactory.initElements(driver, this);
    }
    public String vlidateuser()
    {
	String actualresult = user.getText();
    return actualresult;
    }
	public void logout() throws InterruptedException
	{
		user.click();
		Thread.sleep(1000);
		logout.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
