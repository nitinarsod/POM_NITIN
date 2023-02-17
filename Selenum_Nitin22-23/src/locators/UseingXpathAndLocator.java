package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseingXpathAndLocator {
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\DO NOT DELETE\\ni3\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement Text = driver.findElement(By.xpath("//h5[text()='Login']"));
		String returnString = Text.getText();
		System.out.println(returnString);
		
		WebElement UserName = driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active' or @name='username']"));
		UserName.sendKeys("Admin");
		
		WebElement PassWord = driver.findElement(By.xpath("//input[@name='password']"));
		PassWord.sendKeys("admin123");
		Thread.sleep(2000);
		WebElement Button = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
		Button.click();
			
		
	}
	

}
