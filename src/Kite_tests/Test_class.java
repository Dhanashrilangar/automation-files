package Kite_tests;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Kite_Pomclasses.Kite_homepom;
import Kite_Pomclasses.Kite_loginpom;
import Kite_Pomclasses.Kite_pinpom;
import Kite_base.Base_class;
import Kite_utility.utility_class;

@Listeners(Listner_study.listener.class)
public class Test_class extends Base_class{
	
	Kite_homepom page3;
	Kite_pinpom page2;
	Kite_loginpom page1;
	@BeforeClass
	public void launchbrowzer(ITestListener result)
	{
		openbrowzer();
		
		page3=new Kite_homepom(driver);
		page2 = new Kite_pinpom(driver);
	    page1 = new Kite_loginpom(driver);	
	}
	@BeforeMethod
	public void login_kite(ITestListener result) throws EncryptedDocumentException, IOException
	{
		page1.userid(utility_class.readexcel_data(0, 0));
		page1.password(utility_class.readexcel_data(0, 1));
		page1.login();
		utility_class.waits(driver, 1000);
		
        page2.pin(utility_class.readexcel_data(0, 2));
        page2.loginbutton();
        utility_class.waits(driver, 1000);
   }	
  @Test
  public void validateuserid(ITestListener result) throws EncryptedDocumentException, IOException
  {
	  String TCID="123";
	  Assert.assertEquals(page3.validate_user(), utility_class.readexcel_data(0, 0));
	  Reporter.log("tc is fail actual and expected result not matching",true);
	  utility_class.capture_sc(driver, TCID);  
  }
  @AfterMethod
  public void logout(ITestListener result) throws InterruptedException
  {
	page3.logout();
	Thread.sleep(1000);
  }
  
  @AfterClass
  public void closebrowzer(ITestListener result)
  {
	  driver.close();
  }
}
