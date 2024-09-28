package MMTSourceFile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MMT07_MultiCityTrip {

	@FindBy(xpath = "//li[@data-cy='mulitiCityTrip']")
	WebElement MultiTripButton;

	@FindBy(xpath = "(//span[@class='lbl_input appendBottom10'])[1]")
	WebElement From;

	@FindBy(xpath = "//input[@placeholder='From']")
	WebElement Input1;

	@FindBy(xpath = "(//span[@class='makeFlex flexOne spaceBetween appendRight10'])[1]")
	WebElement SFlight1;

	@FindBy(xpath = "(//span[@class='lbl_input appendBottom10'])[2]")
	WebElement ToAddress;

	@FindBy(xpath = "//input[@placeholder='To']")
	WebElement Input2;

	@FindBy(xpath = "(//div[@class='makeFlex column flexOne appendRight10'])[2]")
	WebElement SFlight2;

	@FindBy(xpath = "(//div[@class='dateInnerCell'])[45]")
	WebElement DDate;

	@FindBy(xpath = "(//span[@class='lbl_input appendBottom10'])[4]")
	WebElement TClass;

	@FindBy(xpath = "//li[@data-cy='adults-2']")
	WebElement Adults;

	@FindBy(xpath = "//li[@data-cy='travelClass-2']")
	WebElement Economy;

	@FindBy(xpath = "//button[@class='primaryBtn btnApply pushRight']")
	WebElement apply;

	@FindBy(xpath = "(//span[@class='lbl_input appendBottom10'])[6]")
	WebElement From02;

	@FindBy(xpath = "//input[@aria-controls='react-autowhatever-1']")
	WebElement Input03;

	@FindBy(xpath = "(//div[@class='makeFlex column flexOne'])[1]")
	WebElement Input03_select;

	@FindBy(xpath = "//input[@aria-controls='react-autowhatever-1']")
	WebElement Input04;

	@FindBy(xpath = "(//span[@class='makeFlex flexOne spaceBetween appendRight10'])[1]")
	WebElement selectInput04;
	
	@FindBy(xpath ="//span[@aria-label='Next Month']")
	WebElement nextmonth;
	
	@FindBy(xpath ="(//div[@class='dateInnerCell'])[15]")
	WebElement selectDate;
	
	@FindBy(xpath ="//a[@class='primaryBtn font24 latoBold widgetSearchBtn  fltWidgetSearchBtnMultiCity']")
	WebElement Search;

	public void MultiTrip() {
		MultiTripButton.click();
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

	public void From02() {
		From02.click();
	}

	public void input03(String Input) {
		Input03.sendKeys(Input);
	}

	public void Input03_select() {
		Input03_select.click();
	}

	public void Input04(String Name) {
		Input04.sendKeys(Name);
	}

	public void selectInput04() {
		selectInput04.click();
	}
	
	public void nextmonth()
	{
		nextmonth.click();
	}
	
	public void selectDate()
	{
		selectDate.click();
	}
	
	public void Search()
	{
		Search.click();
	}

	public MMT07_MultiCityTrip(ChromeDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
