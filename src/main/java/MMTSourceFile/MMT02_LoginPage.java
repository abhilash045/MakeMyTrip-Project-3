package MMTSourceFile;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.DataDrivenTesting;

public class MMT02_LoginPage extends DataDrivenTesting {

	@FindBy(xpath = "//input[@placeholder='Enter your work email id']")
	WebElement WorkEmail;


	@FindBy(xpath = "//input[@data-cy='MyBizPassword_128']")
	WebElement Password;

	public void WEmail() {
		WorkEmail.sendKeys(un + Keys.ENTER);
	}

	public void password() {
		Password.sendKeys(pswd + Keys.ENTER);
	}

	public MMT02_LoginPage(ChromeDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
