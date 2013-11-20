import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: dmanzelmann
 * Date: 11/19/13
 * Time: 2:20 PM
 * To change this template use File | Settings | File Templates.
 */


public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        char[] players = {'X', 'O'};
        int turn = 0;
        boolean isGameOver = false;
        char winner;
        Scanner input = new Scanner(System.in);


        while (!isGameOver) {
            System.out.print("Enter a row (0, 1 or 2) for player " + currentPlayer(turn) + ":");
            int row = input.nextInt();
            System.out.print("Enter a column (0, 1 or 2) for player " + currentPlayer(turn) + ":");
            int column = input.nextInt();

            markPlayerMove(currentPlayer(turn), board, row, column);

            if (!didPlayerWin(currentPlayer(turn), board)) {
                isGameOver = true;
                winner = currentPlayer(turn);
            }

            isGameOver = isBoardFull(board);
            turn++;
        }
    }

    public static char currentPlayer(int turn) {
        if (turn % 2 == 0) {
            return 'X';
        }

        else {
            return 'O';
        }
    }

    public static void markPlayerMove(char player, char[][] board, int row, int column) {

    }
}
