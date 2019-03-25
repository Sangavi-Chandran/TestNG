package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SkipSignInPage {
@FindBy(xpath="//button[@id='btn2']")
WebElement btnSkipSignIn;

public void SkipSign()
{
	btnSkipSignIn.click();	
}
}
