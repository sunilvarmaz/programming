package Exception;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementException {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./ChromeDriver/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com");
		WebElement link = driver.findElement(By.linkText(""));
		link.click();
		WebElement link1 = driver.findElement(By.linkText(""));
		System.out.println(link1.getText());
		driver.close();
		
	
	}

}
