package Kite_Pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_pinpom
{
	@FindBy(id="pin")private WebElement pin;
	@FindBy(xpath="//button[@type='submit']")private WebElement loginbutton;
	
	public Kite_pinpom (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void pin(String PIN)
	{
		pin.sendKeys(PIN);
	}
	public void loginbutton() 
	{
		loginbutton.click();
	}
}
