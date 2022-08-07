/*
Project Name: PalindromeLab
Programmer: Jack Bergin
Class: Computer Science
Date: 11/16/16
Description: Class version of the Palindrome Program
*/
import java.util.*;
 
class AnimationJack
{
   public static void main(String args[])
   {
      String original, reverse = "";
      Scanner in = new Scanner(System.in);
      
      System.out.println("Welcome to Palindrome Converter");
      System.out.print("Enter in what you want Palindromeinated ==> ");
      original = in.nextLine();
      
      original = original.toLowerCase();
      
      System.out.println("Origional text: " + original);
      
      String textPurge = "";
      
      for (int i = 0; i < original.length(); i++)
      {
         String eachLetter = original.substring(i, i+1);
         
         boolean greaterThanA = eachLetter.compareTo("a") >=0;
         boolean lessThanZ = eachLetter.compareTo("z") <=0;
         
         if (greaterThanA && lessThanZ)
         {
            textPurge = textPurge + eachLetter;  
         }      
        
      }   
      int length = textPurge.length();
   
      for ( int i = length - 1; i >= 0; i-- )
         reverse = reverse + textPurge.charAt(i);
      
      System.out.println("Reverese word: " + reverse);
   
      if (textPurge.equals(reverse))
         System.out.println("This word is a palindrome.");
      else
         System.out.println("This word is not a palindrome.");   
   }
}