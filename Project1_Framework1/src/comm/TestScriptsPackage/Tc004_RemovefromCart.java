package comm.TestScriptsPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import comm.BasicFunctionalitiesPackage.BasicOperations;
import comm.BasicFunctionalitiesPackage.TakeScreenshot;
import comm.POMPackages.RemoveCart;

public class Tc004_RemovefromCart extends BasicOperations {
	
	@Test
	public static void RemovefromCart() throws EncryptedDocumentException, IOException, InterruptedException
	{
		RemoveCart rc = new RemoveCart(driver);
		rc.MyCart();
		Thread.sleep(5000);
		TakeScreenshot.Screenshot("Before_remove");
		rc.Remove();	
		rc.AlertRemove();
		Thread.sleep(5000);
		TakeScreenshot.Screenshot("After_Remove");
	
	}

}
