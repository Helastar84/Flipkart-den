package comm.TestScriptsPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import comm.BasicFunctionalitiesPackage.BasicOperations;
import comm.BasicFunctionalitiesPackage.ExcelInput;
import comm.BasicFunctionalitiesPackage.TakeScreenshot;
import comm.POMPackages.AddCart;
import comm.POMPackages.SeacrhPage;

public class Tc005_Addtocart extends BasicOperations 
{
	
	@Test
	public static void Addtocart() throws EncryptedDocumentException, IOException, InterruptedException
	{
		SeacrhPage sp = new SeacrhPage(driver);
		String value = ExcelInput.excelvalue("Home", 1, 0);
		sp.seacrhtext(value);
		sp.find();
		Thread.sleep(5000);
		TakeScreenshot.Screenshot("Mobile");
		
		AddCart ac= new AddCart(driver);
		ac.
	}


}
