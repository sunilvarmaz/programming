package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReplaceText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement username  = driver.findElement(By.id("email"));
		username.sendKeys("qspiers");
		username.clear();
		username.sendKeys("jspiders");
		
		
	}

}
