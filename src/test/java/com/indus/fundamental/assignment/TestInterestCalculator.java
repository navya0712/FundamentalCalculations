package com.indus.fundamental.assignment;

import junit.framework.TestCase;

/**
 * Provides test cases fo rInterestCalculator Class
 */
public class TestInterestCalculator extends TestCase {
	private InterestCalculator intCalobj = null;

	/**
	 * Sets up the Test environment
	 */
	protected void setUp() throws Exception {
		intCalobj = new InterestCalculator();
		System.out.println("TestInterestCalculator:setUp");
	}

	/**
	 * Tear down the test environment
	 */
	protected void tearDown() throws Exception {
		intCalobj = null;
		System.out.println("TestInterestCalculator:tearDown");
	}

	/**
	 * Provides test case for computeSimpleInterest method
	 */
	public void testComputeSimpleInterestScenario1() {
		System.out.println("TestInterestCalculator:testComputeSimpleInterestScenario1");

		// 1. Inputs
		double principal = 1000.0;
		double rate = 10.0;
		double time = 2.0;

		// 2. Expected Result
		double expResult = 200.0;

		// 3. Actual Result
		double actualResult = intCalobj.computeSimpleInterest(principal, rate, time);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);

	}

	/**
	 * Provides test case for computeSimpleInterest method
	 */
	public void testComputeSimpleInterestScenario2() {
		System.out.println("TestInterestCalculator:testComputeSimpleInterestScenario2");

		// 1. Inputs
		double principal = 2000.0;
		double rate = 10.0;
		double time = 2.0;

		// 2. Expected Result
		double expResult = 400.0;

		// 3. Actual Result
		double actualResult = intCalobj.computeSimpleInterest(principal, rate, time);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);

	}

	/**
	 * Provides test case for computeSimpleInterest method
	 */
	public void testComputeSimpleInterestScenario3() {
		System.out.println("TestInterestCalculator:testComputeSimpleInterestScenario3");

		// 1. Inputs
		double principal = 3000.0;
		double rate = 10.0;
		double time = 2.0;

		// 2. Expected Result
		double expResult = 600.0;

		// 3. Actual Result
		double actualResult = intCalobj.computeSimpleInterest(principal, rate, time);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);

	}

	/**
	 * Provides test case for computeSimpleInterest method
	 */
	public void testComputeSimpleInterestScenario4() {
		System.out.println("TestInterestCalculator:testComputeSimpleInterestScenario3");

		// 1. Inputs
		double principal = 4000.0;
		double rate = 10.0;
		double time = 2.0;

		// 2. Expected Result
		double expResult = 800.0;

		// 3. Actual Result
		double actualResult = intCalobj.computeSimpleInterest(principal, rate, time);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);

	}

}
