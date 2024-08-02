package com.indus.fundamental.assignment;

/**
 * Description: Converts distance from Kms to Mts and Mts to Kms
 */
public class DistanceConveter {

	/**
	 * Description: Converts distance from Kms to Mts
	 * 
	 * @param km
	 * @return meter
	 */
	public double kmToMeterConverter(double km) {
		double result = 0.0;
		{
			result = km * 1000;
		}
		return result;

	}

	/**
	 * Description:Description: Coverts distance from Mts to Kms
	 * 
	 * @param m
	 * @return Km
	 */

	public double metertoKmConverter(double m) {
		double result = 0.0;
		{
			result = m / 1000;
		}
		return result;

	}

}
