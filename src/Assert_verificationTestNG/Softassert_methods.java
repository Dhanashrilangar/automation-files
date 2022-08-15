package Assert_verificationTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert_methods {
  @Test
  public void class1()
  {
	  String a="dhanashri";
	  String b="dhanashri";
      String c="langar";
      String d=null;
      
      //1. create a object of soft assert
      
      SoftAssert soft=new SoftAssert();
      
      //2.with soft object call soft assert methods
      //a.softassertnull method
      soft.assertNull(a, "a is not null so test case fail");
      //b. softassertnotnull method
      soft.assertNotNull(b,"d is null so test case fail");
 
      soft.assertAll();
      
      
      
      
      
      
      
      
  }
}
