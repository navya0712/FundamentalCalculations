package com.indus.fundamental.assignment;

import junit.framework.TestCase;

/**
 * Provides test cases for Average class
 */
public class TestAverage extends TestCase {
	private Average avgObj = null;

	/**
	 * Sets up the test environment
	 */
	protected void setUp() throws Exception {
		avgObj = new Average();

	}

	/**
	 * tears down the test environment
	 */
	protected void tearDown() throws Exception {
		avgObj = null;

	}

	/**
	 * test case for average method with two parameters
	 */

	public void testAverageDoubleDoubleScenario1() {

		// 1. Inputs
		double param1 = 2.0;
		double param2 = 2.0;

		// 2. Expected Result
		double expResult = 2.0;

		// 3. Actual Result
		double actualResult = avgObj.average(param1, param2);

		// 4. Assertions
		assertEquals(expResult, actualResult, 0);

	}

	/**
	 * test case for average method with two parameters
	 */

	public void testAverageDoubleDoubleScenario2() {

		// 1. Inputs
		double param1 = 3.0;
		double param2 = 3.0;

		// 2. Expected Result
		double expResult = 3.0;

		// 3. Actual Result
		double actualResult = avgObj.average(param1, param2);

		// 4. Assertions
		assertEquals(expResult, actualResult, 0);

	}

	/**
	 * test case for average method with two parameters
	 */

	public void testAverageDoubleDoubleScenario3() {

		// 1. Inputs
		double param1 = 5.0;
		double param2 = 3.0;

		// 2. Expected Result
		double expResult = 4.0;

		// 3. Actual Result
		double actualResult = avgObj.average(param1, param2);

		// 4. Assertions
		assertEquals(expResult, actualResult, 0);

	}

	/**
	 * test case for average method with two parameters
	 */
	public void testAverageDoubleDoubleScenario4() {

		// 1. Inputs
		double param1 = 9.0;
		double param2 = 3.0;

		// 2. Expected Result
		double expResult = 6.0;

		// 3. Actual Result
		double actualResult = avgObj.average(param1, param2);

		// 4. Assertions
		assertEquals(expResult, actualResult, 0);

	}

	/**
	 * test case for average method with three parameters
	 */
	public void testAverageDoubleDoubleDoubleScenario1() {

		// 1. Inputs
		double param1 = 9.0;
		double param2 = 3.0;
		double param3 = 3.0;

		// 2. Expected Result
		double expResult = 5.0;

		// 3. Actual Result
		double actualResult = avgObj.average(param1, param2, param3);

		// 4. Assertions
		assertEquals(expResult, actualResult, 0);

	}

	/**
	 * test case for average method with three parameters
	 */
	public void testAverageDoubleDoubleDoubleScenario2() {

		// 1. Inputs
		double param1 = 9.0;
		double param2 = 3.0;
		double param3 = 6.0;

		// 2. Expected Result
		double expResult = 6.0;

		// 3. Actual Result
		double actualResult = avgObj.average(param1, param2, param3);

		// 4. Assertions
		assertEquals(expResult, actualResult, 0);

	}

	/**
	 * test case for average method with three parameters
	 */
	public void testAverageDoubleDoubleDoubleScenario3() {

		// 1. Inputs
		double param1 = 3.0;
		double param2 = 3.0;
		double param3 = 3.0;

		// 2. Expected Result
		double expResult = 3.0;

		// 3. Actual Result
		double actualResult = avgObj.average(param1, param2, param3);

		// 4. Assertions
		assertEquals(expResult, actualResult, 0);

	}

	/**
	 * test case for average method with three parameters
	 */
	public void testAverageDoubleDoubleDoubleScenario4() {

		// 1. Inputs
		double param1 = 6.0;
		double param2 = 3.0;
		double param3 = 3.0;

		// 2. Expected Result
		double expResult = 4.0;

		// 3. Actual Result
		double actualResult = avgObj.average(param1, param2, param3);

		// 4. Assertions
		assertEquals(expResult, actualResult, 0);

	}

}
