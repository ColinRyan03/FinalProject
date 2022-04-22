
/**
 * Colin Ryan
 * CPSC220
 * Project 5
 * Board class. This class creates the board that is played on.
 * It has two methods, one to print an example board that pops up at 
 * the beggining of each game (to show the user the format of the
 * game board) and another for when the game is being played, with the 
 * slots filled in with the 9 strings, which are by default blank until
 * the user decaides to play on a slot, in which case the blank string
 * will be replaced by an X or an O, depending on which player the user is. 
 */
public class Board
{
    /**
     * This method prints an Example Board to the screen in the
     * format below, where the numbers represent each slot to play on.
     * There are no parameters.
     */
    public static void ExampleBoard() {
        System.out.println("|---|---|---|");
        System.out.println("| 1 | 2 | 3 |");
        System.out.println("|---|---|---|");
        System.out.println("| 4 | 5 | 6 |");
        System.out.println("|---|---|---|");
        System.out.println("| 7 | 8 | 9 |");
        System.out.println("|---|---|---|");
    }
    
    /**
     * This method prints the Board during gameplay. Instead of unchanging
     * numbers like with the Example Board, printed are 9 strings. By
     * default, these are all set to a single space in the Game class.
     * When a Player plays on a slot, the string is replaced with an X
     * or an O, depending on what type of Player they are.
     * There are no parameters.
     */
    public static void Board(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9) {
        System.out.println("|---|---|---|");
        System.out.println("| " + s1 + " | " + s2 + " | " + s3 + " |");
        System.out.println("|---|---|---|");
        System.out.println("| " + s4 + " | " + s5 + " | " + s6 + " |");
        System.out.println("|---|---|---|");
        System.out.println("| " + s7 + " | " + s8 + " | " + s9 + " |");
        System.out.println("|---|---|---|");
    }
}
