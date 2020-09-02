package comm.POMPackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import comm.BasicFunctionalitiesPackage.BasicOperations;

public class AddCart extends BasicOperations{
	
	public class HomePage {
		
		// Declaration of element
		
		 @FindBy(xpath= "//div[.='Samsung Guru Music 2']")
		 private WebElement SelectedItem;	 
		 // new page will open
		 @FindBy(xpath= "//button[@class ='_2AkmmA _2Npkh4 _2MWPVK']")
		 private WebElement AddCart1;	 
		 @FindBy(xpath= "//div[@class ='gdUKd9']")
		 private WebElement Remove;	 
		

		 //Initialization: constructor	
		 
			 public void AddCart(WebDriver driver) 
			 {	 
			   PageFactory.initElements(driver, this);
			 }

	    //Utilization

			 public void SelectedItem()
			 { SelectedItem.click();} 	
								 
			 public void AddCart1()
			 {	 AddCart1.click(); } 
			 
			 public void Remove()
			 {	 Remove.click(); } 

	}


}
