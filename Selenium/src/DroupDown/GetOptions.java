package DroupDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement citydriver = driver.findElement(By.xpath(""));
		Select sel = new Select(citydriver);
		List<WebElement> options = sel.getOptions();
		System.out.println(options.size());
		for(int i = 0;i<options.size();i++) {
			System.out.println(options.get(i).getText());
		}
		
		
	}

}
