import java.util.Scanner;
import static java.util.Arrays.sort;

/**
 * Author: Douglas Manzelmann
 * Date: 11/20/13
 * Description: Homework 3
 *              The program prompts the user for 10 (INPUT_NUMBER) numbers,
 *              sorts them (from lowest to highest), and prints them out in order.
 */

public class DouglasManzelmannHW3 {
    public static void main(String[] args) {

        final int INPUT_NUMBER = 10;

        System.out.print("Enter " + INPUT_NUMBER + " numbers: ");
        double[] array = readArray(INPUT_NUMBER);
        sort(array);
        printArray(array);

    }

    /**
     * Reads inputs for an array with a length of 'size' and returns 'array'
     *
     * @param size the size of the array as defined by the user
     * @return array the array returned by the function
     */
    public static double[] readArray(int size) {
        Scanner input = new Scanner(System.in);
        double[] array = new double[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }

        return array;
    }


    /**
     * Prints the array on one line seperated by spaces
     *
     * @param array the array to print
     */
    public static void printArray(double[] array) {
        for (double i: array) {
            System.out.print(i + " ");
        }
    }
}
