package comm.BasicFunctionalitiesPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop extends BasicOperations{

	public static void Drag_and_Drop(WebElement source,WebElement target )		 
	 {  
		Actions at = new Actions(driver);		
		at.dragAndDrop(source, target).perform();		
	 }
}
