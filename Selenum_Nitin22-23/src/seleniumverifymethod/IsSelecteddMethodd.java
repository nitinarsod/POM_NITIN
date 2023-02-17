package seleniumverifymethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelecteddMethodd {
	
	
public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\DO NOT DELETE\\ni3\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[text()='Option 1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Option 2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Option 3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Option 4']")).click();
		Thread.sleep(2000);
		
		
		WebElement check = driver.findElement(By.id("txtage"));
		System.out.println(check.getAttribute("style"));
}
}