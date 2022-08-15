package kite_exceltest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class class2_parameterisation {


		//1. Data member should be declared globally with access level private using @findby anatation

		@FindBy(id="pin")private WebElement pin;
		@FindBy(xpath="//button[@type='submit']")private WebElement loginbutton;
		
		//2. Initialize within a constructor with access level public using pagefactory

		public class2_parameterisation(WebDriver driver) {

		
			PageFactory.initElements(driver, this);
		}
		
	//3. Utilize within a method with access level public
	public void pin(String PIN)
	{
		pin.sendKeys(PIN);
	}
	public void loginbutton() 
	{
		loginbutton.click();
	}
	

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

