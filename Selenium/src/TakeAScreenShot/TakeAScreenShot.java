package TakeAScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeAScreenShot {
	

	private static final String TakesScreenshot = null;

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		TakesScreenshot ts = ( TakesScreenshot)driver;
		File snap = ts.getScreenshotAs(OutputType.FILE);
		File file = new File("ScreenShots/screenshot.png");
		FileHandler.copy(snap, file);
		
		
		
	}

}
