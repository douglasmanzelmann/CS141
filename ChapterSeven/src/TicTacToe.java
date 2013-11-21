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
        char[][] board = new char[5][5];
        int turn = 0;
        boolean isGameOver = false;
        char winner = '\u0000';
        Scanner input = new Scanner(System.in);


        while (!isGameOver) {
            System.out.print("Enter a row (1, 2 or 3) for player " + currentPlayer(turn) + ":");
            int row = input.nextInt();
            System.out.print("Enter a column (1, 2 or 3) for player " + currentPlayer(turn) + ":");
            int column = input.nextInt();

            if (!validMove(row, column, board)) {
                System.out.println("That space is already filled. Make another move.");
                continue;
            }

            markPlayerMove(currentPlayer(turn), board, row, column);
            isGameOver = isBoardFull(board);

            if (didPlayerWin(currentPlayer(turn), board, row, column)) {
                isGameOver = true;
                winner = currentPlayer(turn);
            }

            printBoard(board);
            turn++;
        }

        if (winner != '\u0000')
            System.out.println("The winner is " + winner);
        else
            System.out.println("It's a tie");
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
        board[row][column] = player;
    }

    public static boolean validMove(int row, int column, char[][] board) {
        if (board[row][column] == '\u0000')
            return true;
        else
            return false;
    }

    public static boolean didPlayerWin(char player, char[][] board, int row, int column) {
        if (board[row-1][column] == player) { // north
            if (board[row-2][column] == player) // north again
                return true;
            else if (board[row+1][column] == player) // south from the turn
                return true;
        }

        else if (board[row+1][column] == player) { // south
            if (board[row+2][column] == player) // south again
                return true;
            else if (board[row-1][column] == player) // north from the turn
                return true;
        }

        else if (board[row][column-1] == player) { // west
            if (board[row][column-2] == player)    // west again
                return true;
            else if (board[row][column+1] == player)    // east from turn
                return true;
        }

        else if (board[row-1][column-1] == player) { //diagonal north west
            if (board[row-2][column-2] == player) {
                return true;
            }
            else if (board[row+1][column+1] == player)
                return true;
        }

        else if (board[row-1][column+1] == player) { //diagonal north east
            if (board[row-2][column+2] == player)
                return true;
            else if (board[row+1][column-1] == player)
                return true;
        }

        else if (board[row+1][column-1] == player) { //diagonal south west
            if (board[row+2][column-2] == player) {
                return true;
            }
            else if (board[row-1][column+1] == player)
                return true;
        }

        else if (board[row+1][column+1] == player) { //diagonal south east
            if (board[row+2][column+2] == player)
                return true;
            else if (board[row-1][column-1] == player)
                return true;
        }

        return false;
    }

    public static boolean isBoardFull(char[][] board) {
        for (int row = 1; row < 4; row++) {
            for (int col = 1; col < 4; col++) {
                if (board[row][col] == '\u0000')
                    return false;
            }
        }

        return true;
    }

    public static void printBoard(char[][] board) {
        System.out.println("_____________");
        for (int row = 1; row < 4; row++){
            for (int col = 1; col < 4; col++) {
                if (col == 1 || col == 3)
                    System.out.print("| " + board[row][col] + " |");
                else
                    System.out.print(" " + board[row][col] + " ");
            }
            System.out.print("\n_____________\n");
        }
    }
}
