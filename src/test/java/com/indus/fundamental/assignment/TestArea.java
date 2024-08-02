package com.indus.fundamental.assignment;

import junit.framework.TestCase;

/**
 * Provides test cases for Area Class
 */
public class TestArea extends TestCase {

	private Area areaObj = null;

	/**
	 * Sets up the test environment
	 */
	protected void setUp() throws Exception {
		areaObj = new Area();
		System.out.println("TestArea:setUp");
	}

	/**
	 * tears down the test environment
	 */
	protected void tearDown() throws Exception {
		areaObj = null;
		System.out.println("TestArea:tearDown");
	}

	/**
	 * test case for circlearea method
	 */
	public void testCircleAreaScenario1() {
		System.out.println("TestArea:testCircleAreaScenario1");
		// 1. Inputs
		double radius = 1.0;

		// 2. Expected Result
		double expResult = 3.1429;

		// 3. Actual Result
		double actualResult = areaObj.circleArea(radius);

		// 4. Assertion
		assertEquals(Math.floor(expResult), Math.floor(actualResult), 0);
	}

	/**
	 * test case for circlearea method
	 */
	public void testCircleAreaScenario2() {
		System.out.println("TestArea:testCircleAreaScenario2");
		// 1. Inputs
		double radius = 2.0;

		// 2. Expected Result
		double expResult = 12.5714;

		// 3. Actual Result
		double actualResult = areaObj.circleArea(radius);

		// 4. Assertion
		assertEquals(Math.floor(expResult), Math.floor(actualResult), 0);
	}

	/**
	 * test case for circlearea method
	 */
	public void testCircleAreaScenario3() {
		System.out.println("TestArea:testCircleAreaScenario3");
		// 1. Inputs
		double radius = 3.0;

		// 2. Expected Result
		double expResult = 28.2857;

		// 3. Actual Result
		double actualResult = areaObj.circleArea(radius);

		// 4. Assertion
		assertEquals(Math.floor(expResult), Math.floor(actualResult), 0);
	}

	/**
	 * test case for circlearea method
	 */
	public void testCircleAreaScenario4() {
		System.out.println("TestArea:testCircleAreaScenario4");
		// 1. Inputs
		double radius = 4.0;

		// 2. Expected Result
		double expResult = 50.2857;

		// 3. Actual Result
		double actualResult = areaObj.circleArea(radius);

		// 4. Assertion
		assertEquals(Math.floor(expResult), Math.floor(actualResult), 0);
	}

	/**
	 * test case for rectanglearea method
	 */
	public void testRectangleAreaScenario1() {
		System.out.println("TestArea:testRectangleAreaScenario1");
		// 1. Inputs
		double length = 1.0;
		double breadth = 1.0;

		// 2. Expected Result
		double expResult = 1.0;

		// 3. Actual Result
		double actualResult = areaObj.rectangleArea(length, breadth);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);

	}

	/**
	 * test case for rectanglearea method
	 */
	public void testRectangleAreaScenario2() {
		System.out.println("TestArea:testRectangleAreaScenario2");
		// 1. Inputs
		double length = 1.0;
		double breadth = 2.0;

		// 2. Expected Result
		double expResult = 2.0;

		// 3. Actual Result
		double actualResult = areaObj.rectangleArea(length, breadth);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);
	}

	/**
	 * test case for rectanglearea method
	 */
	public void testRectangleAreaScenario3() {
		System.out.println("TestArea:testRectangleAreaScenario3");
		// 1. Inputs
		double length = 1.0;
		double breadth = 3.0;

		// 2. Expected Result
		double expResult = 3.0;

		// 3. Actual Result
		double actualResult = areaObj.rectangleArea(length, breadth);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);
	}

	/**
	 * test case for rectanglearea method
	 */
	public void testRectangleAreaScenario4() {
		System.out.println("TestArea:testRectangleAreaScenario4");
		// 1. Inputs
		double length = 2.0;
		double breadth = 4.0;

		// 2. Expected Result
		double expResult = 8.0;

		// 3. Actual Result
		double actualResult = areaObj.rectangleArea(length, breadth);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);
	}

	/**
	 * test case for squarearea method
	 */
	public void testSquareAreaScenario1() {
		System.out.println("TestArea:testRectangleAreaScenario1");
		// 1. Inputs
		double side = 1.0;

		// 2. Expected Result
		double expResult = 1.0;

		// 3. Actual Result
		double actualResult = areaObj.squareArea(side);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);

	}

	/**
	 * test case for squarearea method
	 */
	public void testSquareAreaScenario2() {
		System.out.println("TestArea:testRectangleAreaScenario2");
		// 1. Inputs
		double side = 2.0;

		// 2. Expected Result
		double expResult = 4.0;

		// 3. Actual Result
		double actualResult = areaObj.squareArea(side);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);

	}

	/**
	 * test case for squarearea method
	 */
	public void testSquareAreaScenario3() {
		System.out.println("TestArea:testRectangleAreaScenario3");
		// 1. Inputs
		double side = 3.0;

		// 2. Expected Result
		double expResult = 9.0;

		// 3. Actual Result
		double actualResult = areaObj.squareArea(side);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);

	}

	/**
	 * test case for squarearea method
	 */
	public void testSquareAreaScenario4() {
		System.out.println("TestArea:testRectangleAreaScenario4");
		// 1. Inputs
		double side = 4.0;

		// 2. Expected Result
		double expResult = 16.0;

		// 3. Actual Result
		double actualResult = areaObj.squareArea(side);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);

	}

}
