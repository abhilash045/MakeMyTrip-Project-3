package MMTSourceFile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MMT12_SearchFlightLogout {

	@FindBy(xpath = "//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")
	WebElement Search;

	@FindBy(xpath = "//span[@class='chUserInfoName latoBold']")
	WebElement Profile;

	@FindBy(xpath = "//p[@class='font16 latoBold blackText appendBottom5 makeFlex hrtlCenter']")
	WebElement MyProfile;

	@FindBy(xpath = "//li[@data-cy='Logout_SNB']")
	WebElement Logout;

	public void search() {
		Search.click();
	}

	public void Profile() {
		Profile.click();
	}

	public void MyProfile() {
		MyProfile.click();
	}
	
	public void logout()
	{
		Logout.click();
	}

	public MMT12_SearchFlightLogout(ChromeDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
