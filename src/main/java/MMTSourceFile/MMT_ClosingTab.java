package MMTSourceFile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MMT_ClosingTab {

	@FindBy(xpath = "//span[@class='cursorPointer greyText capText pushRight latoBold font12']")
	WebElement CloseButton;

	public void Cbutton() {
		CloseButton.click();
	}

	public MMT_ClosingTab(ChromeDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
