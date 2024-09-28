package MMTTestFile;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import MMTSourceFile.MMT02_LoginPage;
import MMTSourceFile.MMT14_DomesticFlightSearch;
import Utility.DataDrivenTesting;

public class MMTTC_14DomesticFlightSearch extends MMT_LaunchQuit {

	@Test
	public void DomesticFlight() throws EncryptedDocumentException, IOException, InterruptedException {

		DataDrivenTesting D1 = new DataDrivenTesting();
		D1.DDT_01();

		MMT02_LoginPage L1 = new MMT02_LoginPage(driver);

		Thread.sleep(5000);

		L1.WEmail();

		Thread.sleep(2000);

		L1.password();

		MMT14_DomesticFlightSearch A1 = new MMT14_DomesticFlightSearch(driver);

		Thread.sleep(5000);

		A1.skip();

		Thread.sleep(2000);

		A1.Domestic();

		Thread.sleep(2000);

		A1.FAddress();

		Thread.sleep(2000);

		A1.FInput("Hyderabad");

		Thread.sleep(2000);

		A1.SFlight();

		Thread.sleep(2000);

		A1.ToAddress();

		Thread.sleep(2000);

		A1.Input2("Goa");

		Thread.sleep(2000);

		A1.SFilght2();

		Thread.sleep(2000);

		A1.NextMove();

		Thread.sleep(2000);

		A1.DDate();

		Thread.sleep(2000);

		A1.Returntab();

		Thread.sleep(2000);

		A1.RDate();

		Thread.sleep(2000);

		A1.Traveller();

		Thread.sleep(2000);

		A1.Adults();

		Thread.sleep(2000);

		A1.Children();

		Thread.sleep(2000);

		A1.Infants();

		Thread.sleep(2000);

		A1.TravelClass();

		Thread.sleep(2000);

		A1.apply();

		Thread.sleep(2000);

		A1.Search();

	}

}
