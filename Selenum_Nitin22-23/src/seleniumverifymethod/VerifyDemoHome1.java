package seleniumverifymethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyDemoHome1 {
	
public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\DO NOT DELETE\\ni3\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("isAgeSelected")).click();
		driver.findElement(By.id("isAgeSelected")).click();
		driver.findElement(By.id("isAgeSelected")).click();
		driver.findElement(By.id("isAgeSelected")).click();
		String verifyattributevalue = driver.findElement(By.id("txtAge")).getAttribute("style");
		System.out.println(verifyattributevalue);
		
		
		
		
		
		
		
}
}