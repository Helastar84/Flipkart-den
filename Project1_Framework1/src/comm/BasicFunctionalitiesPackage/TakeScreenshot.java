package comm.BasicFunctionalitiesPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TakeScreenshot extends BasicOperations
{
	public static void Screenshot(String Filename) throws IOException
	{
	TakesScreenshot ts =(TakesScreenshot)driver;
	File src= ts.getScreenshotAs(OutputType.FILE);
	File dst= new File("C://Users//helas//OneDrive//Documents//Screenshot//"+Filename+".jpeg");	
	FileUtils.copyFile(src, dst);
	}
}
