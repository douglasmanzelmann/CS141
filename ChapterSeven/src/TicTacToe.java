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
        boolean isGameOver = 'false';


        while (!isGameOver) {
            System.out.print("Enter a row (0, 1 or 2) for player " + currentPlayer(turn) + ":");
            System.out.print("Enter a column (0, 1 or 2) for player " + currentPlayer(turn) + ":");

            markPlayerMove(currentPlayer(turn), board);
            isGameOver = didPlayerWin(currentPlayer(turn), board);
            isGameOver = isBoardFull(board);
            turn++;
        }



    }
}
