package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckPractice {
	
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\DO NOT DELETE\\ni3\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		WebElement Username = driver.findElement(By.name("username"));
		Username.sendKeys("nitin");
		
		WebElement Password = driver.findElement(By.name("password"));
		Password.sendKeys("nitin123");
		
		WebElement clickLogin = driver.findElement(By.id("loginForm"));
		clickLogin.click();
		
	}
}
