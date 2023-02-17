package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class HandlingDropdownUsingSelect {
	
public static void main (String[]args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\DO NOT DELETE\\ni3\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//year
		WebElement year=driver.findElement(By.id("year"));
		Select y = new Select(year);
		y.selectByVisibleText("1995");
		
		//month
		WebElement month=driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByValue("7");
		
		//day
		WebElement day=driver.findElement(By.id("day"));
		Select d = new Select(day);
		d.selectByValue("19");
		
		driver.quit();
		
}
}
