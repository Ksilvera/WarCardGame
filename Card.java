//Kevin Silvera 
public class Card 
{ 
   private String suit;
   private int value;

   public Card(int initValue)
   {
      value = findCard(initValue);
      suit = findSuit(initValue);
   }

   public Card(String initSuit, int initValue)
   {
      suit = initSuit;
      value = initValue;
   }

//pre: takes a number from the array
//post: returns what suit it is
   public String getSuit()
   {
      return suit;
   }

//pre: takes number from array
//post: returns a numerical value for it
   public int getValue()
   {
      return this.value;
   }

//pre: enter an integer
//post: finds the number of the card 
   public int findCard(int cardNum)
   {
      int card = (cardNum % 13);
   
      return card;
   }

//pre: enter an integer
//post: finds the suit of the card
   public String findSuit(int cardNum)
   {
      String suit = "";
   
      if ((cardNum / 13) == 0) //If the card is a Diamond
         suit = "Diamonds";
      else if((cardNum / 13) == 1) //If card is a Heart
         suit = "Hearts ";
      else if((cardNum / 13) == 2) //If card is a Spade
         suit = "Spades";
      else if((cardNum / 13) == 3) //If card is a Club
         suit = "Clubs";
      else
         System.out.println("INVALID CARD: " + cardNum);
   
      return suit;
   }


//pre: takes two cards
//post: returns which 1 if THIS card is bigger. -1 if second is bigger. 0 if equal
   public int compare(Card a)
   {
      int compared;
   
   
      if (this.value != 0 && a.value != 0) //if neither cards are aces
      {
         if (this.value > a.value)
            compared = 1;
         else if (this.value < a.value)
            compared = -1;
         else
            compared = 0;
      }
      else if(this.value == 0 && a.value != 0) //if the first card is an ace
         compared = 1;
      else if(this.value != 0 && a.value == 0) //if the second card is an ace
         compared = -1;
      else //if both cards are aces
         compared = 0;
   
      return compared;
   }

//pre: takes its value 
//post: converts it to a name. ie jack, king, queen, ace
   public String toString()
   {
      String name = "";
      if (value >= 10 || value == 0)
      {
         if (value == 12)
            name = "King of ";
         else if (value == 11)
            name = "Queen of ";
         else if (value == 10)
            name = "Jack of ";
         else if (value == 0)
            name = "Ace of ";
      
         return name + suit;
      }
      else
         return "" + (value + 1) + " of "+suit; 
   
   }


}