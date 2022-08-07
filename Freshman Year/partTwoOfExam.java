/*
Programmer: Jack Bergin
Date: 2/24/16
Description: Part two of the test!
*/

import java.util.Scanner;

public class OddOrEven
{
   public static void main (String[] args)
   {
   Scanner input = new Scanner (System.in);
   
   System.out.println ("Hello, please enter a number");
   int yourNumber = input.nextInt();
   
   int newNumber = yourNumber%2;
   
   if(newNumber == 0 )
   {
        System.out.println("Your number, " +yourNumber+ " is even");
   }
   else
   {
        System.out.println("Your number," +yourNumber+ " is odd");
   }
   }
}
