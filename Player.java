
/**
 * Colin Ryan
 * CPSC220
 * Project 5
 * Player class. This class defines the Player object, which has a default 
 * constructor and multiple non-default constructors.
 * There are getters and setters for getting and setting a player as an X 
 * Player or an O Player, the amount of wins a Player has, and which Player's 
 * turn it currently is.
 */
public class Player
{
    //char for a whether a player is playing as X's or O's
    private String xo;
    private boolean PlayerTurn;
    private int wins;
    
    //Constructors
    /**
     * This is the default constructor, to be used when a Player is created
     * without specifying just yet whether they are an X or an O Player. 
     */
    Player() {
        
    }
    
    /**
     * Constructor with String parameter, indicating whether the Player is an X or an O Player,
     * and boolean PlayerTurn, indicating whether it is the Player's turn or not, and an int
     * indicating how many wins the player has.
     */
    public Player(String xo, boolean PlayerTurn, int wins) {
        this.xo = xo;
        this.PlayerTurn = PlayerTurn;
    }
    
    /**
     * Constructor with int parameter, indicating the amount of wins a Player has.
     */
    public Player(int wins) {
        this.wins = wins;
    }
    
    
    //Getters and Setters
    /**Setter for setting a Player's type (X or O)
     */
    public void setXO(String xo) {
        this.xo = xo;
    }
    
    /**
     * Getter for getting a Player's type (X or O)
     */
    public String getXO() {
        return xo;
    }
    
    /**Setter for setting a Player's turn (true if it's the Player's turn, false if it isn't)
     */
    public void setPlayerTurn(boolean PlayerTurn) {
        this.PlayerTurn = PlayerTurn;
    }
    
    /**
     * Getter for getting a Player's turn (true if it's the Player's turn, false if it isn't)
     */
    public boolean getPlayerTurn() {
        return PlayerTurn;
    }
    
    /**Setter for setting the amount of wins a Player has
     */
    public void setPlayerWins(int wins) {
        this.wins = wins;
    }
    
    /**
     * Getter for getting the amount of wins a Player has
     */
    public int getPlayerWins() {
        return wins;
    }
}
