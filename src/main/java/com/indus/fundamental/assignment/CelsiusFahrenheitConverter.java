package com.indus.fundamental.assignment;

/**
 * Description: Converts temperature from celsius to fahrenheit and vice versa
 */
public class CelsiusFahrenheitConverter {
	/**
	 * Description: Converts temperature from celsius to fahrenheit
	 * 
	 * @param celsius
	 * @return fahrenheit
	 */
	public double celciusToFahrenheit(double celsius) {
		double result = 0.0;
		{
			result = (9.0 / 5.0) * celsius + 32;
		}
		return result;

	}

	/**
	 * Description: Converts temperature from fahrenheit to celsius
	 * 
	 * @param fahrenheit
	 * @return celsius
	 */

	public double fahrenheitToCelcius(double fahrenheit) {
		double result = 0.0;
		{
			result = (fahrenheit - 32) * (5.0 / 9.0);
		}
		return result;

	}

}
