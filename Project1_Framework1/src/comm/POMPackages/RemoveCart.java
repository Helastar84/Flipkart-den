package comm.POMPackages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import comm.BasicFunctionalitiesPackage.AlertPopup;
import comm.BasicFunctionalitiesPackage.BasicOperations;

public class RemoveCart extends BasicOperations {
	
	// Declaration of element in login page
	
		 @FindBy(xpath= "//span[.='Cart']")
		 private WebElement MyCart;
		 @FindBy(xpath= "//div[.='Save for later']")
		 private WebElement SaveForLater;		 
		 @FindBy(xpath= "//div[.='Remove']")
		 private WebElement Remove;
		 @FindBy(xpath= "//div[@class='gdUKd9 _3Z4XMp _2nQDKB']")
		 private WebElement AlertRemove;
		 @FindBy(xpath= "//div[.='Cancel']")
		 private WebElement Cancel;

		 //Initialization: constructor
		 
			 public RemoveCart(WebDriver driver) 
			 {	 
			   PageFactory.initElements(driver, this);
			 }

	     //Utilization

			 public void MyCart()
			 {	MyCart.click();  }
			 public void SaveForLater()
			 {	SaveForLater.click();  }
			 public void Remove() 
			 {	Remove.click(); }
			 public void AlertRemove()
			 { AlertPopup.Popup(AlertRemove);}
			 
			
			



}
