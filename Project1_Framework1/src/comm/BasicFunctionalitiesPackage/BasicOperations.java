	package comm.BasicFunctionalitiesPackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import comm.POMPackages.LoginPage;

public class BasicOperations implements ConstantValues {
	
	public static WebDriver driver;		
	@BeforeMethod
	public static void Systemset() throws InterruptedException, EncryptedDocumentException, IOException
	{
	System.setProperty(key, value);
	driver = new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	LoginPage lp = new LoginPage(driver);
	
	String uid = ExcelInput.excelvalue("UserLogin", 1, 0);
	lp.username(uid);
	String pwd = ExcelInput.excelvalue("UserLogin", 1, 1);
	lp.password(pwd);
	lp.login();		
	Thread.sleep(5000);
	}
	
	@AfterMethod()
	public static void Logout()
	{
		driver.quit();
		
	}
	
	
}
