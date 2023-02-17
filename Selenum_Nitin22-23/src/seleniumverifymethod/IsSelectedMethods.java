package seleniumverifymethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethods {
	
public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\DO NOT DELETE\\ni3\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("isAgeSelected")).click();
		boolean VerifyCheckboxIsSelected = driver.findElement(By.id("isAgeSelected")).isSelected();
		System.out.println(VerifyCheckboxIsSelected);      // true
		
		driver.findElement(By.id("isAgeSelected")).click();
		boolean VerifyCheckboxIsSelected1 = driver.findElement(By.id("isAgeSelected")).isSelected();
		System.out.println(VerifyCheckboxIsSelected1);      // false
		

}
}