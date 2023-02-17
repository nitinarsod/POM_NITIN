package basicseleniumcommands;

import seleniumdemoprogram.CodeForBrowserInitialization;

public class Test extends CodeForBrowserInitialization {
	
	public static void main(String[]args) {
		
		browserInit("chrome");
		driver.get("https://twitter.com/i/flow/login");
		driver.manage().window().maximize();
		driver.get("https://https://www.youtube.com/");
		driver.get("https://https://www.instagram.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	//	driver.close();   // close only browser curent tab
		driver.quit();	  // close entire browser
	}
}
