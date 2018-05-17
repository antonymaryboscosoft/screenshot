package library;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	public static void captureScreenshot(WebDriver driver,String screenshotName)
	{
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			//enterscreenshot folder name
			FileUtils.copyFile(source, new File("./screenshot/"+screenshotName+".png"));
			System.out.println("Screen shot taken");
		} catch (Exception e) {
			System.out .println("Exception while taking the screen shot"+e.getMessage());
		} 
	}}
