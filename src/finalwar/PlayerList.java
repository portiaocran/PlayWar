package finalwar;
import java.util.ArrayList;
/**
 * @author Portia Ocran
 */
public class PlayerList 
{
private ArrayList<Player> players; //cardDeck

    public PlayerList()
    {
	this.players = new ArrayList<Player>();
    }
    
    public void add(Player player) {
	
       this.players.add(player);
   }
       
    public ArrayList<Player> getPlayers ()
    {
	return players;
    }

}
