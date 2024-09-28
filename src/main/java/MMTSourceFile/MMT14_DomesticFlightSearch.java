package MMTSourceFile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MMT14_DomesticFlightSearch {

	@FindBy(xpath = "//span[@class='cursorPointer greyText capText pushRight latoBold font12']")
	WebElement skip;

	@FindBy(xpath = "(//a[@class='darkGreyText'])[2]")
	WebElement Domestic;

	@FindBy(xpath = "//input[@id='fromCity']")
	WebElement FromAddress;

	@FindBy(xpath = "//input[@placeholder='From']")
	WebElement FInput1;

	@FindBy(xpath = "(//span[@class='makeFlex flexOne spaceBetween appendRight10'])[1]")
	WebElement SFlight1;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement ToAddress;

	@FindBy(xpath = "//input[@placeholder='To']")
	WebElement Input2;

	@FindBy(xpath = "(//div[@class='makeFlex column flexOne appendRight10'])[2]")
	WebElement SFlight2;

	@FindBy(xpath = "//span[@aria-label='Next Month']")
	WebElement NextMove;

	@FindBy(xpath = "(//div[@class='dateInnerCell'])[15]")
	WebElement DDate;

	@FindBy(xpath = "(//span[@class='lbl_input appendBottom10'])[4]")
	WebElement Returntab;

	@FindBy(xpath = "(//div[@class='dateInnerCell'])[57]")
	WebElement RDate;

	@FindBy(xpath = "//span[@data-cy='travellerText']")
	WebElement Traveller;

	@FindBy(xpath = "//li[@data-cy='adults-3']")
	WebElement Adults;

	@FindBy(xpath = "//li[@data-cy='children-2']")
	WebElement Children;

	@FindBy(xpath = "//li[@data-cy='infants-1']")
	WebElement Infants;

	@FindBy(xpath = "//li[@data-cy='travelClass-2']")
	WebElement TravelClass;

	@FindBy(xpath = "//button[@data-cy='travellerApplyBtn']")
	WebElement apply;

	@FindBy(xpath = "//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")
	WebElement Search;

	public void skip() {
		skip.click();
	}

	public void Domestic() {
		Domestic.click();
	}

	public void FAddress() {
		FromAddress.click();
	}

	public void FInput(String Name) {

		FInput1.sendKeys(Name);

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

	public void NextMove() {
		NextMove.click();
	}

	public void DDate() {
		DDate.click();
	}

	public void Returntab() {
		Returntab.click();
	}

	public void RDate() {
		RDate.click();
	}

	public void Traveller() {
		Traveller.click();
	}

	public void Adults() {
		Adults.click();
	}

	public void Children() {
		Children.click();
	}

	public void Infants() {
		Infants.click();
	}

	public void TravelClass() {
		TravelClass.click();
	}

	public void apply() {
		apply.click();
	}

	public void Search() {
		Search.click();

	}

	public MMT14_DomesticFlightSearch(ChromeDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
