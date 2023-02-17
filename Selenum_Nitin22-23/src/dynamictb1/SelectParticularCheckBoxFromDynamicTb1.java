package dynamictb1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectParticularCheckBoxFromDynamicTb1 {
		
		public static void main(String[]args) throws InterruptedException {
				
				System.setProperty("webdriver.chrome.driver", 
						"C:\\DO NOT DELETE\\ni3\\chromedriver_win32 (1)\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
				driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
				driver.findElement(By.xpath("//*[@type='submit']")).click();
				
				driver.findElement(By.xpath("//*[text()='PIM']")).click();
				
				Thread.sleep(2000);
				driver.findElement(By.xpath(
						"//*[contains(text(),'Luke')]//parent::div//following-sibling::div//*[contains(text(),'Skywalker')]//parent::div//preceding-sibling::div//span//i")).click();
}
}