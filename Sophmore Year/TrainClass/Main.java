/*
Programmer: Jack Bergin
Program: Encryption
Program Objective: Make any sentence/string 
of text encrypted by numbers and letters.
*/

import java.util.Scanner;

public class CeaserCipher
{
   public static void main(String[] args) 
   {
      Scanner input = new Scanner(System.in);
      System.out.println("What do you want to cipher?");
      String entered = input.nextLine();
      String plainText = entered;
      String cipherText = "";
      int key = +2;
      
      
      char[] alphabetArray = {'A','B','C','D','E','F','G','H','I','J','K','L','M',
                              'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
      
      //A B C D E F G H I J K  L  M  N  O  P  Q  R  S  T  U  V  W  X  Y  Z
      //0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
      
      plainText = plainText.toUpperCase();
      System.out.println(plainText);
      
      int plainTextLength = plainText.length();
      
      for(int index=0; index<plainTextLength; index++)
      {
         char plainChar = plainText.charAt(index); //selects character at the end of each index
         if(plainChar<65||plainChar >90)
         {
            cipherText = cipherText + String.valueOf(plainChar); //creates new string of text
         }
         
         else
         {
             int plainCharNumber = (int)plainChar - 65; //changes character into ASCII integer
             int cipherCharNumber = (plainCharNumber + key)%26;//adds key to character
             char cipherChar = alphabetArray [cipherCharNumber];
             cipherText = cipherText + String.valueOf(cipherChar);
         }
         
       }
      System.out.println(cipherText);
      
   
   }
}

   

