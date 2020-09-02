package comm.BasicFunctionalitiesPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseOver extends BasicOperations
{
	 public static WebElement MouseHover(WebElement value)		 
	 {
		Actions at = new Actions(driver);
		at.moveToElement(value).perform();
		return value;
	 }
	
}

