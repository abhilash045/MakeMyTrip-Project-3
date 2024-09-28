package MMTTestFile;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import MMTSourceFile.MMT02_LoginPage;
import MMTSourceFile.MMT12_SearchFlightLogout;
import MMTSourceFile.MMT_ClosingTab;
import Utility.DataDrivenTesting;

public class MMTTC_12LoginSearchLogOut extends MMT_LaunchQuit {

	@Test
	public void LoginLogout() throws EncryptedDocumentException, IOException, InterruptedException {

		DataDrivenTesting D1 = new DataDrivenTesting();
		D1.DDT_01();

		MMT02_LoginPage L1 = new MMT02_LoginPage(driver);
		Thread.sleep(5000);
		L1.WEmail();
		Thread.sleep(2000);
		L1.password();

		MMT_ClosingTab c1 = new MMT_ClosingTab(driver);
		Thread.sleep(5000);
		c1.Cbutton();

		MMT12_SearchFlightLogout S1 = new MMT12_SearchFlightLogout(driver);
		Thread.sleep(4000);
		
		S1.search();

		Thread.sleep(4000);

		S1.Profile();

		Thread.sleep(3000);

		S1.MyProfile();

		Thread.sleep(3000);

		S1.logout();

	}

}
