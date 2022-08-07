import java.util.*;

public class DeckClass
{
   //FIELDS:
   Card[] arrayOfDeck;
   
   private String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
   private String[] ranks = {"Two", "Three", "Four", "Five", "Six", 
                             "Seven", "Eight", "Nine", "Ten", "Jack", 
                             "Queen", "King", "Ace"};
   private int [] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11}; 
   private int [] order = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13}; 
   
   int size = 52;

   //***************************************************************
   //CONSTRUCTORS:
   public DeckClass()
   {
      arrayOfDeck = constructDeckOfCards();
      shuffle(); //method call to shuffle 
   }
   
   //***************************************************************
   //INSTANCE METHODS:
   public Card[] constructDeckOfCards ()
   {
      Card[] tempArray = new Card[52];
      int count = 0;
      //Nested for loops to assign all of the fifty two values
      for (int suitIndex = 0; suitIndex < 4; suitIndex++)
      {
         for (int rankIndex = 0; rankIndex < 13; rankIndex++)
         {
            tempArray[count] = new Card(suits[suitIndex], ranks[rankIndex], values[rankIndex], order[rankIndex]);
            count++;
         } 
      }
      return tempArray;
   }
   
   //METHOD: Shuffles Deck
   public void shuffle()
   {
      for (int i = 0; i < 1000; i++)//runs as many times as needed
      {
         int random1 = (int) (Math.random()*52);
         int random2 = (int) (Math.random()*52);
         
         Card tempCard = arrayOfDeck[random1];
         arrayOfDeck[random1] = arrayOfDeck[random2];
         arrayOfDeck[random2] = tempCard;
      }
   }
   
   //METHOD: toString
   public String toString()
   {
      String temp = "";
      for (int k = 0; k < 52; k++)
      {
         temp = temp + arrayOfDeck[k] + "\n";
      }
      return temp;
   }
}