package Assert_verificationTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class true_flaseassert {
  @Test
  public void f()
  {
	  boolean result=true;
	  boolean clas=false;
	  
	  
		SoftAssert s=new SoftAssert()  ;

	  s.assertFalse(result, "test pass");
	  
	  
	  s.assertTrue(result, "test pass");
	  
	  s.assertAll();
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
