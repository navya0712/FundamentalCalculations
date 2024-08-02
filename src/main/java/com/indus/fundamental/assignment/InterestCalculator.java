package com.indus.fundamental.assignment;

/**
 * Description: Calculates the Simple Interest
 */
public class InterestCalculator {

	/**
	 * Description: Calculates Simple Interest for give Principal, Rate of Interest
	 * and Time
	 * 
	 * @param principal
	 * @param rate
	 * @param time
	 * @return interest
	 */
	public double computeSimpleInterest(double principal, double rate, double time) {
		double interest = 0.0;
		{
			interest = (principal * rate * time) / 100;

		}
		return interest;

	}
}
