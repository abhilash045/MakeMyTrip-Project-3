package MMTTestFile;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class MMT_LaunchQuit {

	ChromeDriver driver;

	@BeforeMethod
	public void Launch() {

		driver = new ChromeDriver();

		driver.get("https://mybiz.makemytrip.com/"); // Registration

		// driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();

	}

	@AfterMethod

	public void Quit() {

		// driver.quit();
	}

}
