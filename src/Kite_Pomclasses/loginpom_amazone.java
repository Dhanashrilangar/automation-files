package Kite_Pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpom_amazone
{
@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']") private WebElement login;
	@FindBy(id="ap_email") private WebElement userid;
	@FindBy(id="continue")private WebElement continuebutton;
	@FindBy(id="ap_password")private WebElement password;
	@FindBy(id="signInSubmit")private WebElement signinbutton;
	
	public loginpom_amazone( WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void login()
	{
		login.click();
	}
	public void userid(String uid)
	{
		userid.sendKeys(uid);
	}
	
	public void continuebutton()
	{
		continuebutton.click();
	}
	public void password(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void signinbutton()
	{
		signinbutton.click();
	}
	
	
}