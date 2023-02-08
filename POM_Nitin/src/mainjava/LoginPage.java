package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class LoginPage extends BaseTest {       //in login page to write all methods
	                                            //login page extends to basetest and basetest extends to baseclass
	// All the Locators of page  
	
	@FindBy(xpath ="//*[text()='Login']")       //we have browser initialiazation thts why extends to basetest
	WebElement txtLoginPage;
	
	@FindBy(name ="username")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement passWord;
	
	@FindBy(tagName="button")
	WebElement btnLogin;
	
	
	// Initialization of Locators/variables
	  public LoginPage(WebDriver driver) {               // driver initialization // cretae constructor
		    this.driver=driver;                    // to match global and local variable
		    PageFactory.initElements(driver, this);
	  }
	
	// methods required to perform test steps

/*Author      : Nitin D Arsod
 *Date        : 05/02/2023
 *Description : This Test Method is use to Verify login page Title
 *Parameter return : String 
 */
	
public String titleofLoginpage() {        //test case
	return txtLoginPage.getText();
}	
/*Author      : Nitin D Arsod
 *Date        : 05/02/2023
 *Description : This Test Method is use to Verify current url of page 
 *Parameter return : String 
 */

public String urlofpage() {
      return driver.getCurrentUrl();               //verify currenrt url page method put

}
/*Author      : Nitin D Arsod
 *Date        : 05/02/2023
 *Description : This Test Method is use to set username value 
 *Parameter return : String 
 */


public void setUserName(String username) {
	userName.sendKeys(username);
	
}                                               
/*Author      : Nitin D Arsod
 *Date        : 05/02/2023
 *Description : This Test Method is use to set password value
 */                                                                        // written separatelly
                                                                        //single purpose driven function method
public void setPassword(String password) {
	passWord.sendKeys(password);
	
}
/*Author      : Nitin D Arsod
 *Date        : 05/02/2023 
 *Description : This Test Method is use to set click on login button
 */

public void clickLoginButton() {
	btnLogin.click();
}
/*Author      : Nitin D Arsod
 *Date        : 05/02/2023 
 *Description : This Test Method is use to get title of build
 *Parameter return : String 
 */

public String getbuildtitle() {
	 return driver.getTitle();
}
}
