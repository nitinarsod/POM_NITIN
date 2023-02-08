package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {            // to write test cases
                                                     // extends is use to run browser first then test start
	@Test(priority=0, groups= {"smoke","regression"})    //url launch at before class
	public void verifyTitleofLoginPage() {
		String verifytitleofloginpage = loginpage.titleofLoginpage();
		Assert.assertEquals(verifytitleofloginpage, "Login");
}
	
	@Test(priority=1, groups= {"smoke","regression"})
	public void CurrentUrlofPage() {
	String verifyurlofpage = loginpage.urlofpage();
	Assert.assertEquals(verifyurlofpage, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}	
	
	@Test(priority=2, groups= {"smoke","regression"})
	public void verifyLoginWithCorrectcredentials() {
		loginpage.setUserName("Admin");
		loginpage.setPassword("admin123");
		loginpage.clickLoginButton();
		String titleofDash= dashboardpage.titleofDashboardPage();
		Assert.assertEquals(titleofDash, "Dashboard");
	}
	@Test(priority=-1, groups= {"smoke","regression"})
	public void verifyBuildTitleName() {
		String verifytitleofbuild = loginpage.getbuildtitle();
		Assert.assertEquals(verifytitleofbuild, "OrangeHRM");
	}
}
