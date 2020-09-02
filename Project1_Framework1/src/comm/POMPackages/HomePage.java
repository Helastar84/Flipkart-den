package comm.POMPackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import comm.BasicFunctionalitiesPackage.BasicOperations;
import comm.BasicFunctionalitiesPackage.MouseOver;

public class HomePage extends BasicOperations
{
	// Declaration of element in login page
	
	 @FindBy(xpath= "//div [@class ='_2aUbKa']")
	 private WebElement MyAccount;	 
	 @FindBy(xpath= "//div [@class ='_1jcwFN _3dmQRh']")
	 private WebElement MyProfile;
	 @FindBy(xpath= "//a [@class ='_2ZZi8V']")
	 private WebElement MyOrders;
	 @FindBy(xpath= "//button [@class ='_2AkmmA X_0BMS _2NZ5we _1eFTEo']")
	 private WebElement StartShopping;
	 @FindBy(xpath= "//div[text()='More']")
	 private WebElement More;


	 //Initialization: constructor	
	 
		 public HomePage(WebDriver driver) 
		 {	 
		   PageFactory.initElements(driver, this);
		 }

    //Utilization

		 public void MyAccount()		 
		 {
			MouseOver.MouseHover(MyAccount);
		 }
		 public void More()		 
		 {
	     	MouseOver.MouseHover(More);
		 }
		 public void MyProfile()
		 {	 MyProfile.click(); } 

		 public void MyOrders()
		 {	 MyOrders.click(); } 

		 public void StartShopping()
		 {	 StartShopping.click(); } 

}
