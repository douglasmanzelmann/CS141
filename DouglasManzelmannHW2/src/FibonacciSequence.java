/*******
 *  Program Name: Fibonacci Sequence
 * 	Author: Douglas Manzelmann
 * 	Date: 11/07/13
 * 	Description: This is an example of using a while loop to calculate 
 * 				 numbers in the fibonnaci sequence. I stop the loop 
 * 				 at an arbitrary point.
 * 
 */

public class FibonacciSequence {
	public static void main(String[] args) {
		
		//==========INITIALIZATION SECTION==========
		int current = 0;
		int next = 1;
		//==========END OF INITIALIZATION SECTION==========
		
		//==========INITIAL OUTPUT SECTION==========
		// Printing the first two numbers in the sequence
		System.out.print(current + "\t");
		System.out.print(next + "\t");
		//==========END OF INITIAL OUTPUT==========
		
		//==========LOOPING SECTION==========
		while (next < 10000) {
			// Print the next number in the sequence
			System.out.print(current + next + "\t");
			
			// Incrementing current and next
			// Using oldCurrent as a place holder.
			int oldCurrent = current;
			current = next;
			next = oldCurrent + next;
		}		
		//==========END OF LOOPING SECTION==========
	}
	
}
