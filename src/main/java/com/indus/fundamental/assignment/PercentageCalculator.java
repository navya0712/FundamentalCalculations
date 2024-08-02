package com.indus.fundamental.assignment;

/**
 * Description: Calculates percentage of a number
 */
public class PercentageCalculator {

	/**
	 * Description: Calculates Percentage of a number
	 * 
	 * @param param1
	 * @param param2
	 * @return percentage
	 */
	public double calculatePercentage(double param1, double param2) {
		double result = 0.0;
		{
			result = (param1 * param2) / 100.0;
		}
		return result;

	}

}
