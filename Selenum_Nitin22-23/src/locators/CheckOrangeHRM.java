package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckOrangeHRM {
	
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\DO NOT DELETE\\ni3\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		
		WebElement clickLogin = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
		clickLogin.click();

		Thread.sleep(1000);
		
     	String expected_title ="OrangeHRM";
     	String actual_title = driver.getTitle();
		
     	if(expected_title.equals(actual_title))
		System.out.println("Test Case Pass");
	    else
		System.out.println("Test Case Fail");
		
	}

}
