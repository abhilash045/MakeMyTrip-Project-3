package MMTTestFile;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import MMTSourceFile.MMT03_invalidcredentialsLogin;
import Utility.DataDrivenTesting;

public class MMTTC_03LoginInvalidCredentials extends MMT_LaunchQuit {

	@Test
	public void Incorrectlogin() throws InterruptedException, EncryptedDocumentException, IOException {

		DataDrivenTesting D1 = new DataDrivenTesting();
		D1.DDT_02();

		MMT03_invalidcredentialsLogin L1 = new MMT03_invalidcredentialsLogin(driver);

		Thread.sleep(5000);

		L1.WEmail();

		Thread.sleep(2000);

		L1.password();

	}

}
