/*
Programmer: Jack Bergin
Class: Int. to Comp Sci
Date: 3/28/16
Program: This if for the test that 
I am currently taking or took
*/

import java.util.Scanner;

public class Test2Program
{
   public static void main(String[] args) 
   {
      Scanner input = new Scanner (System.in);
   
      System.out.println("Please enter a number 1-50:");
      int rps = input.nextInt();
   
      if (rps <= 50)
      {
         int total = rps + 1;
         int tota = rps + 2;
         int tot = rps + 3;
         int to = rps + 4;
         int t = rps + 5;
      
      
         System.out.println("Your Number: " + rps);
         System.out.print("Here are the next 5 numbers after " +rps+ ": "); 
         System.out.print(total + ", "); 
         System.out.print(tota + ", "); 
         System.out.print(tot + ", "); 
         System.out.print(to + ", "); 
         System.out.print(t); 
      }
      else
         System.out.println("That was not between 1 and 50! Bye...");
   
   }
}
