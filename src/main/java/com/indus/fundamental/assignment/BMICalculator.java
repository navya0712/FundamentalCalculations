package com.indus.fundamental.assignment;

/**
 * Description: Calculates the BMI based on given height and weight
 */
public class BMICalculator {
	/**
	 * Description: Calculates the BMI based on given height and weight
	 * 
	 * @param height
	 * @param weight
	 * @return BMI
	 */
	public double calculateBMI(double height, double weight) {
		double result = 0.0;
		{
			result = weight / Math.pow(height, 2);
		}
		return result;

	}
}
