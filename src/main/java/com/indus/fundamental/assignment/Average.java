package com.indus.fundamental.assignment;

/**
 * Description: Calculates Average of two or three numbers
 */
public class Average {
	/**
	 * Description: Calculates average of two numbers
	 * 
	 * @param param1
	 * @param param2
	 * @return average
	 */
	public double average(double param1, double param2) {
		double result = 0.0;
		{
			result = (param1 + param2) / 2;

		}
		return result;

	}

	/**
	 * Description: Calculates average of three numbers
	 * 
	 * @param param1
	 * @param param2
	 * @param param3
	 * @return average
	 */

	public double average(double param1, double param2, double param3) {
		double result = 0.0;
		{
			result = (param1 + param2 + param3) / 3;

		}
		return result;

	}

}
