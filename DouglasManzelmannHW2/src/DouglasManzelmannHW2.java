/*******
 *  Program Name: DouglasManzelmannHW2
 * 	Author: Douglas Manzelmann
 * 	Date: 11/06/13
 * 	Description: This is Homework 2 in CS 141. It generates three-digit random numbers,
 * 				 prints them in a formatted table and calculates and outputs the average
 * 				 of the random numbers. 
 * 
 */

public class DouglasManzelmannHW2 {
	public static void main(String[] args) {
		
		//==========INITIALIZE VARIABLE SECTION==========
		String randomNumbers = "";
		double randomNumbersTotal = 0;
		final int MAX_RANDOM_NUMBERS = 100;
		//==========END INITIALIZATION SECTION==========
		
		//==========GENERATE MAX_RANDOM_NUMBERS SECTION==========
		for  (int i = 0; i < MAX_RANDOM_NUMBERS; i++) {
			int random = (int)(Math.random() * 1000);
			
			// Conditional setup for output formatting
			// If i is a multiple of 10, a newline will be inserted before the random number
			// Else a tab and the random number
			if (i % 10 == 0 && i != 0) 
				randomNumbers += "\n" + random;
			else if (i == 0)
				randomNumbers += random;
			else				
				randomNumbers += "\t" + random;
			
			randomNumbersTotal += random;
		}
		//==========END GENERATE RANDOM NUMBERS SECTION==========
		
		// Find the average 
		double randomNumbersAverage = randomNumbersTotal / MAX_RANDOM_NUMBERS;
		
		//==========OUTPUT SECTION==========
		System.out.println(randomNumbers);
		System.out.println("The average of the generated random numbers is: " + randomNumbersAverage);
		//==========END OUTPUT SECTION==========
	}
}
