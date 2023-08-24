package Browser;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndSetPosition {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./ChromeDriver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		System.out.println(driver.manage().window().getPosition().getX());
		System.out.println(driver.manage().window().getPosition().getY());
		Point  p = new Point(30,200);
		driver.manage().window().setPosition(p);
		System.out.println(driver.manage().window().getPosition().getX());
		System.out.println(driver.manage().window().getPosition().getY());
		
	}

}
