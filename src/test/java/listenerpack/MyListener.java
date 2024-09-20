package listenerpack;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {
	public void OnStart(ITestContext context) {
		System.out.println("Execution started");
	}

	public void OnTestStart(ITestResult result) {
		System.out.println(" test started");
	}

	public void OnTestSuccess(ITestResult result) {
		System.out.println("test passed");
	}

	public void OnTestFailure(ITestResult Result) {
		System.out.println("test failed");
	}

	public void OnTestSkipped(ITestResult result) {
		System.out.println("Test Skipped");
	}

	void OnFinish(ITestContext context) {
		System.out.println("test completed");
	}

}
