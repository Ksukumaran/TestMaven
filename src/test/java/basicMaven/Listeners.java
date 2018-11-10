package basicMaven;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	
	public void onFinish(ITestContext arg0) {
	// write the logging code here which will be executed on test finish
	  	  
	 }

	 public void onStart(ITestContext arg0) {
	// write the logging code here which will be executed on test start
	 	  
	 }

	 public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	// write the logging code here which will be executed on test failure within success %
	    
	 }

	 public void onTestFailure(ITestResult arg0) {
	// write the logging code here which will be executed on test failure
	  	  
	 }

	 public void onTestSkipped(ITestResult arg0) {
	// write the logging code here which will be executed on test skip
	  
	 }

	 public void onTestStart(ITestResult arg0) {
	// write the logging code here which will be executed on test start
	  	  
	 }

	 public void onTestSuccess(ITestResult arg0) {
	// write the logging code here which will be executed on test success
		  System.out.println("TEST successfully EXECUTED");
	 }

}
