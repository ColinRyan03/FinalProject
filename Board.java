
/**
 * Colin Ryan
 * CPSC220
 * Project 5
 * Board class. This class defines the board that is played on. 
 * It has two methods, one for an example board that pops up at 
 * the beggining of each game, and another for when the game is being played.
 */
public class Board
{
    public static void ExampleBoard() {
        System.out.println("|---|---|---|");
        System.out.println("| 1 | 2 | 3 |");
        System.out.println("|---|---|---|");
        System.out.println("| 4 | 5 | 6 |");
        System.out.println("|---|---|---|");
        System.out.println("| 7 | 8 | 9 |");
        System.out.println("|---|---|---|");
    }
    
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
