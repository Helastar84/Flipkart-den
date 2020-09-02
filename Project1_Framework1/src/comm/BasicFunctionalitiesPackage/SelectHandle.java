package comm.BasicFunctionalitiesPackage;

import org.openqa.selenium.support.ui.Select;

public class SelectHandle extends BasicOperations{
	
	public static void Selecthandle()
	{		
		Select s= new Select(WebElement SelectedItem);
		s.selectByValue(select_value);
		s.selectByVisibleText(arg0);
				
	}

}
