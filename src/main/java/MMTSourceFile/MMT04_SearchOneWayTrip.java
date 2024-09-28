package MMTSourceFile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MMT04_SearchOneWayTrip {

	@FindBy(xpath = "(//span[@class='tabsCircle appendRight5'])[1]")
	WebElement OneWayButton;

	@FindBy(xpath = "//input[@id='fromCity']")
	WebElement From;

	@FindBy(xpath = "//input[@placeholder='From']")
	WebElement Input1;

	@FindBy(xpath = "(//span[@class='makeFlex flexOne spaceBetween appendRight10'])[1]")
	WebElement SFlight1;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement ToAddress;

	@FindBy(xpath = "//input[@placeholder='To']")
	WebElement Input2;

	@FindBy(xpath = "(//div[@class='makeFlex column flexOne appendRight10'])[2]")
	WebElement SFlight2;

	@FindBy(xpath = "(//div[@class='dateInnerCell'])[25]")
	WebElement DDate;

	@FindBy(xpath = "//span[@class='lbl_input appendBottom5']")
	WebElement TClass;

	@FindBy(xpath = "//li[@data-cy='adults-2']")
	WebElement Adults;

	@FindBy(xpath = "//li[@data-cy='travelClass-2']")
	WebElement Economy;

	@FindBy(xpath = "//button[@class='primaryBtn btnApply pushRight']")
	WebElement apply;


	@FindBy(xpath = "//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")
	WebElement Search;

	public void Oneway() {
		OneWayButton.click();
	}

	public void FAddress() {
		From.click();
	}

	public void FInput(String Name) {

		Input1.sendKeys(Name);

	}

	public void SFlight() {
		SFlight1.click();
	}

	public void ToAddress() {
		ToAddress.click();
	}

	public void Input2(String Name) {
		Input2.sendKeys(Name);
	}

	public void SFilght2() {
		SFlight2.click();
	}

	public void Depeature() {
		DDate.click();
	}

	public void TOption() {
		TClass.click();
	}

	public void Adults() {
		Adults.click();
	}


	public void Economy() {
		Economy.click();
	}

	public void apply() {
		apply.click();
	}


	public void Search() {
		Search.click();
	}

	public MMT04_SearchOneWayTrip(ChromeDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
