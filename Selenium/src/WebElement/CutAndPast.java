package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CutAndPast {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("qspiderds");
		username.sendKeys(Keys.CONTROL,"a");
		username.sendKeys(Keys.CONTROL,"x");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys(Keys.CONTROL,"v");
	}

}
