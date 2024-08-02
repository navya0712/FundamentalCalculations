package com.indus.fundamental.assignment;

/**
 * Description: Calculates area of Circle, Rectangle and Square
 */

public class Area {

	/**
	 * Description: Computes area of Circle
	 * 
	 * @param radius
	 * @return area
	 */
	public double circleArea(double radius) {
		double result = 0.0;
		{
			result = Math.PI * radius * radius;
		}
		return result;
	}

	/**
	 * Description: Computes area of Rectangle
	 * 
	 * @param length
	 * @param breadth
	 * @return area
	 */

	public double rectangleArea(double length, double breadth) {
		double result = 0.0;
		{
			result = length * breadth;

		}
		return result;
	}

	/**
	 * Description: Computes area of Square
	 * 
	 * @param side
	 * @return area
	 */
	public double squareArea(double side) {
		double result = 0.0;
		{
			result = side * side;

		}
		return result;
	}

}
