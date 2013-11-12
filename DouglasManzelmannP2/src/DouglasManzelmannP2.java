/*******
 *  Program Name: DouglasManzelmannP2
 * 	Author: Douglas Manzelmann
 * 	Date: 11/12/13
 * 	Description: This is Project 2 for CS141. The program prompts the user for a series
 * 				 of floating point numbers (until 0 is entered), and uses methods for:
 * 				 calculating the sum of the numbers, their average and displaying the results.
 * 
 */
import javax.swing.JOptionPane;

/**
 * This is a class for Project 2.
 * This is Project 2 for CS141. The program prompts the user for a series
 * of floating point numbers (until 0 is entered), and uses methods for:
 * calculating the sum of the numbers, their average and displaying the results.
 * 
 * @author dmanzelmann
 *
 */
public class DouglasManzelmannP2 {
	public static void main(String[] args) {
		double userInput = 0;
		double sum = 0;
		double average = 0;
		int i = 0;
		boolean isSumGreaterThan100 = false;

		// Prompts for a floating point number,
		// adds that number to the sum,
		// and loops until '0' is entered 
		do {
			userInput = getUserNumber();
			sum = calculateSum(userInput, sum);
			
			if (sum > 100 && !(isSumGreaterThan100)) {
				printSumWarning();
				isSumGreaterThan100 = true;
			}				
			
			if (userInput != 0)
				i++;
		
		} while (userInput != 0);
		
		//Calculate average
		//And output number of floating point numbers, their sum and average
		average = calculateAverage(i, sum); 	
		showProjectOutput(i, sum, average); 	
	}
	

	/**
	 * getUserNumber() prompts the user for a floating point number.
	 * @return floatingPointNumber
	 */
	public static double getUserNumber() {
		double floatingPointNumber; 
		
		String strInput = JOptionPane.showInputDialog("Enter a floating point number (type 0 to exit): ");
		floatingPointNumber = Double.parseDouble(strInput);
		
		return floatingPointNumber;
	}
	
	/**
	 * Adds two numbers together and returns their sum.
	 * @param number1
	 * @param number2
	 * @return (number1 + number2)
	 */
	public static double calculateSum(double number1, double number2) {
		return (number1 + number2);
	}
	
	/**
	 * Given a number of elements and sum, returns the sum
	 * @param numberOfElements
	 * @param sum
	 * @return (sum / numberOfElements)
	 */
	public static double calculateAverage(int numberOfElements, double sum) {
		return ((double) (sum / numberOfElements));
	}
	
	/**
	 * Uses showMessageDialog to output the number of inputs, their sum, and average
	 * @param numberOfElements
	 * @param sum
	 * @param average
	 */
	public static void showProjectOutput(int numberOfElements, double sum, double average) {
		JOptionPane.showMessageDialog(null, "Number of floating point numbers entered: " + numberOfElements);
		JOptionPane.showMessageDialog(null, "The sum of all the floating point numbers entered: " + sum);
		JOptionPane.showMessageDialog(null, "The average of all the floating point numbers entered: " + average);
	}
	
	/**
	 * If the sum of the inputs entered is greater than 100, this message is diaplayed.
	 */
	public static void printSumWarning() {
		JOptionPane.showMessageDialog(null, "The sum is greater than 100");
	}
		
}
