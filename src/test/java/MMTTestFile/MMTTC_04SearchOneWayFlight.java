package MMTTestFile;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import MMTSourceFile.MMT02_LoginPage;
import MMTSourceFile.MMT04_SearchOneWayTrip;
import MMTSourceFile.MMT_ClosingTab;
import Utility.DataDrivenTesting;

@Listeners(Utility.listeners.class)
public class MMTTC_04SearchOneWayFlight extends MMT_LaunchQuit {

	@Test
	public void SearchFlight() throws InterruptedException, EncryptedDocumentException, IOException {

		DataDrivenTesting D1 = new DataDrivenTesting();
		D1.DDT_01();

		MMT02_LoginPage L1 = new MMT02_LoginPage(driver);
		Thread.sleep(5000);
		L1.WEmail();
		Thread.sleep(2000);
		L1.password();

		MMT_ClosingTab M1 = new MMT_ClosingTab(driver);
		Thread.sleep(5000);
		M1.Cbutton();

		MMT04_SearchOneWayTrip S1 = new MMT04_SearchOneWayTrip(driver);
		Thread.sleep(3000);
		S1.Oneway();
		Thread.sleep(2000);
		S1.FAddress();
		Thread.sleep(2000);
		S1.FInput("Hyderabad");
		Thread.sleep(4000);
		S1.SFlight();
		Thread.sleep(2000);
		S1.ToAddress();
		Thread.sleep(2000);
		S1.Input2("Goa");
		Thread.sleep(2000);
		S1.SFilght2();
		Thread.sleep(2000);
		S1.Depeature();
		S1.TOption();	
		Thread.sleep(2000);		
		S1.Adults();		
		Thread.sleep(2000);		
		S1.Economy();		
		Thread.sleep(2000);		
		S1.apply();
		
		Thread.sleep(2000);	 
		S1.Search();
		
		

	}

}
