package HardAssert_Study;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class Assertequal_notequal {
	
  @Test
  public void TC1()
  {
	  String ExpectedResult="VCTCPune";
	  String ActualResult="VCTC";
	  String name="VCTC";
	  assertEquals(ActualResult, ExpectedResult,"Result is not matching");
	  Reporter.log("TC1 is running", true);
  }
  @Test(enabled = false)
  public void TC2() 
  
  {
	  String ExpectedResult="VCTCPune";
	  String ActualResult="VCTC";
	  String name="VCTC";
	  assertNotEquals(ActualResult,name, "Result is matching");
	  Reporter.log("TC2 is running", true);
  }

  }

