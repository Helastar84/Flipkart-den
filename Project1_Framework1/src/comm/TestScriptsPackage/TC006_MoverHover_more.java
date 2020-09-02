package comm.TestScriptsPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import comm.BasicFunctionalitiesPackage.BasicOperations;
import comm.BasicFunctionalitiesPackage.TakeScreenshot;
import comm.POMPackages.HomePage;

public class TC006_MoverHover_more extends BasicOperations {
	
	@Test
	public static void MouseOver() throws IOException, InterruptedException 
	{
	   HomePage hp = new HomePage(driver);  
	   hp.More();   
       Thread.sleep(5000);
	   TakeScreenshot.Screenshot("More");
	
	      
	}

}


