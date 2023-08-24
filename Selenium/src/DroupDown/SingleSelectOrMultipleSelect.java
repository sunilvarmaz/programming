package DroupDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectOrMultipleSelect {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		WebElement citydroupdown = driver.findElement(By.xpath(""));
		Select sel = new Select(citydroupdown);
		System.out.println(sel.isMultiple());
	}

}
