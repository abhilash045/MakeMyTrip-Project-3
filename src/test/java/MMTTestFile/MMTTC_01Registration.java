package MMTTestFile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import MMTSourceFile.MMT01_RegistrationPage;

public class MMTTC_01Registration extends MMT_LaunchQuit {

	@Test
	public void Registration() throws InterruptedException {

		MMT01_RegistrationPage M1 = new MMT01_RegistrationPage(driver);

		Thread.sleep(5000);

		M1.WEmail("mixohos889@ploncy.com");

		M1.Continue();

		Thread.sleep(2000);

		M1.FullName();

		Thread.sleep(2000);

		M1.Finput("Akhil varma");

		Thread.sleep(2000);
		M1.MobileNumber();

		Thread.sleep(2000);

		M1.EnterNumber("6300338809");

		Thread.sleep(2000);

		M1.EmployeeButton();

		Thread.sleep(2000);

		M1.OrgName();

		Thread.sleep(2000);

		M1.OrgNameEnter("Recruting Company");

		Thread.sleep(2000);

		M1.DropDown();

		// M1.Signin();

	}

}
