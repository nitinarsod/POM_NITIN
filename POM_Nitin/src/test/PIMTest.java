package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PIMTest extends CommonTest{
	
		
	@Test(priority=3, groups={"smoke","regression"})
	public void verifyPimPageTitle() {
		pimpage.clickPimPageLink(){
		String verifyTitleofPim = pimpage.getPimPageTitle(){
		Assert.assertEquals(verifyTitleofPim, "PIM");
		}
		
	@Test(priority=4, groups={"smoke","regression"})
	public void verifyEmpSearchEmpId(){
		pimPage.setPimPageEmpId("0024");
		pimPage.clicksearchBtn();
		String verifyEmpIdAppeared = pimPage.getEmpIdFromSearchResults("0024");
		Assert.assertEquals(verifyEmpIdAppeared, "0024");
	}
	@Test(priority=5, groups={"smoke","regression"})
	public void verify(){
		Assert.assertEquals(true,true);
}
	}