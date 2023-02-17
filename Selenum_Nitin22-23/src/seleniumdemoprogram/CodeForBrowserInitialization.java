package seleniumdemoprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
 * @author Nitin Arsod
 * @date:date("yyyy/mm/dd")
 * 
 */
public class CodeForBrowserInitialization {
	
	public static WebDriver driver;
	
	
	
	public static WebDriver browserInit(String browser) {
	       System.setProperty("WebDriver.edge.driver",
	    		   "C:\\DO NOT DELETE\\edgedriver_win64\\msedgedriver.exe");
	       
	       System.setProperty("WebDriver.chrome.driver",
	    		   "C:\\DO NOT DELETE\\ni3\\chromedriver_win32 (1)\\chromedriver.exe");
	       
	       if(browser.equals("edge"))
	    	   driver=new EdgeDriver();
	       if(browser.equals("chrome"))
	    	   driver=new ChromeDriver();
	       return driver;
	       
	}
}
