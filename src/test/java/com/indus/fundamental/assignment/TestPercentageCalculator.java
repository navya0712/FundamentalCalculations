package com.indus.fundamental.assignment;

import junit.framework.TestCase;

/**
 * Provides test cases for PercentageCalculator class
 */
public class TestPercentageCalculator extends TestCase {

	private PercentageCalculator perCalObj = null;

	/**
	 * Sets up the Test environment
	 */
	protected void setUp() throws Exception {
		perCalObj = new PercentageCalculator();

	}

	/**
	 * Tears down the test environment
	 */
	protected void tearDown() throws Exception {
		perCalObj = null;

	}

	/**
	 * Test case for CalculatePercentage method
	 */
	public void testCalculatePercentageScenario1() {

		// 1. Inputs
		double param1 = 20.0;
		double param2 = 100.0;

		// 2. Expected Result
		double expResult = 20.0;

		// 3. Actual Result
		double actualResult = perCalObj.calculatePercentage(param1, param2);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);

	}

	/**
	 * Test case for CalculatePercentage method
	 */
	public void testCalculatePercentageScenario2() {

		// 1. Inputs
		double param1 = 20.0;
		double param2 = 200.0;

		// 2. Expected Result
		double expResult = 40.0;

		// 3. Actual Result
		double actualResult = perCalObj.calculatePercentage(param1, param2);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);

	}

	/**
	 * Test case for CalculatePercentage method
	 */
	public void testCalculatePercentageScenario3() {

		// 1. Inputs
		double param1 = 30.0;
		double param2 = 200.0;

		// 2. Expected Result
		double expResult = 60.0;

		// 3. Actual Result
		double actualResult = perCalObj.calculatePercentage(param1, param2);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);

	}

	/**
	 * Test case for CalculatePercentage method
	 */
	public void testCalculatePercentageScenario4() {

		// 1. Inputs
		double param1 = 10.0;
		double param2 = 200.0;

		// 2. Expected Result
		double expResult = 20.0;

		// 3. Actual Result
		double actualResult = perCalObj.calculatePercentage(param1, param2);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);

	}

}
