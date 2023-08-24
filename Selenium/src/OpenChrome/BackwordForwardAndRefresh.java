package OpenChrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackwordForwardAndRefresh {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.get("https://www.myntra.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
