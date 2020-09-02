package comm.TestScriptsPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import comm.BasicFunctionalitiesPackage.BasicOperations;
import comm.BasicFunctionalitiesPackage.TakeScreenshot;
import comm.POMPackages.SeacrhPage;

public class Tc007_Draganddrop extends BasicOperations
{
   @ Test
    public static void DragDropsec() throws InterruptedException, IOException 	
    {    
	SeacrhPage sp= new SeacrhPage(driver);
	sp.Electronics();
	TakeScreenshot.Screenshot("drag");	
	
	Thread.sleep(5000);
	sp.find();
	TakeScreenshot.Screenshot("final");
}		
}
