package comm.TestScriptsPackage;

import java.io.IOException;
import org.testng.annotations.Test;
import comm.BasicFunctionalitiesPackage.BasicOperations;
import comm.BasicFunctionalitiesPackage.ExcelInput;
import comm.BasicFunctionalitiesPackage.TakeScreenshot;
import comm.POMPackages.HomePage;


public class TC003_MouseOver extends BasicOperations
{
	
	@Test
	public static void MouseOver() throws IOException, InterruptedException 
	{
	   HomePage hp = new HomePage(driver);  
	   hp.MyAccount();
	   Thread.sleep(5000);
	   TakeScreenshot.Screenshot("MyAccount");
       hp.More();     
	   TakeScreenshot.Screenshot("More");
	
	      
	}

	
}
