package com.indus.fundamental.assignment;

import junit.framework.TestCase;

/**
 * Provides test cases for AgeCalculator class
 */
public class TestAgeCalculator extends TestCase {
	private AgeCalculator ageCalObj = null;

	/**
	 * sets up the test environment
	 */
	protected void setUp() throws Exception {
		ageCalObj = new AgeCalculator();

	}

	/**
	 * tear down the test environment
	 */
	protected void tearDown() throws Exception {
		ageCalObj = null;
	}

	/**
	 * tests the age method
	 */
	public void testCalculateAgeScenario1() {
		// 1. Inputs
		int birthYear = 2000;
		int currentYear = 2024;

		// 2. Expected Result
		int expResult = 24;

		// 3. Actual Result
		int actualResult = ageCalObj.calculateAge(birthYear, currentYear);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);
	}

	/**
	 * tests the age method
	 */
	public void testCalculateAgeScenario2() {

		// 1. Inputs
		int birthYear = 2000;
		int currentYear = 2025;

		// 2. Expected Result
		int expResult = 25;

		// 3. Actual Result
		int actualResult = ageCalObj.calculateAge(birthYear, currentYear);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);

	}

	/**
	 * tests the age method
	 */
	public void testCalculateAgeScenario3() {

		// 1. Inputs
		int birthYear = 2000;
		int currentYear = 2026;

		// 2. Expected Result
		int expResult = 26;

		// 3. Actual Result
		int actualResult = ageCalObj.calculateAge(birthYear, currentYear);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);

	}

	/**
	 * tests the age method
	 */
	public void testCalculateAgeScenario4() {
		// 1. Inputs
		int birthYear = 2000;
		int currentYear = 2029;

		// 2. Expected Result
		int expResult = 29;

		// 3. Actual Result
		int actualResult = ageCalObj.calculateAge(birthYear, currentYear);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);

	}

}
