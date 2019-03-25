package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WindowsHandle {
@FindBy(xpath="//a[contains(text(),'Open New Tabbed Windows ')]")
WebElement btnNewTab;

@FindBy(xpath="//a[contains(text(),'Open New Seperate Windows')]")
WebElement btnSeperateWindow;

@FindBy(xpath="//a[contains(text(),'Open Seperate Multiple Windows')]")
WebElement btnMultipleWindow;

}
