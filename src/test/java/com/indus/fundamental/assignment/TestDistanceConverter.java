package com.indus.fundamental.assignment;

import junit.framework.TestCase;

/**
 * Provides test cases for DistanceConverter
 */
public class TestDistanceConverter extends TestCase {

	private DistanceConveter distCalObj = null;

	/**
	 * Sets up the Test environment
	 */
	protected void setUp() throws Exception {
		distCalObj = new DistanceConveter();
	}

	/**
	 * Tears down the test environment
	 */
	protected void tearDown() throws Exception {
		distCalObj = null;
	}

	/**
	 * Provides test case for KmToMeterConverter
	 */
	public void testKmToMeterConverterScenario1() {
		// 1. Inputs
		double km = 2.0;

		// 2. Expected Result
		double expResult = 2000.0;

		// 3. Actual Result
		double actualResult = distCalObj.kmToMeterConverter(km);

		// 4. Assertions
		assertEquals(expResult, actualResult, 0);
	}

	/**
	 * Provides test case for KmToMeterConverter
	 */
	public void testKmToMeterConverterScenario2() {
		// 1. Inputs
		double km = 3.0;

		// 2. Expected Result
		double expResult = 3000.0;

		// 3. Actual Result
		double actualResult = distCalObj.kmToMeterConverter(km);

		// 4. Assertions
		assertEquals(expResult, actualResult, 0);
	}

	/**
	 * Provides test case for KmToMeterConverter
	 */
	public void testKmToMeterConverterScenario3() {
		// 1. Inputs
		double km = 4.0;

		// 2. Expected Result
		double expResult = 4000.0;

		// 3. Actual Result
		double actualResult = distCalObj.kmToMeterConverter(km);

		// 4. Assertions
		assertEquals(expResult, actualResult, 0);
	}

	/**
	 * Provides test case for KmToMeterConverter
	 */
	public void testKmToMeterConverterScenario4() {
		// 1. Inputs
		double km = 5.0;

		// 2. Expected Result
		double expResult = 5000.0;

		// 3. Actual Result
		double actualResult = distCalObj.kmToMeterConverter(km);

		// 4. Assertions
		assertEquals(expResult, actualResult, 0);
	}

	/**
	 * Provides test case for MetertoKmConverter
	 */
	public void testMetertoKmConverterScenario1() {
		// 1. Inputs
		double m = 5000.0;

		// 2. Expected Result
		double expResult = 5.0;

		// 3. Actual Result
		double actualResult = distCalObj.metertoKmConverter(m);

		// 4. Assertions
		assertEquals(expResult, actualResult, 0);
	}

	/**
	 * Provides test case for MetertoKmConverter
	 */
	public void testMetertoKmConverterScenario2() {
		// 1. Inputs
		double m = 4000.0;

		// 2. Expected Result
		double expResult = 4.0;

		// 3. Actual Result
		double actualResult = distCalObj.metertoKmConverter(m);

		// 4. Assertions
		assertEquals(expResult, actualResult, 0);
	}

	/**
	 * Provides test case for MetertoKmConverter
	 */
	public void testMetertoKmConverterScenario3() {
		// 1. Inputs
		double m = 6000.0;

		// 2. Expected Result
		double expResult = 6.0;

		// 3. Actual Result
		double actualResult = distCalObj.metertoKmConverter(m);

		// 4. Assertions
		assertEquals(expResult, actualResult, 0);
	}

	/**
	 * Provides test case for MetertoKmConverter
	 */
	public void testMetertoKmConverterScenario4() {
		// 1. Inputs
		double m = 7000.0;

		// 2. Expected Result
		double expResult = 7.0;

		// 3. Actual Result
		double actualResult = distCalObj.metertoKmConverter(m);

		// 4. Assertions
		assertEquals(expResult, actualResult, 0);
	}

}
