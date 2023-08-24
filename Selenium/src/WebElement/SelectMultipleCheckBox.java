package WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectMultipleCheckBox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver1.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("");
		List<WebElement> links = driver.findElements(By.xpath("//input[@type = checkbox"));
		System.out.println(links.size());
		for(int i = links.size()-2;i>=0;i = i-2) {
			links.get(i).click();
		}
	}

}
