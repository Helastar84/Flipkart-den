package comm.POMPackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import comm.BasicFunctionalitiesPackage.BasicOperations;


public class LoginPage extends BasicOperations
{
	
	// Declaration of element in login page
	
	 @FindBy(xpath= "//a[@class ='_3Ep39l']")
	 private WebElement signin;
	 @FindBy(xpath= "//input[@class ='_2zrpKA _1dBPDZ']")
	 private WebElement username;
	 @FindBy(xpath= "//input[@class ='_2zrpKA _3v41xv _1dBPDZ']")
	 private WebElement password;
	 @FindBy(xpath= "//button[@class ='_2AkmmA _1LctnI _7UHT_c']")
	 private WebElement login;

	 //Initialization: constructor
	 
		 public LoginPage(WebDriver driver) 
		 {	 
		   PageFactory.initElements(driver, this);
		 }

     //Utilization

		 public void signin()
		 {	signin.click();  }
		 
		 public void username(String uid)
		 {username.sendKeys(uid);} 	
		 
		 public void password(String pwd)
		 { password.sendKeys(pwd);}	 
		 
		 public void login()
		 {	 login.click(); } 
}
