package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static WebDriver driver;
	
	public void screenShot(String filename) throws IOException{
	TakesScreenshot scrnshot= (TakesScreenshot)driver;
	File source = scrnshot.getScreenshotAs(OutputType.FILE);
	File destination = new File  ("E:\\picture\\"+filename+".png");
	FileHandler.copy(source, destination);
	
	}
	
}
