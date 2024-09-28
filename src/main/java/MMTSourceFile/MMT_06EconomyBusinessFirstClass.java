package MMTSourceFile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MMT_06EconomyBusinessFirstClass {

	@FindBy(xpath = "//span[@class='cursorPointer greyText capText pushRight latoBold font12']")
	WebElement skip;

	@FindBy(xpath = "(//p[@class='blackText font20 code lineHeight36'])[2]")
	WebElement Traveller;

	@FindBy(xpath = "//li[@data-cy='adults-3']")
	WebElement Adults;
	
	@FindBy(xpath ="//li[@data-cy='travelClass-2']")
	WebElement TravelClass;
	
	@FindBy(xpath ="//button[@data-cy='travellerApplyBtn']")
	WebElement apply;

	public void skip() {
		skip.click();
	}

	public void Traveller() {
		Traveller.click();
	}

	public void Adults() {
		Adults.click();
	}
	
	
	public void TravelClass()
	{
		TravelClass.click();
	}

	public void apply()
	{
		apply.click();
	}
	
	public MMT_06EconomyBusinessFirstClass(ChromeDriver driver) {

		PageFactory.initElements(driver, this);

	}

}
