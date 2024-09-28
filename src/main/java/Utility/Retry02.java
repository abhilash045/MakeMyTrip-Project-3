package Utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry02 implements IRetryAnalyzer {

	@Override
	public boolean retry(ITestResult result) {

		int current_count = 0;
		int retry_count = 1;

		if (current_count < retry_count) {
			current_count++;
			return true;
		}

		return false;
	}

}
