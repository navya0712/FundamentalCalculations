package com.indus.fundamental.assignment;

/**
 * Description: Calculates the age based on current year and birth year
 */
public class AgeCalculator {

	/**
	 * Description: Calculates the age based on current year and birth year
	 * 
	 * @param birthYear
	 * @param currentYear
	 * @return age
	 */
	public int calculateAge(int birthYear, int currentYear) {
		int result = 0;
		{
			result = currentYear - birthYear;
		}
		return result;

	}
}
