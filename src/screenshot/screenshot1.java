package screenshot;

import java.io.IOException;

import library.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class screenshot1 {
	@Test
	public void catureScreenshot() throws IOException{
		
		System.setProperty("webdriver.chrome.driver","E:/anto/seleniumchrom/chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Utility.captureScreenshot(driver, "Type name");
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("learn automation");
		//create interfact takesscreenashots

		Utility.captureScreenshot(driver, "Browserstartes");
		driver.quit();
	}

}
