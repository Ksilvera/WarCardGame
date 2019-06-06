//Kevin Silvera
import java.util.*;

public class Hand 
{
   ArrayList <Card> cardList = new ArrayList <Card> (53);

//pre: takes top card off deck
//Post: returns top card
   public Card playCard()
   {
      return cardList.remove(0);
   }

//pre: takes cards that are won
//Post: puts cards won on bottom
   public void addCard(Card a)
   {
      cardList.add(a); 
   }

//pre: takes the array of the hand
//post: returns how many cards are in it and checks if its empty
   public int numCards()
   {
      int numCards = cardList.size();
      return numCards;
   }

//pre: none
//post: prints out hand
   public void printHand()
   {
      for(int i=0; i < cardList.size(); i++)
         System.out.println(i + ". " + cardList.get(i));
   }



}