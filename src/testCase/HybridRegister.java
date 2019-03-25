package testCase;

import org.testng.annotations.Test;

import Pages.RegisterPage;
import testDataAccess.ExcelData;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;

public class HybridRegister {
	WebDriver driver;
	public static String data[][];
  @Test
  public void registerPage() throws InterruptedException
  {
	  RegisterPage regPage=new RegisterPage();
	  regPage.Register(driver);
  }
  
  
 
  @BeforeClass
  public void URLLaunch() throws IOException {
	  data = ExcelData.getDataFromExcel("HybridDriven.xls", "DataD");
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sangavi\\Desktop\\Jars\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
  }

  @AfterClass
  public void ExitURL() {
	  driver.close();
  }

}
