package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.cssSelector("input[aria-label='Email address or phone number']")).sendKeys("abc");
		driver.findElement(By.cssSelector("input[data-testid='royal_pass']")).sendKeys("bca");
		
	}

}
