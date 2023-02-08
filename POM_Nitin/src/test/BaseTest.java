package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import mainjava.BaseClass;
import mainjava.DashboardPage;
import mainjava.LoginPage;
import mainjava.PIMPage;

public class BaseTest extends BaseClass {
	
	@BeforeSuite
    public void initBrowser() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();            //this driver guide to base class driver
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@BeforeClass
	public void pageObject() {
		loginpage = new LoginPage(driver);        // method of testcase  // driver argument 
		 dashboardpage = new DashboardPage(driver);
		 pimpage = new PIMPage(driver);
	}
	@AfterClass
	public void logoutuser() {
		dashboardpage.logout();
		
	}
	
	@AfterSuite
	public void tearDownEnvironment() {       // after class to close environment
		driver.quit();      //if not log out directly to write code of log out
	}
}
