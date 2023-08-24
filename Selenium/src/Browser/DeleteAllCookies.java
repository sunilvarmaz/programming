package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteAllCookies {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./ChromeDriver/chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.myntra.com");
		driver.manage().deleteAllCookies();
		System.out.println("deleted all cookies");
	}

}
