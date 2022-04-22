
/**
 * Colin Ryan
 * CPSC220
 * Project 5
 * Player class. This class defines the Player object, which has a default 
 * constructor and a non-default constructor.
 * There is a getter and setter for getting and setting a player as an X 
 * Player or an O Player.
 */
public class Player
{
    //char for a whether a player is playing as X's or O's
    private String xo;
    
    /**
     * This is the default constructor, to be used when a Player is created
     * without specifying just yet whether they are an X or an O Player. 
     */
    Player() {
        
    }
    
    /**
     * Constructor with String input, indicating
     * whether the Player is an X or an O Player. 
     */
    public Player(String xo) {
        this.xo = xo;
    }
    
    /**Getter for getting a Player's type (X or O)
     */
    public void setXO(String xo) {
        this.xo = xo;
    }
    
    /**
     * Setter for setting a Player's type (X or O)
     */
    public String getXO() {
        return xo;
    }
}
