package seleniumdemoprogram;

public class BrowserTest extends CodeForBrowserInitialization {
	
	public static void main(String[]args) {
		browserInit("edge");
		driver.get("https://twitter.com/i/flow/login");
	}
}
