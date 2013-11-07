/*******
 *  Program Name: DouglasManzelmannP1
 * 	Author: Douglas Manzelmann
 * 	Date: 10/25/13
 * 	Description: This is Project 1 in CS 141. The program prompts the user for their full name,
 * 				 their age and their three lucky numbers. It then displays dialogs, showing a 
 * 				 greeting with their full name, a message corresponding to their age, and 
 * 				 the average of their three lucky numbers. *
 */

import javax.swing.JOptionPane;

public class DouglasManzelmannP1 {
	public static void main(String[] args) {
		//==========INPUT SECTION==========
		String fullName = JOptionPane.showInputDialog("Enter your full name");
		String ageString = JOptionPane.showInputDialog("Enter your age");
		String luckyNumberOneString = JOptionPane.showInputDialog("Enter your first lucky number");
		String luckyNumberTwoString = JOptionPane.showInputDialog("Enter your second lucky number");
		String luckyNumberThreeString = JOptionPane.showInputDialog("Enter your third lucky number");
		//==========END OF INPUT SECTION==========
		
		//==========CONVERT USER INPUT FROM STRING TO INT SECTION==========
		int age = Integer.parseInt(ageString);
		int luckyNumberOne = Integer.parseInt(luckyNumberOneString);
		int luckyNumberTwo = Integer.parseInt(luckyNumberTwoString);
		int luckyNumberThree = Integer.parseInt(luckyNumberThreeString);
		//==========END OF CONVERT SECTION==========
		
		//==========DETERMINE A MESSAGE BASED ON THE USER'S AGE==========
		String ageMessage;
		if (age <= 12) {
			ageMessage = "You are just a kid!";
		}
		else if (age >= 12 && age < 20) {
			ageMessage = "Welcome, teenager!";
		}
		else if (age == 20) {
			ageMessage = "Welcome, almost-adult!";
		}
		else {
			ageMessage = "Welcome, adult!";
		}
		//==========END OF MESSAGE DETERMINATION SECTION==========
		
		//==========AVERAGE USER'S LUCKY NUMBERS==========
		double luckyNumberAverage = (luckyNumberOne + luckyNumberTwo + luckyNumberThree) / 3.0;
		//==========END OF AVERAGE SECTION==========
		
		//==========OUTPUT SECTION==========
		JOptionPane.showMessageDialog(null, "Welcome, " + fullName);
		JOptionPane.showMessageDialog(null, ageMessage);
		JOptionPane.showMessageDialog(null, "The average of your three lucky numbers is: " + luckyNumberAverage);		
		//==========END OF OUTPUT SECTION==========
	}
}
