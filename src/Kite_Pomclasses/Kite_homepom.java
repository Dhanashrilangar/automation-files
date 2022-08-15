package Kite_Pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_homepom 
{
	@FindBy(xpath="//span[@class='user-id']") private WebElement user ;
	@FindBy(xpath="//a[@target='_self']") private WebElement logout;
	
	public Kite_homepom (WebDriver driver) 
	{
		
	PageFactory.initElements(driver, this);
    }
	
    public String validate_user()
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
