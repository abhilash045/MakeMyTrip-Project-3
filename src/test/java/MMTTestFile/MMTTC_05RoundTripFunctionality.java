package MMTTestFile;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import MMTSourceFile.MMT02_LoginPage;
import MMTSourceFile.MMT05_RoundTrip;
import MMTSourceFile.MMT_ClosingTab;
import Utility.DataDrivenTesting;

public class MMTTC_05RoundTripFunctionality extends MMT_LaunchQuit {

	@Test // (retryAnalyzer = Utility.Retry02.class)
	public void SearchFlight() throws InterruptedException, EncryptedDocumentException, IOException {

		DataDrivenTesting D1 = new DataDrivenTesting();
		D1.DDT_01();

		MMT02_LoginPage L1 = new MMT02_LoginPage(driver); //------->Login Credentials
		Thread.sleep(5000);
		L1.WEmail();
		Thread.sleep(2000);
		L1.password();

		MMT_ClosingTab M1 = new MMT_ClosingTab(driver);
		Thread.sleep(3000);
		M1.Cbutton();

		MMT05_RoundTrip S1 = new MMT05_RoundTrip(driver);

		Thread.sleep(2000);

		S1.RoundTrip();

		Thread.sleep(2000);
		S1.FAddress();
		Thread.sleep(2000);
		S1.FInput("Hyderabad");
		Thread.sleep(2000);
		S1.SFlight();
		Thread.sleep(2000);

		S1.ToAddress();
		Thread.sleep(2000);
		S1.Input2("Goa");
		Thread.sleep(2000);
		S1.SFilght2();

		Thread.sleep(2000);

		S1.Depeature();

		Thread.sleep(2000);

		S1.Return();

		Thread.sleep(2000);

		S1.RDate();

		Thread.sleep(2000);

		S1.TOption();

		Thread.sleep(2000);

		S1.Adults();

		Thread.sleep(2000);

		S1.Economy();

		S1.apply();

		Thread.sleep(2000);

		S1.Search();

	}

}
