/*
Programmer: Jack Bergin
Date: 2/24/16
Description: Part two of the exam!
*/

import java.util.Scanner;

public class OddOrEven
{
   public static void main (String[] args)
   {
   
      Scanner input = new Scanner (System.in);
   
      System.out.println ("Hello, may you please enter a number");
      int yourNumber = input.nextInt();
   
      int newNumber = raNumber%2;
   
      if(newNumber == 0 )
      {
         System.out.println(yourNumber+ " is an even number.");
      }
      else
      {
         System.out.println(yourNumber+ " is an odd number.");
      }
   
   }
}
