package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import testCase.HybridRegister;

public class RegisterPage {
	
	String data[][];	

@FindBy(xpath="//input[@placeholder='First Name']")
WebElement txtFirstName;

@FindBy(xpath="//input[@placeholder='Last Name']")
WebElement txtLastName;

@FindBy(xpath="//input[@ng-model='EmailAdress']")
WebElement txtEmail;

@FindBy(xpath="//input[@ng-model='Phone']")
WebElement txtPhoneno;

@FindBy(xpath="//input[@ng-model='radiovalue' and @value='FeMale']")
WebElement radFeMale;

@FindBy(xpath="//input[@ng-model='radiovalue' and @value='Male']")
WebElement radMale;

@FindBy(xpath="//select[@ng-model='country']")
WebElement drpCountry;

@FindBy(xpath="//select[@ng-model='yearbox']")
WebElement drpYear;

@FindBy(xpath="//select[@ng-model='monthbox']")
WebElement drpMonth;

@FindBy(xpath="//select[@ng-model='daybox']")
WebElement drpDay;

@FindBy(xpath="//input[@ng-model='Password']")
WebElement txtPassword;

@FindBy(xpath="//input[@ng-model='CPassword']")
WebElement txtCPassword;

@FindBy(xpath="//button[@id='submitbtn']")
WebElement btnClick;


public void Register(WebDriver driver) throws InterruptedException
{
	
	for(int i=1;i<HybridRegister.data.length;i++)
	  {
		driver.get("http://demo.automationtesting.in/Register.html");
		  String FirstName = data[i][0];
		  String LastName = data[i][1];
		  String Email= data[i][2];
		  String Phone= data[i][3];
		  String Gender= data[i][4];
		  String Country= data[i][5];
		  String Year= data[i][6];
		  String Month= data[i][7];
		  String Day= data[i][8];
		  String Password= data[i][9];
		  String CPassword= data[i][10];
		  
		  txtFirstName.sendKeys(FirstName);
			txtLastName.sendKeys(LastName);
			txtEmail.sendKeys(Email);
			txtPhoneno.sendKeys(Phone);
			
			if(Gender.equalsIgnoreCase("FeMale")){
			radFeMale.click();}
			else
			radMale.click();
			
			Select dropdown=new Select(this.drpCountry); 
			Thread.sleep(2000);
			dropdown.selectByVisibleText(Country);
			
			Select dropdown1=new Select(drpYear); 
			dropdown1.selectByVisibleText( Year );
			
			Select dropdown2=new Select(drpMonth); 
			dropdown2.selectByVisibleText( Month );
			
			Select dropdown3=new Select(drpDay); 
			dropdown3.selectByVisibleText(Day);
			
			txtPassword.sendKeys(Password);
			txtCPassword.sendKeys(CPassword);
			
			btnClick.click();
			
				}
}
}
