
/**
 * Colin Ryan
 * CPSC220
 * Project 5
 * Player class. This class defines the Player object, which has a String as an input parameter, an X or an O.
 * There is a getter and setter for whether a player is an X player or an O player.
 */
public class Player
{
    //char for a whether a player is playing as X's or O's
    private String xo;
    
    //default constructor
    Player() {
        
    }
    
    //constructor with string input
    public Player(String xo) {
        this.xo = xo;
    }
    
    //getter and setter for whether a player is playing X's or O's
    public void setXO(String xo) {
        this.xo = xo;
    }
    
    public String getXO() {
        return xo;
    }
}
