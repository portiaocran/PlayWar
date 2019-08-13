package finalwar;
import java.util.ArrayList;
/**
 * @author Portia Ocran
 */
public class CardDeck 
{
private ArrayList<Card> cardDeck; //cardDeck

    public CardDeck ()
    {
	this.cardDeck = new ArrayList<Card>();
    }

    public ArrayList<Card> getCardDeck ()
    {
	return cardDeck;
    }
    
}
