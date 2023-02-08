package mainjava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class DashboardPage extends BaseTest {
	//verification point after put login test cases
	
	
	// All the Locators of page
	@FindBy(xpath = "//h6[text()='Dashboard']")
	WebElement titleDashBoard;
	
	@FindBy(css=".oxd-userdropdown i")
	WebElement clickLogoutDropDown;
	
	@FindBy(xpath="//*[text()='Logout']")
	WebElement txtlogout;
	
	// Initialization of Locators/variables
	public DashboardPage(WebDriver driver) {                    //constructor
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//all method on page
	
	/*Author      : Nitin D Arsod
	 *Date        : 05/02/2023 
	 *Description : This Test Method is use to set click on login button
	 *Parameter return : String 
	 */
	public String titleofDashboardPage() {
        return titleDashBoard.getText();
}

	/*Author      : Nitin D Arsod
	 *Date        : 08/02/2023 
	 *Description : This Test Method is use to set logout from build
	 *Parameter return : String 
	 */
	
	public void logout() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().refresh();
		clickLogoutDropDown.click();	
		txtlogout.click();
}
}	