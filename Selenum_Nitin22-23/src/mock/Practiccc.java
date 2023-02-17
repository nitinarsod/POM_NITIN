package mock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practiccc {

		public static void main(String[]args) {
			 String title = "facebook";
			 WebDriver driver;
			 System.setProperty("webdriver.chrome.driver",
					 "C:\\DO NOT DELETE\\ni3\\chromedriver_win32 (1)\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.get("https://mbasic.facebook.com/");
			 String actualtitle = driver.getTitle();
			 if (actualtitle.equals(title)) {
				 System.out.println("pass");
			 }
			 else {
				 System.out.println("fail");
		}
	}

}
