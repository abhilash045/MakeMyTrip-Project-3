package MMTTestFile;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class MMTTC_08TestCase {
	ChromeDriver driver;

	@BeforeMethod
	public void Launch() {

		driver = new ChromeDriver();

		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();

	}

	@AfterMethod

	public void Quit() {

		// driver.quit();
	}

}
