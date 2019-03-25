package screenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenShot {
	public static void scrPrint(WebDriver webdriver,String fileName) throws IOException
	{
		TakesScreenshot scrprt=(TakesScreenshot)(webdriver);
		File scr1 = scrprt.getScreenshotAs(OutputType.FILE);
		File dest1 =new File("C://Users//sangavi//Desktop//Screenshots//"+fileName+".jpg");
		FileUtils.copyFile(scr1,dest1);
	}
}
