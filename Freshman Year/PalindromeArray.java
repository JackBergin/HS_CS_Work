/*
Project Name: PalindromeLab
Programmer: Jack Bergin
Class: Computer Science
Date: 10/16/16
Description: Simple Palindrome Program
*/
import java.util.Scanner;

public class PalindromeArray
{ 
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Welcome to Palindrome Converter");
      System.out.print("Enter in what you want Palindromeinated ==> ");
      String palin = input.nextLine();
      System.out.println("The origional was: " + palin);
   
      palin = palin.toLowerCase();
      
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
      
      String reversePalin = new String (charArray);
      String reverseNewPalin = "";
      reverseNewPalin = reversePalin.replaceAll("[^A-Za-z0-9]", "");
      
      System.out.println("The reversed word is: " + reverseNewPalin);
   
      if (reversePalin.equals(palin))
      {
         System.out.println("This is a palindrome!");
      }
      else      
      {
         System.out.println("This is not a palindrome!");
      }
   }
}