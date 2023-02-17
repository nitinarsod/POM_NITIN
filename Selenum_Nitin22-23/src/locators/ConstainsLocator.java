package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConstainsLocator {
	
public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\DO NOT DELETE\\ni3\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement UserName = driver.findElement(By.xpath("//*[contains(@name,'user')]"));
		UserName.sendKeys("Admin");
		
		WebElement PassWord = driver.findElement(By.xpath("//*[contains(@name,'pass')]"));
		PassWord.sendKeys("admin123");
		Thread.sleep(2000);
		WebElement Button = driver.findElement(By.xpath("//*[contains(@class,'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button')]"));
		Button.click();
	}

}

