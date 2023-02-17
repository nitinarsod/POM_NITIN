package actionclassusing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHowering {
	
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\DO NOT DELETE\\ni3\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/menu");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement target = driver.findElement(By.xpath("//*[text()='Main Item 2']"));
		Actions act=new Actions(driver);
		act.moveToElement(target).perform();
	}
}
