package comm.BasicFunctionalitiesPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopup extends BasicOperations {
	
	public static WebElement Popup(WebElement value) 
	{     
		    	
		   // WebDriverWait wait = new WebDriverWait(driver, 30);
		   // wait.until(ExpectedConditions.alertIsPresent());
		   Alert alert = driver.switchTo().alert();
		   //System.out.println(alert.getText());
		    alert.accept();
			return value;
				
	}

}
