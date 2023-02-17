package basicseleniumcommands;

import seleniumdemoprogram.CodeForBrowserInitialization;

public class CurrentUrlAndWebTitle extends CodeForBrowserInitialization {
	
	public void checkInTitleofPage(String title) {
		String titleofPage = driver.getTitle();
		
		if(titleofPage.equals(title))
			System.out.println("Test Is Pass");
		else
			System.out.println("Test Is Fail");
	}
	public void checkUrlOfCurrentPage(String url) {
		String urlOfCurrentWebPage = driver.getCurrentUrl();
		
		if(urlOfCurrentWebPage.equals(url))
			System.out.println("Test Is Pass");
		else
			System.out.println("Test Is Fail");
	}
	
	public static void main(String[]args) {
		browserInit("chrome");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		CurrentUrlAndWebTitle obCheck = new CurrentUrlAndWebTitle();
		obCheck.checkInTitleofPage("Pacebook");   //test 1
		obCheck.checkUrlOfCurrentPage("https://www.facebook.com/");    // test 2
		driver.quit();
	}
}
