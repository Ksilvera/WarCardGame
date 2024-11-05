//Kevin Silvera
//MUST COMPILE BEFORE RUNNING EVERYTIME OR ELSE INFINITE LOOP!
public class War
{

   public static void main(String[] args) 
   {
   
      Deck warDeck = new Deck(); //Creating the Deck of Cards
   
      Hand player1 = new Hand(); //Creating player 1's hand
      Hand player2 = new Hand(); //Creating player 2's hand
   
      warDeck.shuffle(); //Shuffling the Deck
   
      boolean done = false;
   
      while(!done) //Dealing the Cards
      {
         if(!(warDeck.isEmpty()))
            player1.addCard(warDeck.deal());
         else
            done = true;
      
      
         if(!(warDeck.isEmpty()))
            player2.addCard(warDeck.deal());
         else
            done = true;
      }
   
   
      while(player1.numCards() != 0 && player2.numCards() != 0)
      {
      
      //Playing the Game
         Card p1Card = player1.playCard();
         Card p2Card = player2.playCard();
         System.out.println("Player 1 places " + p1Card.toString());
         System.out.println("Player 2 places "+ p2Card.toString());

         if (p1Card.compare(p2Card) == 1) //if player1 wins
         {
            System.out.println("Player 1 Wins!\n");
            player1.addCard(p1Card);
            player1.addCard(p2Card);
         }
         
         else if (p1Card.compare(p2Card) == -1) //if player2 wins
         {
            System.out.println("Player 2 Wins!\n");
            player2.addCard(p1Card);
            player2.addCard(p2Card);
         }
         else //if a war is declared
         {
            if (player1.numCards() >= 4 && player2.numCards() >= 4)
               war(player1 , player2);
            else if (player1.numCards() == 3 || player2.numCards() == 3)
               war2(player1 , player2);
            else if (player1.numCards() == 2 || player2.numCards() == 2)
               war3(player1 , player2);
            else
               war4(player1 , player2);
         }
      
      }
   
   //Declaring the Winner
      if(player2.numCards() == 0)
         System.out.println("\nPLAYER 1 WINS THE GAME!!!");
      else
         System.out.println("\nPLAYER 2 WINS THE GAME!!!");
   
   
   
   }

//pre: if two hands are created and both users have 4 or more cards
//post: plays war when two cards are equal
   public static void war(Hand player1, Hand player2)
   {
      System.out.println("\nWAR!!!\n");
   
   //Playing 3 Cards Facedown
      Card p1Card1 = player1.playCard();
      Card p1Card2 = player1.playCard();
      Card p1Card3 = player1.playCard();
      Card p1Card4 = player1.playCard();
   
      Card p2Card1 = player2.playCard();
      Card p2Card2 = player2.playCard();
      Card p2Card3 = player2.playCard();
      Card p2Card4 = player2.playCard();
   
      if (p1Card4.compare(p2Card4) == 1) //if player1 wins
      {
         System.out.println("Player 1 Wins!");
         player1.addCard(p1Card1);
         player1.addCard(p1Card2);
         player1.addCard(p1Card3);
         player1.addCard(p1Card4);
         player1.addCard(p2Card1);
         player1.addCard(p2Card2);
         player1.addCard(p2Card3);
         player1.addCard(p2Card4);
      }
      
      else if (p1Card4.compare(p2Card4) == -1) //if player2 wins
      {
         System.out.println("Player 2 Wins!");
         player2.addCard(p1Card1);
         player2.addCard(p1Card2);
         player2.addCard(p1Card3);
         player2.addCard(p1Card4);
         player2.addCard(p2Card1);
         player2.addCard(p2Card2);
         player2.addCard(p2Card3);
         player2.addCard(p2Card4);
      }
      else //if a war is declared
      {
         if (player1.numCards() >= 4 && player2.numCards() >= 4)
            war(player1 , player2);
         else if (player1.numCards() == 3 || player2.numCards() == 3)
            war2(player1 , player2);
         else if (player1.numCards() == 2 || player2.numCards() == 2)
            war3(player1 , player2);
         else
            war4(player1 , player2); 
      }
   
   }

//pre: if two hands are one user has 3 cards
//post: plays war when two cards are equal
   public static void war2(Hand player1, Hand player2)
   {
      System.out.println("WAR!!!");
   
   //Playing 2 Cards Facedown
      Card p1Card1 = player1.playCard();
      Card p1Card2 = player1.playCard();
      Card p1Card4 = player1.playCard();
   
      Card p2Card1 = player2.playCard();
      Card p2Card2 = player2.playCard();
      Card p2Card4 = player2.playCard();
   
      if (p1Card4.compare(p2Card4) == 1) //if player1 wins
      {
         System.out.println("Player 1 Wins!");
         player1.addCard(p1Card1);
         player1.addCard(p1Card2);
         player1.addCard(p1Card4);
         player1.addCard(p2Card1);
         player1.addCard(p2Card2);
         player1.addCard(p2Card4);
      }
      
      else if (p1Card4.compare(p2Card4) == -1) //if player2 wins
      {
         System.out.println("Player 2 Wins!");
         player2.addCard(p1Card1);
         player2.addCard(p1Card2);
         player2.addCard(p1Card4);
         player2.addCard(p2Card1);
         player2.addCard(p2Card2);
         player2.addCard(p2Card4);
      }
      else //if a war is declared
      {
         if (player1.numCards() >= 4 && player2.numCards() >= 4)
            war(player1 , player2);
         else if (player1.numCards() == 3 || player2.numCards() == 3)
            war2(player1 , player2);
         else if (player1.numCards() == 2 || player2.numCards() == 2)
            war3(player1 , player2);
         else
            war4(player1 , player2); 
      }
   
   }

//pre: if two hands are one user has 2 cards
//post: plays war when two cards are equal
   public static void war3(Hand player1, Hand player2)
   {
      System.out.println("WAR!!!");
   
   //Playing 1 Cards Facedown
      Card p1Card1 = player1.playCard();
      Card p1Card4 = player1.playCard();
   
      Card p2Card1 = player2.playCard();
      Card p2Card4 = player2.playCard();
   
      if (p1Card4.compare(p2Card4) == 1) //if player1 wins
      {
         System.out.println("Player 1 Wins!");
         player1.addCard(p1Card1);
         player1.addCard(p1Card4);
         player1.addCard(p2Card1);
         player1.addCard(p2Card4);
      }
      
      else if (p1Card4.compare(p2Card4) == -1) //if player2 wins
      {
         System.out.println("Player 2 Wins!");
         player2.addCard(p1Card1);
         player2.addCard(p1Card4);
         player2.addCard(p2Card1);
         player2.addCard(p2Card4);
      }
      else //if a war is declared
      {
         if (player1.numCards() >= 4 && player2.numCards() >= 4)
            war(player1 , player2);
         else if (player1.numCards() == 3 || player2.numCards() == 3)
            war2(player1 , player2);
         else if (player1.numCards() == 2 || player2.numCards() == 2)
            war3(player1 , player2);
         else
            war4(player1 , player2); 
      }
   
   }

//pre: if two hands are one user has 1 card
//post: plays war when two cards are equal
   public static void war4(Hand player1, Hand player2)
   {
      System.out.println("WAR!!!");
   
   //Playing 1 Card Faceup
      Card p1Card4 = player1.playCard();
      Card p2Card4 = player2.playCard();
   
      if (p1Card4.compare(p2Card4) == 1) //if player1 wins
      {
         System.out.println("Player 1 Wins!");
         player1.addCard(p1Card4);
         player1.addCard(p2Card4);
      }
      
      else if (p1Card4.compare(p2Card4) == -1) //if player2 wins
      {
         System.out.println("Player 2 Wins!");
         player2.addCard(p1Card4);
         player2.addCard(p2Card4);
      }
      else //if a war is declared
      {
         System.out.println("Game is tied. We all win!"); 
      }
   
   }
}
