/*******
 *  Program Name: isPrime
 * 	Author: Douglas Manzelmann
 * 	Date: 11/11/13
 * 	Description: Created a PrimeClass for some auxilary functions for prime numbers.
 * 				 The method I created, which is present in other languages (used it in Ruby),
 * 				 is a boolean method: it returns true or false, determining if the value is 
 * 				 a prime.
 */
public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.println("The first prime number is: " + nthPrime(1));
		System.out.println("The 5th prime number is: " + nthPrime(5));
		System.out.println("The 7th prime number is: " + nthPrime(7));
		System.out.println("The 20th prime number is: " + nthPrime(20));
		System.out.println("The 64th prime number is: " + nthPrime(64));
		System.out.println("The 167th prime number is: " + nthPrime(167));
	}
		
	public static int nthPrime(int n) {
		int i = 1;
		int numberOfPrimes = 0;
		
		while (numberOfPrimes < n) {
			i++;
			if (isPrime(i)) {
				numberOfPrimes++;
			}
		}
		
		return i;
	}

	public static boolean isPrime(int isPrime) {
		if (isPrime == 2) {
			return true;
		}

		// Learned that an algorithmic speed up is using sqrt(isPrime) in another programming class
		// For loop starts at 2 and goes up to the sqrt of isPrime. 
		// If any integer evenly divides into isPrime, it's not a prime.
		for (int i = 2; i <= Math.sqrt(isPrime); i++) {
			if (isPrime % i == 0) 
				return false;
		}
	
		return true;
	}
}
