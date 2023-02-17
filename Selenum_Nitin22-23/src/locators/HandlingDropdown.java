package locators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropdown {
	
public static void main (String[]args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\DO NOT DELETE\\ni3\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mbasic.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//year 
		List<WebElement> years = driver.findElements(By.xpath("//*[@id='year']//option"));
		for(WebElement year:years)
		if(year.getText().equals("1995"))
			year.click();
		
		//month
		List<WebElement> months = driver.findElements(By.xpath("//*[@id='month']//option"));
		for(WebElement month:months)
		if(month.getText().equals("6"))
			month.click();
		
	     //day
		List<WebElement> days = driver.findElements(By.xpath("//*[@id='day']//option"));
		for(WebElement day:days)
		if(day.getText().equals("19"))
			day.click();	
}
}
