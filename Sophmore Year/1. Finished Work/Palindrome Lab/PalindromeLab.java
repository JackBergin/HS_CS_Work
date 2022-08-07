/*
Project Name: PalindromeLab
Programmer: Jack Bergin
Class: Computer Science
Date: 11/18/16
Description: Used to determine if a string is a palindrome or not
*/

import java.util.*;
 
public class PalindromeLab
{
   public static void main(String args[])
   {
      String origin = "";
      String reverse = "";
      Scanner in = new Scanner(System.in);
      
      System.out.println("Welcome to the Word Reverser");
      System.out.print("Enter in what you want reversed ==> ");
      
      //origional word entered
      origin = in.nextLine();
      //the Uppercase characters will be removed
      origin = origin.toLowerCase();

      System.out.println("The origional was: " + origin);
      
      //This preps the word for the text purge or else 
            
      String textPurge = "";
      //This little blerb takes out all of the marks other 
      //than lowercase characters in the word/string being reversed
      for (int i = 0; i < origin.length(); i++)
      {
         String eachLetter = origin.substring(i, i+1);
         
         boolean greaterThanA = eachLetter.compareTo("a") >=0;
         boolean lessThanZ = eachLetter.compareTo("z") <=0;
          
         if (greaterThanA && lessThanZ)
         {
            textPurge = textPurge + eachLetter;  
         }      
      }
      
      //This step begins the process of the word being reversed
      int length = textPurge.length();
   
      for ( int i = length - 1; i >= 0; i-- )
      {
         reverse = reverse + textPurge.charAt(i);
      }
      
      System.out.println("The reverse is: " + reverse);
   
      if (textPurge.equals(reverse))
      {
         System.out.println("This is a palindrome!");
      }
      else
      {
         System.out.println("This is not a palindrome!");   
      }
   }
}
























