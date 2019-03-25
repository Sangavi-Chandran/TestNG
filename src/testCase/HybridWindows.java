package testCase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HybridWindows {
	
	WebDriver driver;
	@BeforeClass
	  public void URLLaunch() throws IOException {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sangavi\\Desktop\\Jars\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
	  }

	  @AfterClass
	  public void ExitURL() {
		  driver.close();
	  }

	  @Test
	  public void windowsHandle()
	  {
		  
	  }
}
