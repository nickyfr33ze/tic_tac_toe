//Below is the URL where I found the sample code for this project
//https://www.coderslexicon.com/a-beginner-tic-tac-toe-class-for-java/

package Tic_Tac_Toe;

import java.util.Scanner;

import static Tic_Tac_Toe.Controller.PLAYING;

public class Field {
    //sets what each box contains on the field's board.
    public static final int EMPTY = 0;
    public static final int CROSS = 1;
    public static final int NOUGHT = 2;

//  used in 'Controller.java'
//    public static final int PLAYING = 0;
//    public static final int DRAW = 1;
//    public static final int CROSS_WON = 2;
//    public static final int NOUGHT_WON = 3;

    public static final int ROWS = 3, COLS = 3; //sets number of rows and columns
    public static int[][] fieldBoard = new int[ROWS][COLS]; //2D array for the board
    // containing (EMPTY, CROSS, NOUGHT)
    public static int currentState; //the current state of the game
    public static int currentPlayer; // the current player
    public static int currentRow, currentCol; //current row and column

    public static Scanner in = new Scanner(System.in);

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

    public static void playerMove(int theSeed) {
        boolean validInput = false;  // for input validation
        do {
            if (theSeed == CROSS) {
                System.out.print("Player 'X', enter your move (row[1-3] column[1-3]): ");
            } else {
                System.out.print("Player 'O', enter your move (row[1-3] column[1-3]): ");
            }
            int row = in.nextInt() - 1;  // array index starts at 0 instead of 1
            int col = in.nextInt() - 1;
            if (row >= 0 && row < ROWS && col >= 0 && col < COLS && fieldBoard[row][col] == EMPTY) {
                currentRow = row;
                currentCol = col;
                fieldBoard[currentRow][currentCol] = theSeed;  // update game-board content
                validInput = true;  // input okay, exit loop
            } else {
                System.out.println("This move at (" + (row + 1) + "," + (col + 1)
                        + ") is not valid. Try again...");
            }
        } while (!validInput);  // repeat until input is valid
    }


}
