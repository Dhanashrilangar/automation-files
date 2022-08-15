package TestNG_study;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
  public void validateuser()
  {
	  Reporter.log("user validation sucessfull", true);
  }
  @BeforeMethod
  public void login()
  {
	  Reporter.log("login done", true);
  }

  @AfterMethod
  public void logout()
  
  {
	  Reporter.log("logout done", false);
	  
  }
  
  

}
