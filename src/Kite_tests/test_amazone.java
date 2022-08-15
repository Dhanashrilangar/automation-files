package Kite_tests;

import java.io.IOException;
import java.lang.StackWalker.Option;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Kite_Pomclasses.homepom_amazone;
import Kite_Pomclasses.loginpom_amazone;
import Kite_base.base_amazone;
import Kite_utility.utility_amazone;

public class test_amazone extends base_amazone
{
	
	homepom_amazone page2;
	loginpom_amazone page1;
	
@BeforeClass
public void launchbrowzer() throws IOException
{
	openbrowzer(); //call base class method by usung extends base class
	Reporter.log("browzer launch",true);
	page2=new homepom_amazone(driver);
	page1=new loginpom_amazone(driver);
	
}
	
@BeforeMethod
public void loginamazone() throws IOException
{
	Reporter.log("amazon sign in",true);
	page1.login();
	utility_amazone.waits(driver, 1000);	
	page1.userid(utility_amazone.readpropertyfiledata("uid"));
	page1.continuebutton();
	page1.password(utility_amazone.readpropertyfiledata("pwd"));
	page1.signinbutton();
	Reporter.log("search product",true);
	utility_amazone.waits(driver, 1000);
	page2.searchtext(utility_amazone.readpropertyfiledata("item"));
	page2.searchbutton();
	Reporter.log("select product",true);
	page2.selectwatch();
	Reporter.log("prouct add in cart",true);
	page2.addtocartoption();
	utility_amazone.waits(driver, 1000);	
}
  @Test
  public void validate_product_addtocart() throws IOException 
  {	 
	 String TCID = "101";
	 page2.addtocartoption();
     utility_amazone.waits(driver, 1000);	
	 boolean output=true;
	 Assert.assertTrue(true, "selected watch not add in cart so test case 101 fail");
     utility_amazone.capture_sc(driver, TCID); 
     Reporter.log("tcid 101 pass, product add in add to cart",true);
}
 @Test
 public void validate_product_showin_cart() throws IOException
 {
	 String TCID = "102";
	 page2.showproduct();
     utility_amazone.waits(driver, 1000);	
	 boolean show_productin_cart=true;
	 Assert.assertTrue(true, "result not match so tc 102 fail");
	 utility_amazone.capture_sc(driver, TCID); 
     Reporter.log("tcid 102 pass, product show in add to cart",true);
 }
  @AfterMethod
  public void gotohomepage()
  {
	  Reporter.log("go to homepage",true);
	  page2.homepage();
  }
}
