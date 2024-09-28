package MMTTestFile;

import org.testng.annotations.Test;

import MMTSourceFile.MMT08_SeatSelectionProcess;

public class MMTTC_08SeatSelectionProcess extends MMTTC_08TestCase {

	@Test
	public void SeatSelection() throws InterruptedException {
		
		MMT08_SeatSelectionProcess m1 = new MMT08_SeatSelectionProcess(driver);
		
		Thread.sleep(3000);
		
		m1.close();

	}

}
