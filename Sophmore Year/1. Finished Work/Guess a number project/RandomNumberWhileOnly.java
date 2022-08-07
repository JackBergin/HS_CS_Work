import java.util.Scanner;

public class GuessANumber
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
   
      boolean replay = true; //"primes" the while loop (guarantees to enter it)
   
      while (replay == true)
      {
         int randomNumber = (int)(Math.random()* 100 + 1); //generates random number between 1 and 100
      
      
         System.out.println("The computer has chosen a random number between 1 and 100.\n");
         System.out.print("Make your guess at this number ==>  ");
         
         int myGuess = console.nextInt();
         int count = 1;
         
         while (myGuess != randomNumber)
         {
            if (myGuess < randomNumber)
            {
               int randomHint = (int)(Math.random()* 6 + 1); //generates random number between 1 and 6 for the 6 hints
               Switch(randomHint, randomNumber, myGuess);
               System.out.println("Your guess is too low.");
               System.out.println("Guess Again.");
               myGuess = console.nextInt();
               count++;
               if(count >= 12)
               {
                  myGuess = randomNumber;
                  System.out.println();
                  System.out.println("You are terrible at this game!");
               }
            }
            else
            {
               int randomHint = (int)(Math.random()* 6 + 1); //generates random number between 1 and 6 for the 6 hints
               Switch(randomHint, randomNumber, myGuess);
               System.out.println("Your guess is too high.");
               System.out.println("Guess Again.");
               myGuess = console.nextInt();
               count++;
               if(count >= 12)
               {
                  myGuess = randomNumber;
                  System.out.println();
                  System.out.println("You are terrible at this game!");
               }
            }
         }//end while loop
         if(count >= 5)
         {
            System.out.println();
            System.out.println("Getting good");
         }
      
         String dummy = console.nextLine(); //gobbles up extra carriage return
         
         System.out.println("You guessed the number in " +count+" guesses!\n");
         
         boolean getItRight = true;
      
         while (getItRight == true)
         {
            System.out.println("Would you like to play again? Yes or No.");
            String response = console.nextLine();
                  
            if (response.equals("Yes")||response.equals("Yah")||response.equals("yes")||response.equals("y")||response.equals("Y"))
            {
               getItRight = false;
            }
         
            if (response.equals("No")||response.equals("nah")||response.equals("no")||response.equals("n")||response.equals("N"))
            {
               System.out.println("Thanks for playing. Good-bye.");
               getItRight = false;
               replay = false;
            }
         }
      }//end replay while loop
   }//end main method
   //hints for the number guesser 
   //a is the random hint number. b is the random number. c is your guess
   public static void Switch(int a, int b, int c)   
   {
      switch(a)
      {
         case 1:
            int evorodd = b%2; 
         
            if(evorodd == 0 )
            {
               System.out.println("It is an even number.");
            }
            else
            {
               System.out.println("It is an odd number.");
            }
            break;
      
         case 2:
            System.out.println("Sorry, no extra hint this time.");
            break;
      
         case 3:
            int difference = b-c;
         
            if (difference < 0)
            {
               int diff = difference*-1;
               System.out.println("You where "+ diff +" away from the number.");
            }
            else 
               System.out.println("You where "+ difference +" away from the number.");
            break;
      
         case 4:
            if(a-c <= 10)
            {
               System.out.println("You are within 10 numbers.");
            }
            else
               System.out.println("Keep guessing, you're not within ten.");
            break;
      
         case 5:
            if(b%2 == 0)
            {
               System.out.println("The number is divisible by 2."); 
            }
            else
               System.out.println("The number is not divisible by 2.");
            break;
      
         case 6:
            if(b%3 == 0)
            {
               System.out.println("The number is divisible by 3."); 
            }
            else
               System.out.println("The number is not divisible by 3.");   
            break;
      }
   }
}//end class



