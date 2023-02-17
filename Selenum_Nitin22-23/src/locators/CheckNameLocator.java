package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckNameLocator {
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\DO NOT DELETE\\ni3\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement UserName = driver.findElement(By.name("username"));
		UserName.sendKeys("Admin");	
		
		WebElement PassWord = driver.findElement(By.name("password"));
		PassWord.sendKeys("admin123");
		Thread.sleep(2000);
		WebElement Button = driver.findElement(By.cssSelector(".oxd-form-actions.orangehrm-login-action button"));
		Button.click();
		
	}
		
}
