package Assert_verificationTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class fail_assert {
  @Test
  public void f()
  {
	
      SoftAssert soft=new SoftAssert();

	  Assert.fail("tc fail");
	  Reporter.log("pass");
	  
  }
}
