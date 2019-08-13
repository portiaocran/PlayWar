/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalwar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 *
 * @author Portia Ocran <ocranp@sheridancollege.ca>
 */
public class WarTest
{
    List<Card> player1 = new ArrayList<>();
   List<Card> player2 = new ArrayList<>();
    
    public WarTest ()
    {
    }
    
    @BeforeClass
    public static void setUpClass ()
    {
    }
    
    @AfterClass
    public static void tearDownClass ()
    {
    }
    
    @Before
    public void setUp ()
    {
    }
    
    @After
    public void tearDown ()
    {
    }

    
  @Test
   public void testPlayGood () throws Exception
   {
      Card card1 = new Card(3, 4);
      Card card2 = new Card(2, 3);

      player1.add(card1);
      player1.add(card2);

      List<Card> expResult = player1;

      List<Card> result = new ArrayList<>();

      if (card1.getCard() > card2.getCard()) {
         result.add(card1);
         result.add(card2);
      }
      assertEquals(expResult, result);

   }
   /**
    * Test of play method, of class War.
    *
    * @throws java.lang.Exception
    */
   @Test
   public void testPlayBad () throws Exception
   {
      Card card1 = new Card(3, 4);
      Card card2 = new Card(2, 5);
      player2.add(card1);
      player2.add(card2);

      List<Card> expResult = player2;

      List<Card> result = new ArrayList<>();

      if (card1.getCard() > card2.getCard()) {
         result.add(card1);
         result.add(card2);
      }
      else {
         result.add(card1);
         result.add(card2);
      }
      assertEquals(expResult, result);

   }

   @Test
   public void testPlayBoundry () throws Exception
   {
       
      Card card1 = new Card(4, 4);
      
      Card card2 = new Card(4, 4);

      int[] expResult = {3, 3};

      int[] result = new int[2];

      if (card1.getCard() == card2.getCard()) {
         player1.add(new Card(3, 1));
         player1.add(new Card(3, 4));
         player1.add(new Card(2, 4));
         player1.add(new Card(3, 7));
         player2.add(new Card(3, 8));
         player2.add(new Card(3, 10));
         player2.add(new Card(2, 5));
         player2.add(new Card(1, 12));
         result[0] = player1.size();
         result[1] = player2.size();

      }
      Arrays.equals(expResult, result);
//      assertEquals(expResult, result);

   }


   /**
    * Test of play method, of class War.
    *
    * @throws java.lang.Exception
    */
   @Test
   public void testPlayForLoop () throws Exception
   {
      Card[] player3 = new Card[4];
      Card[] player4 = new Card[4];
      Card[] expResult = new Card[8];
      Card[] result = new Card[8];
      System.out.println("For Loop  Testng");
      player3[0] = new Card(3, 1);
      player3[1] = new Card(3, 4);
      player3[2] = new Card(2, 4);
      player3[3] = new Card(3, 7);
      player4[0] = new Card(3, 8);
      player4[1] = new Card(3, 10);
      player4[2] = new Card(2, 5);
      player4[3] = new Card(1, 12);
      for (int x = 0; x < 4; x++) {
         expResult[x] = player3[x];
         expResult[x] = player4[x];

      }
      
      result[0] = new Card(3, 1);
      result[1] = new Card(3, 8);
      result[2] = new Card(3, 4);
      result[3] = new Card(3, 10);
      result[4] = new Card(2, 4);
      result[5] = new Card(2, 5);
      result[6] = new Card(3, 7);
      result[7] = new Card(1, 12);


      Arrays.equals(expResult, result);
   }
}
