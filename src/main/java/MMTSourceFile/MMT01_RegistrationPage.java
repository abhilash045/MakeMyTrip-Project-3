package MMTSourceFile;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MMT01_RegistrationPage {

	@FindBy(xpath = "//input[@data-cy='MyBizLogin_119']")
	WebElement WorkEmail;

	@FindBy(xpath = "//span[@class='createMbAccount__btn flexOne appendLeft7']")
	WebElement Continue;

	@FindBy(xpath = "//input[@data-cy='FormField_144']")
	WebElement FullName;

	@FindBy(xpath = "//input[@data-cy='FormField_144']")
	WebElement Finput;
	
	@FindBy(xpath ="//input[@placeholder='Enter your mobile number']")
	WebElement MobileNumber;
	
	@FindBy(xpath ="//input[@placeholder='Enter your mobile number']")
	WebElement EnterNumber;
	
	@FindBy(xpath ="(//span[@class='appendLeft10 font14 blackText'])[4]")
	WebElement EmployeeButton;
	
	@FindBy(xpath ="//input[@name='orgName']")
	WebElement OrgName;
	
	@FindBy(xpath ="//input[@name='orgName']")
	WebElement OrgNameEnter;
	
	@FindBy(xpath ="//div[@class='customSel__text']")
	WebElement DropDown;

	public void WEmail(String Email) {
		WorkEmail.sendKeys(Email);
	}

	public void Continue() {
		Continue.click();
	}

	public void FullName() {
		FullName.click();
	}

	public void Finput(String Name) {
		Finput.sendKeys(Name);
	}
	
	public void MobileNumber()
	{
		MobileNumber.click();
	}
	
	public void EnterNumber(String Number)
	{
		EnterNumber.sendKeys(Number);
	}
	
	public void EmployeeButton()
	{
		EmployeeButton.click();
	}
	
	public void OrgName()
	{
		OrgName.click();
	}

	public void OrgNameEnter(String Name)
	{
		OrgNameEnter.sendKeys(Name);
	}
	
	public void DropDown()
	{
		DropDown.click();
	}
	
	
	public MMT01_RegistrationPage(ChromeDriver driver) {

		PageFactory.initElements(driver, this);
	}
}
