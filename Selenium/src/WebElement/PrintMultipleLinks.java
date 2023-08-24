package WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintMultipleLinks {
	private static Object links;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromdriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		 List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++) {
			System.out.println(links.get(i).getText());
		}
	}

}
