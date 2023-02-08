package test;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;

public class CommonTest extends BaseTest {
	
	@Beforeclass
	public void login() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.setUserName("Admin");
		loginPage.setPasswird("admin123");
		loginPage.clickLoginBtn();
		String titleofDash = dashBoardPage.titleofDashBoardPage();
			Assert.assertEquals(titleofDash, "Dashboatd");
	
	
		}
}
