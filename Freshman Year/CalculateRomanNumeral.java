/*
File: Practice four loop
Programmer:Jack Bergin
Class: Comp sci
Date: 1/25/16

Description: Programm is for creating 
practicing an if else statement by 
converting regular numbers to roman
numerals
*/
import java.util.Scanner; // Must import this library for the scanner

public class CalculateRomanNumeral
{
   public static void main (String[] args)
   {
   Scanner input = new Scanner (System.in);
   
   System.out.println ("Hello, please enter your name");
   String yourName = input.nextLine();
   
   System.out.println ("What number would you like to convert to Roman numerals?");
   int yourNumber = input.nextInt();

   if(yourNumber<2 && yourNumber>=1)
   {
   System.out.println(yourName+ ", your number, " +yourNumber+ " is I in Roman Numerals!");
   }
   if (yourNumber<3 && yourNumber>= 2)
   {
   System.out.println(yourName+ ", your number, " +yourNumber+ " is II in Roman Numerals!");
   }
   if (yourNumber<4 && yourNumber>= 3)
   {
   System.out.println(yourName+ ", your number, " +yourNumber+ " is III in Roman Numerals!");
   }
   if (yourNumber<5 && yourNumber>= 4)
   {
   System.out.println(yourName+ ", your number, " +yourNumber+ " is IV in Roman Numerals!");
   }
   if (yourNumber<6 && yourNumber>= 5)
   {
   System.out.println(yourName+ ", your number, " +yourNumber+ " is V in Roman Numerals!");
   }
   if (yourNumber<7 && yourNumber>= 6)
   {
   System.out.println(yourName+ ", your number, " +yourNumber+ " is VI in Roman Numerals!");
   }
   if (yourNumber<8 && yourNumber>= 7)
   {
   System.out.println(yourName+ ", your number, " +yourNumber+ " is VII in Roman Numerals!");
   }
   if (yourNumber<9 && yourNumber>= 8)
   {
   System.out.println(yourName+ ", your number, " +yourNumber+ " is VIII in Roman Numerals!");
   }
   if (yourNumber<10 && yourNumber>= 9)
   {
   System.out.println(yourName+ ", your number, " +yourNumber+ " is IX in Roman Numerals!");
   }
   if (yourNumber<11 && yourNumber>= 10)
   {
   System.out.println(yourName+ ", your number, " +yourNumber+ " is X in Roman Numerals!");
   }

   }
}
