package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledSelectedAndDisplayed {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebool.com");
		WebElement logs = driver.findElement(By.id(""));
		System.out.println(logs.isDisplayed());
		System.out.println(logs.isEnabled());
		logs.click();
		System.out.println(logs.isSelected());
	}

}
