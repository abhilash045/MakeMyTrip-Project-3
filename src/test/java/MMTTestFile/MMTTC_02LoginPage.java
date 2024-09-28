package MMTTestFile;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import MMTSourceFile.MMT02_LoginPage;
import Utility.DataDrivenTesting;

public class MMTTC_02LoginPage extends MMT_LaunchQuit {

	@Test
	public void login() throws InterruptedException, EncryptedDocumentException, IOException {

		DataDrivenTesting D1 = new DataDrivenTesting();
		D1.DDT_01();

		MMT02_LoginPage L1 = new MMT02_LoginPage(driver);

		Thread.sleep(5000);

		L1.WEmail();

		Thread.sleep(2000);

		L1.password();

	}

}
