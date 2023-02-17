package scrollingpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
public static void main(String[]args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\DO NOT DELETE\\ni3\\chromedriver_win32 (1)\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.findElement(By.cssSelector("[name='username']")).sendKeys("Admin");
	driver.findElement(By.cssSelector("[name='password']")).sendKeys("admin123");
	driver.findElement(By.cssSelector("[type='submit']")).click();	
	
	driver.findElement(By.xpath("//*[text()='PIM']")).click();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,600)");
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,-600)");
}
		

			


	}

