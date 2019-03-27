package Tic_Tac_Toe;

import static Tic_Tac_Toe.Controller.PLAYING;
import static Tic_Tac_Toe.Field.*;
import static Tic_Tac_Toe.Field.ROWS;
import static Tic_Tac_Toe.Field.COLS;


public class MAIN {



    public static void main(String[] args) {
//        System.out.println("Player 'X' please select your coordinates. (rows[1-3] columns[1-3]).");
//        Scanner scan = new Scanner(System.in);
//        int row = scan.nextInt();
//        int column = scan.nextInt();
        initGame();

    }
    public static void initGame() {
        for (int row = 0; row < ROWS; ++row) {
            for (int col = 0; col < COLS; ++col) {
                fieldBoard[row][col] = EMPTY;  // all cells empty
            }
        }
        currentState = PLAYING; // ready to play
        currentPlayer = CROSS;  // cross plays first
    }
}
