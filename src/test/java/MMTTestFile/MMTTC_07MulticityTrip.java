package MMTTestFile;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import MMTSourceFile.MMT02_LoginPage;
import MMTSourceFile.MMT07_MultiCityTrip;
import MMTSourceFile.MMT_ClosingTab;
import Utility.DataDrivenTesting;

public class MMTTC_07MulticityTrip extends MMT_LaunchQuit {

	@Test // (retryAnalyzer = Utility.Retry02.class)
	public void MulticityFlight() throws InterruptedException, EncryptedDocumentException, IOException {

		DataDrivenTesting D1 = new DataDrivenTesting();
		D1.DDT_01();

		MMT02_LoginPage L1 = new MMT02_LoginPage(driver); // ------->Login Credentials
		Thread.sleep(5000);
		L1.WEmail();
		Thread.sleep(2000);
		L1.password();

		MMT_ClosingTab M1 = new MMT_ClosingTab(driver);
		Thread.sleep(3000);
		M1.Cbutton();

		MMT07_MultiCityTrip S1 = new MMT07_MultiCityTrip(driver);

		Thread.sleep(2000);
		S1.MultiTrip();
		Thread.sleep(4000);

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

		Thread.sleep(4000);

		S1.TOption();

		Thread.sleep(2000);

		S1.Adults();

		Thread.sleep(2000);

		S1.Economy();

		S1.apply();

		Thread.sleep(2000);

		S1.From02();

		Thread.sleep(2000);
		
		S1.input03("agra");
		
		Thread.sleep(2000);
		
		S1.Input03_select();
		
		Thread.sleep(2000);
		
		S1.Input04("Mumbai");
		
		Thread.sleep(2000);
		
		S1.selectInput04();
		
		Thread.sleep(2000);
		
		S1.nextmonth();
		
		Thread.sleep(2000);
		
		S1.selectDate();
		
		Thread.sleep(2000);
		
		S1.Search();

	}

}
