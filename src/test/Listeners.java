package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListeners interface whihc implements testing Listeners
public class Listeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
	    
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		//System.out.println("I Successfully executeed the listners code on sucess");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("I Successfully executed the listners code on test case failure" +result.getName()); 
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	    
	}

	@Override
	public void onStart(ITestContext context) {
	    
	}

	@Override
	public void onFinish(ITestContext context) {
	    
	}	
	
	
}
