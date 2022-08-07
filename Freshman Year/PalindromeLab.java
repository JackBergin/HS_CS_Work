/*
Programmer - Jack Bergin
Simple Palindrome Programm
*/
import java.util.Scanner;

public class PalindromeLab
{ 
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Welcome to Palindrome Converter");
      System.out.print("Enter in what you want Palindromeinated ==> ");
      String palin = input.nextLine();
      
      int length = palin.length();
      
      char[] tempCharArray = new char[length];
      char[] charArray = new char[length];
      
      for(int i=0; i<length; i++)
      {
      tempCharArray[i] = palin.charAt(i);
      } 
      
      for(int k=0; k<length; k++)
      {
      charArray[k] = tempCharArray[length - 1 - k];
      }
      
      String reversepalin = new String (charArray);

      System.out.println("The origional was: " + palin);
      String reverseNewPalin = "";
      reverseNewPalin = reversepalin.replaceAll("[^A-Za-z0-9]", "");
      System.out.println("The reversed word is: " + reverseNewPalin);
   }
}