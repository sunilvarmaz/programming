package DroupDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		WebElement droupdown = driver.findElement(By.id("day"));
		
		Select droupdown1 = new Select(droupdown);
		droupdown1.selectByIndex(3);
		System.out.println(droupdown1.getFirstSelectedOption().getText());
		
		
		
	}

}
