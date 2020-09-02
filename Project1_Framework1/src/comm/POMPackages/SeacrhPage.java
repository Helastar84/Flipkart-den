package comm.POMPackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import comm.BasicFunctionalitiesPackage.BasicOperations;
import comm.BasicFunctionalitiesPackage.DragandDrop;
import comm.BasicFunctionalitiesPackage.MouseOver;


public class SeacrhPage extends BasicOperations
{
	
	// Declaration of element in seacrh page
	
		 @FindBy(xpath= "//input[@class ='LM6RPg']")
		 private WebElement seacrhtext;
		 @FindBy(xpath= "//button[@class ='vh79eN']")
		 private WebElement seacrhicon;	 
		 @FindBy(xpath= "//span[text()='Electronics']")
		 private WebElement Electronics;
		 @FindBy(xpath= "//a[text()='OPPO']")
		 private WebElement Oppo;

		 //Initialization: constructor
		 
		 public SeacrhPage(WebDriver driver)
		 {	 
			 PageFactory.initElements(driver, this);
		 }
		 
		 //Utilization
		 
		 public void seacrhtext(String value)
		 {	seacrhtext.sendKeys(value);  }

		 public void find()
		 {	 seacrhicon.click(); } 
		 
		 public void Electronics()
		 {
			 MouseOver.MouseHover(Electronics);
		 }
		 public void Oppo( )
		 {
			String source = 
			
		 }
		 public void seacrhtext( )
		 {
			
		 }
        
}       
