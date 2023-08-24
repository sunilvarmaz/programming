package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHOvering {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./ChromeDriver/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		WebElement offer = driver.findElement(By.xpath("//a[.='Electronics']"));
		Actions act= new Actions(driver);
		act.moveToElement(offer);
		WebElement  watches = driver.findElement(By.xpath(""));
		act.moveToElement(watches).click(watches).perform();
		
		
		}

}
