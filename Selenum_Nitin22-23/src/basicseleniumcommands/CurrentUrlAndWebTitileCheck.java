package basicseleniumcommands;

import seleniumdemoprogram.CodeForBrowserInitialization;

public class CurrentUrlAndWebTitileCheck extends CodeForBrowserInitialization {
	
	public boolean checkInTitleofPage(String title) {
		String titleofPage = driver.getTitle();
	
		if(titleofPage.equals(title))
			return true;
		else
			return false;
	}
	public boolean checkUrlOfCurrentPage(String url) {
		String urlOfCurrentWebPage = driver.getCurrentUrl();
		
		if(urlOfCurrentWebPage.equals(url))
			return true;
		else
			return false;
	}
	public static void main(String[]args){
		browserInit("chrome");
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		CurrentUrlAndWebTitle obCheck = new CurrentUrlAndWebTitle();
	//System.out.println(obCheck.checkInTitleofPage("Intagram"));
	//System.out.println(obCheck.checkUrlOfCurrentPage("https://www.instagram.com/"));
		
	  //System.out.println(obCheck.checkInTitleofPage("Intagram"));
	  //System.out.println(obCheck.checkUrlOfCurrentPage("https://www.instagram.com/"));
		driver.quit();
	}
}
	

