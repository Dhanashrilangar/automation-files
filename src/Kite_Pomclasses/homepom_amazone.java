package Kite_Pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class homepom_amazone 
{

	@FindBy(id="twotabsearchtextbox")private WebElement searchtext;
	@FindBy(id="nav-search-submit-button")private WebElement searchbutton;
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-fixed-height'])[1]")private WebElement selectwatch;
	@FindBy(id="add-to-cart-button")private WebElement addtocart;
	@FindBy(id="nav-cart-count") private WebElement addtocartoption;
	@FindBy(xpath="//div[@data-asin='B0B3RRWSF6']")private WebElement showproduct;
	 @FindBy(xpath="//a[@id='nav-logo-sprites']")private WebElement homepage;
	
	public homepom_amazone(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void searchtext(String item)
	{
		searchtext.sendKeys(item);
	}
	public void searchbutton()
	{
		searchbutton.click();
	}
	public void selectwatch()
	{
		selectwatch.click();
	}
	public void addtocart()
	{
		addtocart.click();
	}
	public void addtocartoption()
	{
		addtocartoption.click();
	}
	public void showproduct()
	{
		showproduct.isDisplayed();
		
		Reporter.log("product display in cart",true);
	}
	public void homepage()
	{
		homepage.click();
	}
	
	
	
	
	
	
	
	

}
