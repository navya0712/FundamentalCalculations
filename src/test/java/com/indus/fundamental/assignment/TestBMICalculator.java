package com.indus.fundamental.assignment;

import junit.framework.TestCase;

/**
 * Provides test cases for BMICalculator
 */
public class TestBMICalculator extends TestCase {
	private BMICalculator bMIObj = null;

	/**
	 * sets up the test environment
	 */
	protected void setUp() throws Exception {
		bMIObj = new BMICalculator();

	}

	/**
	 * tear down the test environment
	 */
	protected void tearDown() throws Exception {
		bMIObj = null;

	}

	/**
	 * test case for calculateBMI method
	 */
	public void testCalculateBMIScenario1() {
		// 1. Inputs
		double height = 2.0;
		double weight = 100.0;

		// 2. Expected Result
		double expResult = 25.0;

		// 3. Actual Result
		double actualResult = bMIObj.calculateBMI(height, weight);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);

	}

	/**
	 * test case for calculateBMI method
	 */
	public void testCalculateBMIScenario2() {
		// 1. Inputs
		double height = 1.0;
		double weight = 100.0;

		// 2. Expected Result
		double expResult = 100.0;

		// 3. Actual Result
		double actualResult = bMIObj.calculateBMI(height, weight);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);

	}

	/**
	 * test case for calculateBMI method
	 */
	public void testCalculateBMIScenario3() {
		// 1. Inputs
		double height = 2.0;
		double weight = 200.0;

		// 2. Expected Result
		double expResult = 50.0;

		// 3. Actual Result
		double actualResult = bMIObj.calculateBMI(height, weight);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);

	}

	/**
	 * test case for calculateBMI method
	 */
	public void testCalculateBMIScenario4() {
		// 1. Inputs
		double height = 1.0;
		double weight = 50.0;

		// 2. Expected Result
		double expResult = 50.0;

		// 3. Actual Result
		double actualResult = bMIObj.calculateBMI(height, weight);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);

	}

}
