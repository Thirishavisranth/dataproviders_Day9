package com.dataprovider;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner4 implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test onTestStart "+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test onTestSuccess "+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test onTestFailure "+result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test onTestSkipped "+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test FailButWithinSuccessP "+result.getName());
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test FailedWithTimeOut "+result.getName());
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Test onstart");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Test onFinish ");
	}
    
}

