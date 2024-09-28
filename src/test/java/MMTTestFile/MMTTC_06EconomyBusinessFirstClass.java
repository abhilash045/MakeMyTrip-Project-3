package MMTTestFile;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import MMTSourceFile.MMT02_LoginPage;
import MMTSourceFile.MMT_06EconomyBusinessFirstClass;
import Utility.DataDrivenTesting;

public class MMTTC_06EconomyBusinessFirstClass extends MMT_LaunchQuit {

	@Test
	public void TravellerModule() throws InterruptedException, EncryptedDocumentException, IOException {

		DataDrivenTesting D1 = new DataDrivenTesting();
		D1.DDT_01();

		MMT02_LoginPage L1 = new MMT02_LoginPage(driver);

		Thread.sleep(5000);

		L1.WEmail();

		Thread.sleep(4000);

		L1.password();

		MMT_06EconomyBusinessFirstClass M1 = new MMT_06EconomyBusinessFirstClass(driver);
		Thread.sleep(3000);

		M1.skip();

		Thread.sleep(2000);

		M1.Traveller();

		Thread.sleep(2000);

		M1.Adults();

		Thread.sleep(2000);

		M1.TravelClass();
		Thread.sleep(2000);

		M1.apply();

	}

}
