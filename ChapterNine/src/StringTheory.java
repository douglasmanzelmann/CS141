import java.util.Scanner;

/**
 * Created by dmanzelmann on 12/4/13.
 */
public class StringTheory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int students = input.nextInt();

        System.out.println("Enter the number of tests: ");
        int tests = input.nextInt();

        int [][] scores = new int[students][tests+1];

        for (int row = 0; row < scores.length; row++) {
            System.out.println("Enter the scores for student #" + row);
            for (int col = 1; col < scores[row].length; col++) {
                scores[row][col] = input.nextInt();
            }
        }

        for (int row = 0; row < scores.length; row++) {
            for (int col = 1; col < scores[row].length; col++) {
                scores[row][0] += scores[row][col];
            }
        }

        StringBuilder[][] scoreGraphs = new StringBuilder[students][tests+1];
        for (int row = 0; row < scoreGraphs.length; row++) {
            for (int col = 1; col < scoreGraphs[row].length; col++) {
                scoreGraphs[row][col] = new StringBuilder(scores[row][col]);
                scoreGraphs[row][col].append(graphScore(scores[row][col]));
            }
        }

        for (int row = 0; row < scoreGraphs.length; row++) {
            System.out.println("Scores for student #" + row);
            for (int col = 1; col < scoreGraphs[row].length; col++) {
                System.out.println("Test #" + col + ": " + scoreGraphs[row][col]);
            }
            System.out.println("Student #" + row + " aveage: " + graphScore(scores[row][0] / (scores[row].length -1) ));
        }

    }

    public static String graphScore(int score) {
        StringBuilder graph = new StringBuilder(score);

        for (int i = 0; i < score; i ++) {
            graph.append('*');
        }

        return graph.toString();
    }
}
