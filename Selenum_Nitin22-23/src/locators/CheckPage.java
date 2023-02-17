package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckPage {
	
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\DO NOT DELETE\\ni3\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement Username = driver.findElement(By.id("email"));
		Username.sendKeys("7775896788");
		
		WebElement Password = driver.findElement(By.id("pass"));
		Password.sendKeys("Nitin@12345");
		
		WebElement clickLogin = driver.findElement(By.name("login"));
		clickLogin.click();
		
		String expected_title ="f";
		String actual_title = driver.getTitle();
		
		if(expected_title.equals(actual_title))
			System.out.println("Test Case Pass");
		else
			System.out.println("Test Case Fail");
			
	}
}

