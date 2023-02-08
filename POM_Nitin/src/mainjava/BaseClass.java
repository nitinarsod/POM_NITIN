package mainjava;

import org.openqa.selenium.WebDriver;

public abstract class BaseClass {        // do not create object thats the reason we made abstract
	//only create variables to use whole project
	
	public static WebDriver driver;
	 protected LoginPage loginpage;
	 protected DashboardPage dashboardpage;
	 protected PIMPage pimpage;
}
