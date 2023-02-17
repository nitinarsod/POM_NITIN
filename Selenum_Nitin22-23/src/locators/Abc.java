package locators;

import seleniumdemoprogram.CodeForBrowserInitialization;

public class Abc extends CodeForBrowserInitialization {
		public boolean CheckTitle(String title) {
			String titlepage = driver.getTitle();
			if (titlepage.equals(title)) 
				return true;
			else 	
				return false;
	}			
	public boolean CheckUrl(String url) {
		String pageofurl = driver.getCurrentUrl();
		if(pageofurl.equals(url))
			return true;
		else 
			return false;
	}
				
	public static void main(String[]args) throws InterruptedException {
		browserInit("chrome");
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		Abc checkk = new Abc();
		System.out.println(checkk.CheckTitle("Facebook"));
		System.out.println(checkk.CheckUrl("https://www.facebook.com"));

		driver.quit();	
		
	}


	}

