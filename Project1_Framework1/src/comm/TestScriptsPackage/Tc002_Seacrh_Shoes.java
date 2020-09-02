package comm.TestScriptsPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import comm.BasicFunctionalitiesPackage.BasicOperations;
import comm.BasicFunctionalitiesPackage.ExcelInput;
import comm.BasicFunctionalitiesPackage.TakeScreenshot;
import comm.POMPackages.SeacrhPage;

public class Tc002_Seacrh_Shoes extends BasicOperations
{
	@Test
	public static void seacrh_mobile() throws EncryptedDocumentException, IOException
	{
		SeacrhPage sp = new SeacrhPage(driver);
		String value = ExcelInput.excelvalue("Home", 2, 0);
		sp.seacrhtext(value);
		sp.find();
		TakeScreenshot.Screenshot("Shoes");
	
	}

}
