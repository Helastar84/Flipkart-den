package comm.BasicFunctionalitiesPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseOver extends BasicOperations
{
	 public static WebElement MouseHover(WebElement value) throws InterruptedException		 
	 {
		Actions at = new Actions(driver);
		at.moveToElement(value).perform();
		Thread.sleep(5000);
		return value;
	 }
	
}

