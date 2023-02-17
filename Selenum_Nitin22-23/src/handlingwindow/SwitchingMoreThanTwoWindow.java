package handlingwindow;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingMoreThanTwoWindow {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\DO NOT DELETE\\ni3\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String WinId1 = driver.getWindowHandle();
		System.out.println("Primary Window id: "+WinId1);    //current window Id
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Thread.sleep(2000);
		Set<String>allWind = driver.getWindowHandles();
		for(String eachWindId:allWind) {
			driver.switchTo().window(eachWindId);
		if(driver.getTitle().contains("OrangeHRM HR Software |")) {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[text()='Contact Sales'])[2]")).click();
		}
		}
		Thread.sleep(1000);
		driver.switchTo().window(WinId1);
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
			
	}		
		
}
