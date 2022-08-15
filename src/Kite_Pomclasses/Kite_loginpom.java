package Kite_Pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_loginpom
{
	@FindBy(id="userid")private WebElement userid;
	@FindBy(id="password") private WebElement password;
	@FindBy(xpath="//button[@type='submit']") private WebElement login;

	public Kite_loginpom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void userid(String UID)
	{
		userid.sendKeys(UID);
	}
	public void password(String PWD) 
	{
		password.sendKeys(PWD);
	}
	public void login()
	{
		login.click();
	}
}
