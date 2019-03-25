package testCase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.SkipSignInPage;

public class HybridSkipSignIn {

	WebDriver driver;
	
	@Test
	public void Skipsign(){

String title=driver.getTitle();
System.out.println(title);
SkipSignInPage obj1=new SkipSignInPage();
PageFactory.initElements(driver, obj1);
	obj1.SkipSign();
	}
	@BeforeTest
	  public void URLLaunch() throws IOException {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sangavi\\Desktop\\Jars\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://demo.automationtesting.in/");
	  }

	  @AfterTest
	  public void ExitURL() {
		 driver.close();
		  
	
	
}
}
