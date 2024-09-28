package MMTTestFile;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import MMTSourceFile.MMT02_LoginPage;
import MMTSourceFile.MMT13_couponCode;
import Utility.DataDrivenTesting;

public class MMTTC_13couponCodeValidation extends MMT_LaunchQuit {

	@Test
	public void CopenCode() throws InterruptedException, EncryptedDocumentException, IOException {
		DataDrivenTesting D1 = new DataDrivenTesting();
		D1.DDT_01();

		MMT02_LoginPage L1 = new MMT02_LoginPage(driver);

		Thread.sleep(5000);

		L1.WEmail();

		Thread.sleep(2000);

		L1.password();

		MMT13_couponCode L2 = new MMT13_couponCode(driver);

		Thread.sleep(4000);

		L2.skip();

		Thread.sleep(5000);

		L2.Search();

		Thread.sleep(6000);

		L2.ViewFar();
		
		Thread.sleep(6000);

		L2.Booknow();
		
		Thread.sleep(10000);
		
		//L2.Coupen();
	}
}
