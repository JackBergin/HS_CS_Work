/*
Source File Name:CardSuit
Programmer:Jack Bergin
Class:Ap Computer Science
Date:12/2/16
Description:This program will print 
out the card and suit when entered.
*/

import java.util.Scanner;
public class CardSuit
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the rank and suit of a card of your choice ");
      System.out.println("(ex. Q D = Queen of Diamonds):");
      String cardChoice = input.nextLine();
     
      //Put everything to uppercase to 
      cardChoice=cardChoice.toUpperCase();
      
      //Finds the first value/card type
      String card = cardChoice.substring(0,1);
      
      //Finds the card suit and can get it from either 3,4 or 2,3
      String suit = cardChoice.substring(cardChoice.length()-1, cardChoice.length());
      
      //This is for the type of card
      if (card.equals("A"))
      {
         card = "Ace";
      }
      if (card.equals("K"))
      {
         card = "King";
      }
      if (card.equals("J"))
      {
         card = "Jack";
      }
      if (card.equals("Q"))
      {
         card = "Queen";
      }
      if (card.equals("1"))
      {
         card = "Ten";
      }
      if (card.equals("9"))
      {
         card = "Nine";
      }
      if (card.equals("8"))
      {
         card = "Eight";
      }
      if (card.equals("7"))
      {
         card = "Seven";
      }
      if (card.equals("6"))
      {
         card = "Six";
      }
      if (card.equals("5"))
      {
         card = "Five";
      }
      if (card.equals("4"))
      {
         card = "Four";
      }
      if (card.equals("3"))
      {
         card = "Three";
      }
      if (card.equals("2"))
      {
         card = "Two";
      }
       
      //This is for the type of suit
      if(suit.equals("S"))
      {
         suit = "Spades";
      }
      if(suit.equals("H"))
      {
         suit = "Hearts";
      }
      if(suit.equals("C"))
      {
         suit = "Clubs";
      }
      if(suit.equals("D"))
      {
         suit = "Diamonds";
      } 
      //Prints out the card suit and card type
      //ex. Q D = Queen of Diamonds
      System.out.println(card +" of " + suit);
   }
}

