//Below is the URL where I found the sample code for this project
//https://www.coderslexicon.com/a-beginner-tic-tac-toe-class-for-java/

package Tic_Tac_Toe;

import static Tic_Tac_Toe.Field.*;
import static Tic_Tac_Toe.Model.*;

public class Controller {

    public static final int PLAYING = 0; //shows the state of the game
    public static final int DRAW = 1;
    public static final int CROSS_WON = 2;
    public static final int NOUGHT_WON = 3;

    public static boolean isDraw() {    //determines if the game is a draw, continues if false
        for (int row = 0; row < ROWS; ++row) {
            for (int col = 0; col < COLS; ++col) {
                if (modelBoard[row][col] == EMPTY) {
                    return false;  // an empty cell found, not draw, exit
                }
            }
        }
        return true;  // no empty cell, it's a draw
    }

}
