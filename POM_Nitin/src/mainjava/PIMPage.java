package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class PIMPage extends BaseTest {

	@FindBy(xpath="//*[text()='PIM']")
	WebElement setPIMpage;
	
	@FindBy(xpath="//h6[text()='PIM']")
	WebElement titleofpimpage;
	
	public PIMPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/*Author      : Nitin D Arsod
	 *Date        : 05/02/2023 
	 *Description : This Test Method is use to click on pim page
	 */
	
	public void clickonPimpPge() {
		setPIMpage.click();
	}
	
	/*Author      : Nitin D Arsod
	 *Date        : 05/02/2023 
	 *Description : This Test Method is use to return pim page text
	 *parameter   : String
	 */
	
	public void getPimPageTitle() {
		return titleofpimpage.getText();
		
}
}