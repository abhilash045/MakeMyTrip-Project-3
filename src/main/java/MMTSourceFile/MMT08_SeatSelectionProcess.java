package MMTSourceFile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MMT08_SeatSelectionProcess {

	@FindBy(xpath = "//span[@data-cy='closeModal']")
	WebElement closeButton;

	public void close() {
		closeButton.click();

	}

	public MMT08_SeatSelectionProcess(ChromeDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
