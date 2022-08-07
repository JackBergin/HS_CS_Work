 /*
Project Name: PalindromeLab
Programmer: Jack Bergin
Class: Computer Science
Date: 11/26/19
Description: Used to determine if a string is a palindrome or not
*/
  
import java.util.Scanner;
  
public class PalindromeChecker_GettingStarted_Lesson
{
   public static void main (String[] args)
   {
        //Step 1--prompt the user for a palindrome to print out
        String enteredText = enteredText();

        //Step 2--Turn Palindrome into all lowercase letters
        String lowerCaseText = changeToLowercase(enteredText);

        //Step 3--clean up or purge text (no spaces/punctuation included)
        String purgedText = purgedText(lowerCaseText);

        //step 4--reverse
        String reversedText = reversedText(purgedText);

        //step 5--number of characters
        int numberOfCharacters = numberOfChar(reversedText);

        //step 6--middle character
       
        //step 7--list of vowels
        String listOfVowels = vowelList(lowerCaseText);
       
        //step 8--is it a palindrome
        boolean trueOrFalse = trueOrFalse(enteredText, reversedText);
        
      System.out.println("==================================================");
      System.out.println("Original Text          : " + enteredText);
      System.out.println("Text to all lowercase  : " + lowerCaseText);
      System.out.println("Text purged            : " + purgedText);
      System.out.println("Text reversed          : " + reversedText);
      System.out.println("Number of characters   : " + numberOfCharacters);
      System.out.println("Middle character(s)    : " + "NOT FINISHED YET!!!!!!");
      System.out.println("List of vowels         : " + listOfVowels);
      System.out.println("Is a palindrome        : " + trueOrFalse);

   } 
     
   //Scanner is used for the user to enter a possible palindrome
   public static String enteredText() //Took out scanner c
   {
      Scanner palindrome = new Scanner(System.in);
      System.out.print("Enter your palindrome:");
      String enteredText = palindrome.nextLine();
      return enteredText;
   }
        
   //Changes scanner text to lower case  
   public static String changeToLowercase(String enteredText)
   {
      String textLowerCased = enteredText.toLowerCase();
      return textLowerCased;
   }
         
   //Purges Text
   public static String purgedText(String textLowerCased)
   { 
      String noWhiteSpaced = textLowerCased.replaceAll("\\s+",""); //remove white space
      String purgedText = noWhiteSpaced.replaceAll("[^a-zA-Z ]", "");//removes punctuation
      return purgedText;        
   }
       
   //reverses text
   public static String reversedText(String purgedText)
   {
      String reversedText = "";
      for (int i = purgedText.length() - 1; i >= 0; i--)
      {
         reversedText += purgedText.charAt(i);
      }
      return reversedText;
   }
       
   //Gives the number of characters
   public static int numberOfChar (String reversedText)
   {
      int numberOfChar = reversedText.length();
      return numberOfChar;
   }
        
        
   //FIX THIS AND YOU ARE DONE!!!!!!
   /*
   //Gives the middle character
   public static String middle(String text)
   {
      int midPoint = text.length()/2;
     
      if ((midPoint % 2) != 0)
      { 
         // odd
         return text.substring(midPoint, midPoint + 1);
      }
         // even
         return text.substring(midPoint-1, midPoint+1);
   } 
   */ 
        
   //Gives list of Vowels
   public static String vowelList (String reversedText)
   {
      String listOfVowels = reversedText.replaceAll("[^aeiouAEIOU ]", "");
      return listOfVowels;
   } 
    
   //Determines if the word is a palindrome or not
   public static boolean trueOrFalse (String enteredText, String reversedText)
   {
      boolean trueOrFalse = true;
           
      if (enteredText.equals(reversedText))
      {
         return trueOrFalse = true;
      }
      else
      {
         return trueOrFalse = false;
      }
   }
}

 

