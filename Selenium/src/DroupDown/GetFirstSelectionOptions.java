package DroupDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectionOptions
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./ChromeDriver/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\SUNIL\\Documents\\DroupDown.html");
		WebElement droupdown = driver.findElement(By.xpath("//select[@name='watches']"));
		Select sel = new Select(droupdown);
		sel.selectByVisibleText("Zenith");
		sel.selectByVisibleText("Cartier");
		sel.selectByVisibleText("Omega");
		WebElement firstselected = sel.getFirstSelectedOption();
		System.out.println( firstselected.getText());
	}
}
