package com.indus.fundamental.assignment;

import junit.framework.TestCase;

/**
 * Provides test cases for CelsiusFahrenheitConverter
 */
public class TestCelsiusFahrenheitConverter extends TestCase {

	private CelsiusFahrenheitConverter celsiusFahrenheitConverterObj = null;

	/**
	 * Sets up the test environment
	 */
	protected void setUp() throws Exception {
		celsiusFahrenheitConverterObj = new CelsiusFahrenheitConverter();
		System.out.println("TestCelsiusFahrenheitConverter:setUp");
	}

	/**
	 * Tears down the test environment
	 */
	protected void tearDown() throws Exception {
		celsiusFahrenheitConverterObj = null;
		System.out.println("TestCelsiusFahrenheitConverter:tearDown");
	}

	/**
	 * Test case for CelsiusFahrenheitConverter method
	 */
	public void testCelciusToFahrenheitScenario1() {
		System.out.println("TestCelsiusFahrenheitConverter:testCelciusToFahrenheitScenario1");
		// 1. Input
		double celsius = 25.0;

		// 2. Expected Result
		double expResult = 77.0;

		// 3. Actual Result
		double actualResult = celsiusFahrenheitConverterObj.celciusToFahrenheit(celsius);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);

	}

	/**
	 * Test case for CelsiusFahrenheitConverter method
	 */
	public void testCelciusToFahrenheitScenario2() {
		System.out.println("TestCelsiusFahrenheitConverter:testCelciusToFahrenheitScenario2");
		// 1. Input
		double celsius = 35.0;

		// 2. Expected Result
		double expResult = 95.0;

		// 3. Actual Result
		double actualResult = celsiusFahrenheitConverterObj.celciusToFahrenheit(celsius);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);
	}

	/**
	 * Test case for CelsiusFahrenheitConverter method
	 */
	public void testCelciusToFahrenheitScenario3() {
		System.out.println("TestCelsiusFahrenheitConverter:testCelciusToFahrenheitScenario3");
		// 1. Input
		double celsius = 40.0;

		// 2. Expected Result
		double expResult = 104.0;

		// 3. Actual Result
		double actualResult = celsiusFahrenheitConverterObj.celciusToFahrenheit(celsius);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);
	}

	/**
	 * Test case for CelsiusFahrenheitConverter method
	 */
	public void testCelciusToFahrenheitScenario4() {
		System.out.println("TestCelsiusFahrenheitConverter:testCelciusToFahrenheitScenario4");
		// 1. Input
		double celsius = 45.0;

		// 2. Expected Result
		double expResult = 113.0;

		// 3. Actual Result
		double actualResult = celsiusFahrenheitConverterObj.celciusToFahrenheit(celsius);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);
	}

	/**
	 * Test case for FahrenheitToCelciusConverter method
	 */
	public void testFahrenheitToCelciusScenario1() {
		System.out.println("TestCelsiusFahrenheitConverter:testFahrenheitToCelciusScenario1");
		// 1. Input
		double fahrenheit = 77.0;

		// 2. ExpectedResult
		double expResult = 25.0;

		// 3. ActualResult
		double actualResult = celsiusFahrenheitConverterObj.fahrenheitToCelcius(fahrenheit);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);

	}

	/**
	 * Test case for FahrenheitToCelciusConverter method
	 */
	public void testFahrenheitToCelciusScenario2() {
		System.out.println("TestCelsiusFahrenheitConverter:testFahrenheitToCelciusScenario2");
		// 1. Input
		double fahrenheit = 113.0;

		// 2. ExpectedResult
		double expResult = 45.0;

		// 3. ActualResult
		double actualResult = celsiusFahrenheitConverterObj.fahrenheitToCelcius(fahrenheit);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);
	}

	/**
	 * Test case for FahrenheitToCelciusConverter method
	 */
	public void testFahrenheitToCelciusScenario3() {
		System.out.println("TestCelsiusFahrenheitConverter:testFahrenheitToCelciusScenario3");
		// 1. Input
		double fahrenheit = 95.0;

		// 2. ExpectedResult
		double expResult = 35.0;

		// 3. ActualResult
		double actualResult = celsiusFahrenheitConverterObj.fahrenheitToCelcius(fahrenheit);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);
	}

	/**
	 * Test case for FahrenheitToCelciusConverter method
	 */
	public void testFahrenheitToCelciusScenario4() {
		System.out.println("TestCelsiusFahrenheitConverter:testFahrenheitToCelciusScenario4");
		// 1. Input
		double fahrenheit = 104.0;

		// 2. ExpectedResult
		double expResult = 40.0;

		// 3. ActualResult
		double actualResult = celsiusFahrenheitConverterObj.fahrenheitToCelcius(fahrenheit);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);
	}

}
