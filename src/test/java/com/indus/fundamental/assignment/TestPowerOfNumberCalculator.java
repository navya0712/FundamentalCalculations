package com.indus.fundamental.assignment;

import junit.framework.TestCase;

/**
 * Description: Provides test cases for PowerOfNumberCalculator
 */
public class TestPowerOfNumberCalculator extends TestCase {

	/**
	 * Sets up the Test environment
	 */
	private PowerOfNumberCalculator powCalObj = null;

	protected void setUp() throws Exception {
		powCalObj = new PowerOfNumberCalculator();

	}

	/**
	 * Tears down the test environment
	 */
	protected void tearDown() throws Exception {
		powCalObj = null;

	}

	/**
	 * Test case for computePower method
	 */
	public void testComputePowerScenario1() {
		// 1. Inputs
		double base = 2.0;
		double exponent = 2.0;

		// 2. Expected Result
		double expResult = 4.0;

		// 3. Actual Result
		double actualResult = powCalObj.computePower(base, exponent);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);

	}

	/**
	 * Test case for computePower method
	 */
	public void testComputePowerScenario2() {

		// 1. Inputs
		double base = 2.0;
		double exponent = 3.0;

		// 2. Expected Result
		double expResult = 8.0;

		// 3. Actual Result
		double actualResult = powCalObj.computePower(base, exponent);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);

	}

	/**
	 * Test case for computePower method
	 */
	public void testComputePowerScenario3() {

		// 1. Inputs
		double base = 3.0;
		double exponent = 2.0;

		// 2. Expected Result
		double expResult = 9.0;

		// 3. Actual Result
		double actualResult = powCalObj.computePower(base, exponent);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);

	}

	/**
	 * Test case for computePower method
	 */
	public void testComputePowerScenario4() {

		// 1. Inputs
		double base = 6.0;
		double exponent = 2.0;

		// 2. Expected Result
		double expResult = 36.0;

		// 3. Actual Result
		double actualResult = powCalObj.computePower(base, exponent);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);

	}

}
