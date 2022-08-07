/*
Programmer: Jack Bergin
Date:12/16/16
Block:E
Class: Computer Science
This program is to guess the number of 
the computer that is generated.
*/

import java.util.Scanner;

public class RandomNumberGuesser
{                  
   public static void main (String[] args) 
   { 
      Scanner input = new Scanner(System.in);
      String response;
      String dummy;   
      int ones = 0;
      int twos= 0;
      int all = 0;
    
      do
      { 
         int pick = (int)(Math.random()*100+1);
         
        
         if(pick%2 == 0 )
         {
            System.out.println("Guess my number. It's between 1 and 100! It is an even number.");
         }
         else
         {
            System.out.println("Guess my number. It's between 1 and 100! It is an odd number.");
         }
      
         int guess = input.nextInt();      
      
         while (guess != pick)
         {
            if(guess < pick) 
            {
               System.out.println("Your number is too low... guess again!");
               guess = input.nextInt();
               ones = ones + 1;
            }
            if (guess > pick)    
            {
               System.out.println("Your number is too high... guess again!"); 
               guess = input.nextInt();
               twos = twos + 1;
            }
         }
         all = ones + twos + 1;
         if (guess == pick)
         {
            System.out.println("Nice Job! You guessed my number after " +all+ " guesses."); 
         }
      
         System.out.println("Would you like to play again? Yes or No?");
         response = input.nextLine();
         dummy = input.nextLine();
      }
         while(dummy.equals("Yes")|| dummy.equals("yes"));
   }
}      
