/*
Source File Name:ChangeCalc
Programmer:Jack Bergin
Class:Ap Computer Science
Date:12/2/16
Description:This program will print 
out the change one receives after 
paying for a product.
*/

import java.util.Scanner;
public class ChangeCalc 
{
   public static void main(String[] args) 
   {
      Scanner keyboard = new Scanner(System.in);
      int price;
      int payed;
      int change;
      System.out.print("Enter the cost of the product:");
      price = (int) Math.round(keyboard.nextDouble() * 100);
      
      System.out.print("Enter the amount given:");
      payed = (int) Math.round(keyboard.nextDouble() * 100);
      System.out.println();
      
      if (payed > price) 
      {
         System.out.println("The change is: $" + ((payed - price)/100.00));
         System.out.println("The customer should be given the following change:");
         change = payed - price;
         
         int oneHundreds = change / 10000;
         // Since you multiplied by 100 you have to divide by 10000 to get the
         // number of 100s for change.
         if (oneHundreds > 1) 
         { 
            // if the change is less than $100 this will be a 0
            // this resets the value of change to
            // the remainder after the 100s are
            // calculated but only if there was at
            // least enough to make one hundred dollar bill
            change = change % 10000; 
            System.out.println(oneHundreds + " $100 dollar bills");
         }
         if(oneHundreds == 1)
         {
            change = change % 10000; 
            System.out.println(oneHundreds + " $100 dollar bill");
         }         
         //Twenties
         int twenties = change / 2000;
         if (twenties > 1) 
         { 
            change = change % 2000; 
            System.out.println(twenties + " $20 dollar bills");
         }
         if (twenties == 1)
         {
            change = change % 2000; 
            System.out.println(twenties + " $20 dollar bill");
         }
         
         //Tens
         int tens = change / 1000;
         if (tens > 1) 
         {
            change = change % 1000;
            System.out.println(tens + " $10 dollar bills");
         }   
         if (tens == 1) 
         {
            change = change % 1000;
            System.out.println(tens + " $10 dollar bill");
         }
         
         //Fives
         int fives = change / 500;
         if (fives > 1) 
         {
            change = change % 500;
            System.out.println(fives + " $5 dollar bills");
         }
         if (fives == 1) 
         {
            change = change % 500;
            System.out.println(fives + " $5 dollar bill");
         }
         
         //Ones
         int ones = change / 100;
         if (ones > 1) 
         {
            change = change % 100;
            System.out.println(ones + " $1 dollar bills");
         }
         if (ones == 1) 
         {
            change = change % 100;
            System.out.println(ones + " $1 dollar bill");
         }
         
         //Quarters
         int quarters = change / 25;
         if (quarters > 1) 
         {
            change = change % 25;
            System.out.println(quarters + " quarters");
         }
         if (quarters == 1) 
         {
            change = change % 25;
            System.out.println(quarters + " quarter");
         }
         
         //Dimes
         int dimes = change / 10;
         if (dimes > 1) 
         {
            change = change % 10;
            System.out.println(dimes + " dimes");
         }
         if (dimes == 1) 
         {
            change = change % 10;
            System.out.println(dimes + " dime");
         }
         
         //Nickles
         int nickels = change / 5;
         if (nickels > 1) 
         {
            change = change % 5;
            System.out.println(nickels + " nickels");
         }
         if (nickels == 1) 
         {
            change = change % 5;
            System.out.println(nickels + " nickel");
         }
         
         //Pennies
         int pennies = change/1;
         if (pennies > 1) 
         {
            change = change % 1;
            System.out.println(pennies + " pennies");
         }
         if (pennies == 1)
         {
            change = change % 1;
            System.out.println(pennies + " penny");
         }  
      }
      // this statement is saying that if the customer
      // doesn't pay enough, it will tell the user
      if (payed < price) 
      { 
         System.out.print("Not enough money!");
      } 
      // this statement is saying that if the customer
      // doesn't get any change
      if (payed == price) 
      { 
         System.out.print("You get back no change.");
      }
   }
}