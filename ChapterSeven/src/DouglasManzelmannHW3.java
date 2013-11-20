import java.util.Scanner;
import static java.util.Arrays.sort;

/**
 * Created with IntelliJ IDEA.
 * User: dmanzelmann
 * Date: 11/20/13
 * Time: 2:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class DouglasManzelmannHW3 {
    public static void main(String[] args) {

        final int INPUT_NUMBER = 10;

        System.out.print("Enter " + INPUT_NUMBER + " numbers: ");
        double[] array = readArray(INPUT_NUMBER);
        sort(array);
        printArray(array);

    }

    public static double[] readArray(int size) {
        Scanner input = new Scanner(System.in);
        double[] array = new double[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }

        return array;
    }

    public static void printArray(double[] array) {
        for (double i: array) {
            System.out.print(i + " ");
        }
    }
}
