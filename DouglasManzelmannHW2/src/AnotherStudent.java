import java.util.Scanner;
public class AnotherStudent {
  public static void main(String[] args) {
    // Create a scanner
    Scanner input = new Scanner(System.in);
    
    // Read an initial data
    System.out.print("Enter the age of your first classmate(press '0' to end the program): ");
    double data = input.nextDouble();
    
    // Begin the loop
    double sum = 0;
    double count = 0;
     while (data != 0) {
     sum += data;
     count++;   // Increase the count by 1.
       // Read the next data
       System.out.print("Enter your next classmates age(press '0' to end the program): ");
       data = input.nextDouble();
    }
    
     // Calculate the average
    double average = sum/count;
    
    // Display the results
    System.out.println("The sum of your classmates age is: " + sum);
    System.out.println("The average age of your class is: " + average);
    }
    
}