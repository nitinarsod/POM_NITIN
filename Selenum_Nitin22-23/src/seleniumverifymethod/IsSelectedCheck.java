package seleniumverifymethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedCheck {
	
public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\DO NOT DELETE\\ni3\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement buttonFemale = driver.findElement(By.xpath("//span[text()='Female']//parent::label//input"));
		buttonFemale.click();
		Thread.sleep(2000);
		System.out.println(buttonFemale.isSelected());
		
		WebElement buttonMale = driver.findElement(By.xpath("//span[text()='Male']//parent::label//input"));
		System.out.println(buttonMale.isSelected());
		Thread.sleep(5000);
		
		driver.close();
		
}
}