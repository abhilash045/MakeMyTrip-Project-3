package MMTSourceFile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MMT13_couponCode {

	@FindBy(xpath = "//span[@class='cursorPointer greyText capText pushRight latoBold font12']")
	WebElement skip;

	@FindBy(xpath = "//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")
	WebElement Search;
	
	@FindBy(xpath ="(//div[@class='tcBtnWpr'])[1]") 
	WebElement ViewFar;
	
	@FindBy(xpath ="(//button[@class='primaryBtn oval smallActnBtn'])[1]")
	WebElement Booknow;
	
	@FindBy(xpath ="//span[@class='customRadiobtn radioDot']/input[@id='CFOSALE']")
	WebElement CoupenCode;

	public void skip() {
		skip.click();
	}

	public void Search() {
		Search.click();
	}
	
	public void ViewFar()
	{
		ViewFar.click();
	}
	
	public void Booknow()
	{
		Booknow.click();
	}
	
	public void Coupen()
	{
		CoupenCode.click();
	}

	public MMT13_couponCode(ChromeDriver driver) {

		PageFactory.initElements(driver, this);

	}

}
