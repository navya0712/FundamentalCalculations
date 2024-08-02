package com.indus.fundamental.assignment;

/**
 * Description: Calculates Perimeter of Circle, Rectangle and Square
 */

public class Perimeter {

	/**
	 * Description: Computes perimeter of Circle
	 * 
	 * @param radius
	 * @return perimeter
	 */
	public double circlePerimeter(double radius) {
		double result = 0.0;
		{
			result = 2 * Math.PI * radius;
		}
		return result;
	}

	/**
	 * Description: Computes perimeter of Rectangle
	 * 
	 * @param length
	 * @param breadth
	 * @return perimeter
	 */

	public double rectanglePerimeter(double length, double breadth) {
		double result = 0.0;
		{
			result = 2 * (length + breadth);

		}
		return result;
	}

	/**
	 * Description: Computes Perimeter of Square
	 * 
	 * @param side
	 * @return perimeter
	 */
	public double squarePerimeter(double side) {
		double result = 0.0;
		{
			result = 2 * side;

		}
		return result;
	}

}
