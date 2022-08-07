/*
Source File Name: Project1
Programmer:Jack Bergin
Class:Ap Computer Science
Date:12/16/16
Description:This program will print 
out the roman numeral of a number
*/
import java.util.Scanner;

public class Project1
{
   public static void main (String [] args)
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter the number you want converted to Roman numerals: ");
      int numb = keyboard.nextInt();
      String roman = IntegerToRomanNumeral(numb);
      System.out.println(roman);  
   }
   
   public static String IntegerToRomanNumeral(int input) 
   {
      String s = "";    
      //50
      while (input >= 50) 
      {
         s += "L";
         input -= 50;
      }
      //40
      while (input >= 40) 
      {
         s += "XL";
         input -= 40;
      }
      //10
      while (input >= 10) 
      {
         s += "X";
         input -= 10;
      }
      //9
      while (input >= 9) 
      {
         s += "IX";
         input -= 9;
      }
      //5
      while (input >= 5) 
      {
         s += "V";
         input -= 5;
      }
      //4
      while (input >= 4)
      {
         s += "IV";
         input -= 4;
      }
      //1
      while (input >= 1) 
      {
         s += "I";
         input -= 1;
      } 
      //Returns the value   
      return s;
   }
}