package MMTTestFile;

import org.testng.annotations.Test;

import MMTSourceFile.MMT_ClosingTab;

public class MMTTC_ClosingTab extends MMT_LaunchQuit {

	@Test
	public void SearchFunctinality() throws InterruptedException {

		MMT_ClosingTab M1 = new MMT_ClosingTab(driver);

		Thread.sleep(3000);

		M1.Cbutton();
	}

}
