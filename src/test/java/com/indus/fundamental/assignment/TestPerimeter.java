package com.indus.fundamental.assignment;

import junit.framework.TestCase;

/**
 * Provides test cases for Perimeter class
 */
public class TestPerimeter extends TestCase {
	private Perimeter periObj = null;

	/**
	 * Sets up the test environment
	 */
	protected void setUp() throws Exception {
		periObj = new Perimeter();

	}

	/**
	 * Tears down the test environment
	 */
	protected void tearDown() throws Exception {
		periObj = null;

	}

	/**
	 * Test case for circlePerimeter method
	 */
	public void testCirclePerimeterScenario1() {

		// 1. Inputs
		double radius = 2.0;

		// 2. Expected Result
		double expResult = 12.5714;

		// 3. Actual Result
		double actualResult = periObj.circlePerimeter(radius);

		// 4. Assertion
		assertEquals(Math.floor(expResult), Math.floor(actualResult), 0);
	}

	/**
	 * Test case for circlePerimeter method
	 */
	public void testCirclePerimeterScenario2() {

		// 1. Inputs
		double radius = 3.0;

		// 2. Expected Result
		double expResult = 18.8571;

		// 3. Actual Result
		double actualResult = periObj.circlePerimeter(radius);

		// 4. Assertion
		assertEquals(Math.floor(expResult), Math.floor(actualResult), 0);

	}

	/**
	 * Test case for circlePerimeter method
	 */
	public void testCirclePerimeterScenario3() {

		// 1. Inputs
		double radius = 4.0;

		// 2. Expected Result
		double expResult = 25.1429;

		// 3. Actual Result
		double actualResult = periObj.circlePerimeter(radius);

		// 4. Assertion
		assertEquals(Math.floor(expResult), Math.floor(actualResult), 0);

	}

	/**
	 * Test case for circlePerimeter method
	 */
	public void testCirclePerimeterScenario4() {

		// 1. Inputs
		double radius = 5.0;

		// 2. Expected Result
		double expResult = 31.4286;

		// 3. Actual Result
		double actualResult = periObj.circlePerimeter(radius);

		// 4. Assertion
		assertEquals(Math.floor(expResult), Math.floor(actualResult), 0);

	}

	/**
	 * Test case for rectanglePerimeter method
	 */
	public void testRectanglePerimeterScenario1() {

		// 1. Inputs
		double length = 2.0;
		double breadth = 3.0;

		// 2. Expected Result
		double expResult = 10.0;

		// 3. Actual Result
		double actualResult = periObj.rectanglePerimeter(length, breadth);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);

	}

	/**
	 * Test case for rectanglePerimeter method
	 */
	public void testRectanglePerimeterScenario2() {
		// 1. Inputs
		double length = 2.0;
		double breadth = 2.0;

		// 2. Expected Result
		double expResult = 8.0;

		// 3. Actual Result
		double actualResult = periObj.rectanglePerimeter(length, breadth);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);

	}

	/**
	 * Test case for rectanglePerimeter method
	 */
	public void testRectanglePerimeterScenario3() {
		// 1. Inputs
		double length = 2.0;
		double breadth = 6.0;

		// 2. Expected Result
		double expResult = 16.0;

		// 3. Actual Result
		double actualResult = periObj.rectanglePerimeter(length, breadth);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);

	}

	/**
	 * Test case for rectanglePerimeter method
	 */
	public void testRectanglePerimeterScenario4() {

		// 1. Inputs
		double length = 1.0;
		double breadth = 5.0;

		// 2. Expected Result
		double expResult = 12.0;

		// 3. Actual Result
		double actualResult = periObj.rectanglePerimeter(length, breadth);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);

	}

	/**
	 * Test case for squarePerimeter method
	 */
	public void testSquarePerimeterScenario1() {

		// 1. Inputs
		double side = 2.0;

		// 2. Expected Result
		double expResult = 4.0;

		// 3. Actual Result
		double actualResult = periObj.squarePerimeter(side);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);

	}

	/**
	 * Test case for squarePerimeter method
	 */
	public void testSquarePerimeterScenario2() {

		// 1. Inputs
		double side = 3.0;

		// 2. Expected Result
		double expResult = 6.0;

		// 3. Actual Result
		double actualResult = periObj.squarePerimeter(side);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);

	}

	/**
	 * Test case for squarePerimeter method
	 */
	public void testSquarePerimeterScenario3() {

		// 1. Inputs
		double side = 5.0;

		// 2. Expected Result
		double expResult = 10.0;

		// 3. Actual Result
		double actualResult = periObj.squarePerimeter(side);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);

	}

	/**
	 * Test case for squarePerimeter method
	 */
	public void testSquarePerimeterScenario4() {

		// 1. Inputs
		double side = 6.0;

		// 2. Expected Result
		double expResult = 12.0;

		// 3. Actual Result
		double actualResult = periObj.squarePerimeter(side);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);

	}

}
