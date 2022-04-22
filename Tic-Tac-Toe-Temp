import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

/**
 * Colin Ryan
 * CPSC220
 * Project 5
 * Game class. This includes the main method where the 
 * game is run and where the rules of the game are coded.
 * Many of these loops are to make the game error-proof.
 * It is impossible to break the game by, for example, 
 * inputting a String when prompted for an int, etc.
 */
public class Game
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        Player player1 = new Player();
        Player player2 = new Player();
        
        //Picking X's or O's and making sure Player 1's input for choice of playing as X's or O's is valid
        System.out.println("Welcome to Tic-Tac-Toe!");
        boolean notValid = true;
        while (notValid) {
            System.out.println("Player 1, would you like to be X's or O's? (Enter X or O): ");
            String player1Option = input.nextLine();
            if (player1Option.equals("X") || player1Option.equals("O")) {
                player1.setXO(player1Option);
                notValid = false;
            } else {
                System.out.println("That is not a valid input. Please try again.");
            }
        }
        
        //Making Player 1 and Player 2 an X and an O based on what Player 1 picked
        if (player1.getXO().equals("O")) {
            System.out.println("Player 1, you are O's!");
            System.out.println("Player 2, you are X's!");
            player2.setXO("X");
        } else if (player1.getXO().equals("X")) {
            System.out.println("Player 1, you are X's!");
            System.out.println("Player 2, you are O's!");
            player2.setXO("O");
        }
        
        //Explaining the game to the users
        System.out.println();
        System.out.println("Here is the board you will play on: ");
        Board.ExampleBoard();
        System.out.println("When prompted, each player will enter the number of the slot they'd like to play on.");
        System.out.println("If you do not pick a playable slot, you will be prompted to try again.");
        System.out.println();
        System.out.println("But before we begin, let's decide who gets to play first.");
        System.out.println("I am thinking of a number 1-100. Each player will pick a number in this range, and whoever gets closest to my number gets to go first.");
        System.out.println();
        
        //Getting a random int
        boolean tied = true;
        String playerTurn = "";
        int player1OptionInt = 0;
        int player2OptionInt = 0;
        while (tied) {
            boolean notValidInt = true;
            boolean intNotInRange = true;
            while (notValidInt) {
                try {
                    while (intNotInRange) {
                        System.out.println("Player 1, enter your number: ");
                        player1OptionInt = input.nextInt();
                        if (player1OptionInt > 0 && player1OptionInt <= 100) {
                            notValidInt = false;
                            intNotInRange = false;
                        } else {
                            System.out.println("That number is not in range 1-100. Please enter a new integer: ");
                        }
                    }
                } catch (Exception e) {
                    System.out.println("That is not a valid input. Please try again.");
                }
                input.nextLine();
            }
            
            //Same thing as the above loops, but for Player 2
            notValidInt = true;
            intNotInRange = true;
            while (notValidInt) {
                try {
                    while (intNotInRange) {
                        System.out.println("Player 2, enter your number: ");
                        player2OptionInt = input.nextInt();
                        if (player2OptionInt > 0 && player2OptionInt <= 100) {
                            notValidInt = false;
                            intNotInRange = false;
                        } else {
                            System.out.println("That number is not in range 1-100. Please enter a new integer: ");
                        }
                    }
                } catch (Exception e) {
                    System.out.println("That is not a valid input. Please try again.");
                }
                input.nextLine();
            }
            
            //Determining whose number was closer, if they tied, and printing if a Player's guess was spot on (this isn't
            //necessary of course, but it's just another function for the program to make it seem more "intelligent" if you will)
            int randInt = rand.nextInt(100) + 1;
            int player1Diff = Math.abs(randInt-player1OptionInt);
            int player2Diff = Math.abs(randInt-player2OptionInt);
            System.out.println("The number I was thinking of is: " + randInt + "!");
            if (player1Diff < player2Diff) {
                if (player1OptionInt == randInt) {
                    System.out.println("Player 1, your number was spot on! So, you will play first.");
                    tied = false;
                    playerTurn = "Player 1";
                } else {
                    System.out.println("Player 1, your number was closer, so you will play first.");
                    tied = false;
                    playerTurn = "Player 1";
                }
            } else if (player2Diff < player1Diff) {
                if (player2OptionInt == randInt) {
                    System.out.println("Player 2, your number was spot on! So, you will play first.");
                    tied = false;
                    playerTurn = "Player 2";
                } else {
                    System.out.println("Player 2, your number was closer, so you will play first.");
                    tied = false;
                    playerTurn = "Player 2";
                }
            } else if (player1Diff == player2Diff) {
                System.out.println("You tied! Try again.");
            }
        }
        
        //Making strings spaces as default so that every slot on the board is evenly spaced and looks empty
        String s1 = " ";
        String s2 = " ";
        String s3 = " ";
        String s4 = " ";
        String s5 = " ";
        String s6 = " ";
        String s7 = " ";
        String s8 = " ";
        String s9 = " ";
        
        //Beginning the game
        System.out.println();
        System.out.println("Let's begin!");
        Board.Board(s1, s2, s3, s4, s5, s6, s7, s8, s9);
        boolean gameOngoing = true;
        boolean tie = true;
        String winner = "";
        while (gameOngoing) {
            //The first thing we do after every single player move is check if the game is finished, and if it is, who the winner is
            //These if/else if statements check if a player has three slots in a row
            if ((s1.equals(player1.getXO()) && s2.equals(player1.getXO()) && s3.equals(player1.getXO())) || 
            (s4.equals(player1.getXO()) && s5.equals(player1.getXO()) && s6.equals(player1.getXO())) ||
            (s7.equals(player1.getXO()) && s8.equals(player1.getXO()) && s9.equals(player1.getXO()))) {
                winner = "Player 1";
                tie = false;
                break;
            } else if ((s1.equals(player2.getXO()) && s2.equals(player2.getXO()) && s3.equals(player2.getXO())) || 
            (s4.equals(player2.getXO()) && s5.equals(player2.getXO()) && s6.equals(player2.getXO())) ||
            (s7.equals(player2.getXO()) && s8.equals(player2.getXO()) && s9.equals(player2.getXO()))) {
                winner = "Player 2";
                tie = false;
                break;
            } else if ((s1.equals(player1.getXO()) && s4.equals(player1.getXO()) && s7.equals(player1.getXO())) || 
            (s2.equals(player1.getXO()) && s5.equals(player1.getXO()) && s8.equals(player1.getXO())) ||
            (s3.equals(player1.getXO()) && s6.equals(player1.getXO()) && s9.equals(player1.getXO()))) {
                winner = "Player 1";
                tie = false;
                break;
            } else if ((s1.equals(player2.getXO()) && s4.equals(player2.getXO()) && s7.equals(player2.getXO())) || 
            (s2.equals(player2.getXO()) && s5.equals(player2.getXO()) && s8.equals(player2.getXO())) ||
            (s3.equals(player2.getXO()) && s6.equals(player2.getXO()) && s9.equals(player2.getXO()))) {
                winner = "Player 2";
                tie = false;
                break;
            } else if ((s1.equals(player1.getXO()) && s5.equals(player1.getXO()) && s9.equals(player1.getXO())) ||
            (s3.equals(player1.getXO()) && s5.equals(player1.getXO()) && s7.equals(player1.getXO()))) {
                winner = "Player 1";
                tie = false;
                break;
            } else if ((s1.equals(player2.getXO()) && s5.equals(player2.getXO()) && s9.equals(player2.getXO())) ||
            (s3.equals(player2.getXO()) && s5.equals(player2.getXO()) && s7.equals(player2.getXO()))) {
                winner = "Player 2";
                tie = false;
                break;
            } 
            
            //Checking if the entire board is played on, and if it is, terminating the loop, ending the game
            //This comes after the checking of a winner to prevent the output being wrong in certain cases (e.g.,
            //if the entire Board is played on, but the game is NOT a tie)
            if (!s1.equals(" ") && !s2.equals(" ") && !s3.equals(" ") && !s4.equals(" ") && !s5.equals(" ") &&
            !s6.equals(" ") && !s7.equals(" ") && !s8.equals(" ") && !s9.equals(" ")) {
                gameOngoing = false;
                break;
            }
            
            //This loop asks for user input (for the slot they'd like to play on), and if it is not valid, prompts them to try again
            //If the input is not an integer or if it's a number exceeding 9 and being less than or equal to zero, the program asks again
            //for input, printing that the previous input is not valid.
            notValid = true;
            int playerMove = 0;
            boolean validInput = true;
            while (notValid) {
                try {
                    System.out.println(playerTurn + ", make your move!");
                    int temp = input.nextInt();
                    playerMove = temp;
                    if (playerMove > 9 || playerMove <= 0) {
                        System.out.println("That is not a valid input. Please enter a number 1-9.");
                        validInput = false;
                        break;
                    } else {
                        notValid = false;
                    }
                } catch (Exception e) {
                    System.out.println("That is not a valid input. Please input an integer.");
                    notValid = false;
                    validInput = false;
                }
                input.nextLine();
            }
            
            //If a Player is trying to play on a slot that has already been played on, it prompts them to try again
            if (playerTurn.equals("Player 1")) {
                if (playerMove == 1) {
                    if (s1.equals(" ")) {
                        s1 = player1.getXO();
                    } else {
                        System.out.println("Slot 1 has already been played on. Please try again.");
                        validInput = false;
                    }
                } else if (playerMove == 2) {
                    if (s2.equals(" ")) {
                        s2 = player1.getXO();
                    } else {
                        System.out.println("Slot 2 has already been played on. Please try again.");
                        validInput = false;
                    }
                } else if (playerMove == 3) {
                    if (s3.equals(" ")) {
                        s3 = player1.getXO();
                    } else {
                        System.out.println("Slot 3 has already been played on. Please try again.");
                        validInput = false;
                    }
                } else if (playerMove == 4) {
                    if (s4.equals(" ")) {
                        s4 = player1.getXO();
                    } else {
                        System.out.println("Slot 4 has already been played on. Please try again.");
                        validInput = false;
                    }
                } else if (playerMove == 5) {
                    if (s5.equals(" ")) {
                        s5 = player1.getXO();
                    } else {
                        System.out.println("Slot 5 has already been played on. Please try again.");
                        validInput = false;
                    }
                } else if (playerMove == 6) {
                    if (s6.equals(" ")) {
                        s6 = player1.getXO();
                    } else {
                        System.out.println("Slot 6 has already been played on. Please try again.");
                        validInput = false;
                    }
                } else if (playerMove == 7) {
                    if (s7.equals(" ")) {
                        s7 = player1.getXO();
                    } else {
                        System.out.println("Slot 7 has already been played on. Please try again.");
                        validInput = false;
                    }
                } else if (playerMove == 8) {
                    if (s8.equals(" ")) {
                        s8 = player1.getXO();
                    } else {
                        System.out.println("Slot 8 has already been played on. Please try again.");
                        validInput = false;
                    }
                } else if (playerMove == 9) {
                    if (s9.equals(" ")) {
                        s9 = player1.getXO();
                    } else {
                        System.out.println("Slot 9 has already been played on. Please try again.");
                        validInput = false;
                    }
                }
            }
            if (playerTurn.equals("Player 2")) {
                if (playerMove == 1) {
                    if (s1.equals(" ")) {
                        s1 = player2.getXO();
                    } else {
                        System.out.println("Slot 1 has already been played on. Please try again.");
                        validInput = false;
                    }
                } else if (playerMove == 2) {
                    if (s2.equals(" ")) {
                        s2 = player2.getXO();
                    } else {
                        System.out.println("Slot 2 has already been played on. Please try again.");
                        validInput = false;
                    }
                } else if (playerMove == 3) {
                    if (s3.equals(" ")) {
                        s3 = player2.getXO();
                    } else {
                        System.out.println("Slot 3 has already been played on. Please try again.");
                        validInput = false;
                    }
                } else if (playerMove == 4) {
                    if (s4.equals(" ")) {
                        s4 = player2.getXO();
                    } else {
                        System.out.println("Slot 4 has already been played on. Please try again.");
                        validInput = false;
                    }
                } else if (playerMove == 5) {
                    if (s5.equals(" ")) {
                        s5 = player2.getXO();
                    } else {
                        System.out.println("Slot 5 has already been played on. Please try again.");
                        validInput = false;
                    }
                } else if (playerMove == 6) {
                    if (s6.equals(" ")) {
                        s6 = player2.getXO();
                    } else {
                        System.out.println("Slot 6 has already been played on. Please try again.");
                        validInput = false;
                    }
                } else if (playerMove == 7) {
                    if (s7.equals(" ")) {
                        s7 = player2.getXO();
                    } else {
                        System.out.println("Slot 7 has already been played on. Please try again.");
                        validInput = false;
                    }
                } else if (playerMove == 8) {
                    if (s8.equals(" ")) {
                        s8 = player2.getXO();
                    } else {
                        System.out.println("Slot 8 has already been played on. Please try again.");
                        validInput = false;
                    }
                } else if (playerMove == 9) {
                    if (s9.equals(" ")) {
                        s9 = player2.getXO();
                    } else {
                        System.out.println("Slot 9 has already been played on. Please try again.");
                        validInput = false;
                    }
                }
            }
            
            //Switching Player turns
            if (validInput) {
                if (playerTurn.equals("Player 1")) {
                    playerTurn = "Player 2";
                } else if (playerTurn.equals("Player 2")) {
                    playerTurn = "Player 1";
                }
                
                System.out.println();
                Board.Board(s1, s2, s3, s4, s5, s6, s7, s8, s9);
            }
        }
        
        if (tie) {
            System.out.println("You tied!");
        } else {
            System.out.println("Congratulations, " + winner + "! You won!");
        }
        System.out.println("Game end! Thanks for playing!");
    }
}
