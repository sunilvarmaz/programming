package DroupDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDroupDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		WebElement  droupdown  = driver.findElement(By.id("month"));
		Select sel = new Select(droupdown);
		sel.selectByIndex(7);
		sel.selectByValue("Se");
		sel.selectByVisibleText("Oct");
		System.out.println(sel.getFirstSelectedOption().getText());
	}
	
}
