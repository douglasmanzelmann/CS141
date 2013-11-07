import java.util.Scanner;

/*******
 *  Program Name: DouglasManzelmannHW1
 * 	Author: Douglas Manzelmann
 * 	Date: 10/22/13
 * 	Description: The Law of Sines
 * 				 This program prompts for Angle A, Side a and Angle B. Using the fact that a triangle's angles add up to 180 degrees,
 * 				 it is able to find Angle C. In order to find Side b and Side c, it uses the Law of Sines. 
 */

public class DouglasManzelmannHW1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int ANGLES_OF_TRIANGLE = 180;
		
		System.out.print("Enter the measure for an acute angle 'A': ");
		double angleA = input.nextDouble();
		
		System.out.print("Enter the length of side 'a': ");
		double sideA = input.nextDouble();
		
		System.out.print("Enter the measure for an acute angle 'B': ");
		double angleB = input.nextDouble();
		
		// Using the Law of Sines
		// (b / sinB) = (a / sinA)
		// b = (a * sinB) / sinA
		double sideB = (sideA * Math.sin(Math.toRadians(angleB))) / Math.sin(Math.toRadians(angleA));
		
		// The angles of a triangle add up to 180 degrees. With two known angles, you can find the third.
		double angleC = ANGLES_OF_TRIANGLE - (angleA + angleB);
		//Law of Sines
		double sideC = (sideA * Math.sin(Math.toRadians(angleC))) / Math.sin(Math.toRadians(angleA));
		
		System.out.println("A: " + angleA + "\ta: " + sideA);
		System.out.println("B: " + angleB + "\tb: " + sideB);
		System.out.println("C: " + angleC + "\tc: " + sideC);
		
		
	}

}
