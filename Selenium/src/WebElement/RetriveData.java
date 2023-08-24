package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetriveData {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./ChromeDriver/chromedriver1.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com");
		 WebElement username  = driver.findElement(By.id("pass"));
		 username.sendKeys("qspiders");
		 System.out.println(username.getAttribute("value"));
	}

}
