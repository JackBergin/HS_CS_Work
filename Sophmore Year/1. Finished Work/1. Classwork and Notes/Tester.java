
import java.util.Scanner;

public class Tester
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
   
      boolean replay = true; //"primes" the while loop (guarantees to enter it)
      
      while (replay == true)
      {
         int randomNumber = (int)(Math.random()* 100 + 1); //generates random number between 1 and 100
      
         System.out.println("Guess my number. It is between 1 and 100.\n");
         System.out.println("Make your guess ==> ");
         
         int myGuess = console.nextInt();
         
         while (myGuess != randomNumber)
         {
            if (myGuess < randomNumber)
            {
               System.out.println("Your guess is too low. Guess again.");
               myGuess = console.nextInt();
               Hints((int)(Math.random()* 10 + 1));
            }
            else
            {
               System.out.println("Your guess is too high. Guess again.");
               myGuess = console.nextInt();
               Hints((int)(Math.random()* 10 + 1));
            }
         }//end while loop
         
         String dummy = console.nextLine(); //gobbles up extra carriage return
         
         System.out.println("Congratulations. You won!\n");
         
         System.out.println("Would you like to play again? Yes or No.");
         String response = console.nextLine();
         
         if (response.equals("No"))
         {
            System.out.println("Thanks for playing. Good-bye.");
            replay = false;
         }
         
      }//end replay while loop
      
   }//end main method
   
   public static void Hints(int p)
   {
   
   }
   
   
    
}//end class