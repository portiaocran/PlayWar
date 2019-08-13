package finalwar;
/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */

public abstract class Game {
    
   protected PlayerList players;// the players of the game
   protected CardDeck cardDeck; //cardDeck
//test//

   public Game () {
       
      this.players = new PlayerList();
      this.cardDeck= new CardDeck();	   
   }

}//end class
