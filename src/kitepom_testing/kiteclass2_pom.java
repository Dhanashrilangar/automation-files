package kitepom_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteclass2_pom {

	//1. Data member should be declared globally with access level private using @findby anatation

	@FindBy(id="pin")private WebElement pin;
	@FindBy(xpath="//button[@type='submit']")private WebElement loginbutton;
	
	//2. Initialize within a constructor with access level public using pagefactory

	public kiteclass2_pom(WebDriver driver) {

	
		PageFactory.initElements(driver, this);
	}
	
	

//3. Utilize within a method with access level public
public void pin()
{
	pin.sendKeys("982278");
}
public void loginbutton() 
{
	loginbutton.click();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
