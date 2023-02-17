package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogintoFb {
	
	public static void main (String[]args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\DO NOT DELETE\\ni3\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://m.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#m_login_email")).sendKeys("Nitin");
		driver.findElement(By.cssSelector("#m_login_password")).sendKeys("Nitin12345");
		driver.findElement(By.cssSelector("._54k8._52jh._56bs._56b_._28lf._9cow._56bw._56bu")).click();	
	}

}
