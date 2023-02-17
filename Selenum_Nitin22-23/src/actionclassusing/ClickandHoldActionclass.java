package actionclassusing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickandHoldActionclass {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\DO NOT DELETE\\ni3\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement sourceElement = driver.findElements(By.cssSelector("#fourth a")).get(0);
		WebElement targetElementdriver = driver.findElement(By.cssSelector("#amt7 li"));
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.clickAndHold(sourceElement).release().build().perform();
		Thread.sleep(10000);
		act.clickAndHold(targetElementdriver).release().build().perform();
		
		
		
}
}