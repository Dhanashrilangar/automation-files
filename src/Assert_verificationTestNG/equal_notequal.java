package Assert_verificationTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class equal_notequal {
  @Test
  public void equal_notequal()
  
  {
	  
	 String accepted="langar" ;
	 String actual= "langar";
	 String name=null;
	  
	SoftAssert s=new SoftAssert()  ;
	  
	  s.assertEquals(accepted, actual);
	  
	  Reporter.log("test case pass");
	  
	  s.assertNotEquals(actual, name, "test case fail");
	  
	  s.assertAll();
	  
	  
	  
  }
}
