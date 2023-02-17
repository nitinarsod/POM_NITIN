package datepicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapCalender {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\DO NOT DELETE\\ni3\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("datepicker1")).click();
		
		Thread.sleep(500);
		
		int i=0;
		while(i==0) {
		     String	monthYear = driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
		     if(!(monthYear.equals("June 2000")))
		        driver.findElement(By.xpath("//*[text()='Prev']")).click();
		     else
		        break;
		}
		
		driver.findElement(By.xpath("//*[text()='19']")).click();  
		
		}
		
	}

