package HardAssert_Study;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertnull_notnull {
  @Test
  public void tc1()
  {
	  String ExpectedResult="VCTCPune";
		String ActualResult="VCTCPune";
		String name=null;
	      
	    assertNotNull(ExpectedResult,"pass");

		assertNull(ActualResult, "Value is  matching");
		Reporter.log("TC1 softAssert is running",true);

  }
}
