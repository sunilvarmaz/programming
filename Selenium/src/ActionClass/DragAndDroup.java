package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDroup {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./ChromeDriver/chromedriver1.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/html/dragdrop.asp");
	WebElement source = driver.findElement(By.id("div1"));
	WebElement Target = driver.findElement(By.id("div2"));
	
	Actions act = new Actions(driver);
	act.dragAndDrop(source, Target).perform();
}
}
