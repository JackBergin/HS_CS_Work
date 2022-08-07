import java.util.Scanner;

public class RockPaperJack
{
   //ATTRIBUTES
   static int yourWins = 0;
   static int compWins = 0;
   static int gameCount = 0;
   static int draws = 0;
   static int numbToWin = 0;
   static boolean matchOver = false;
   
   
   public static void main(String[] args) 
   {
      String response;
      String rps;
      Scanner input = new Scanner(System.in);
      System.out.println("Welcome to Rock Paper Scissors!\n");
      System.out.println("How many games do you want to play to?");
      numbToWin = input.nextInt();
      String dank = input.nextLine();
      
      do
      {
      
         int compGuess = (int)(Math.random()*3+1); 
         do
         {
            System.out.println("Rock, Paper, Scissors (r, p or s)");
            rps = input.nextLine();
         }
         while(!(rps.equals("r")||rps.equals("p")||rps.equals("s")));
         
         
         
         int guessNumb = 0; 
      
         if (rps.equals("r"))
         {
            guessNumb = 1;
         }
         if (rps.equals("p"))
         {
            guessNumb = 2;
         }
         if (rps.equals("s"))
         {
            guessNumb = 3;
         }
         
         //Add "rock, paper, scissors, shoot"
         System.out.println("Ready...");
         delay(1000);
         System.out.println("Rock...");
         delay(1000);
         System.out.println("Paper...");
         delay(1000);
         System.out.println("Scissors...");
         delay(1000);
         System.out.println("Shoot!!!");
         System.out.println();
      
         if(compGuess==guessNumb)
         {
            System.out.println("Draw!");
            tallyScore(0,0,1);
         }
      
         while(compGuess != guessNumb)
         {
         
            if (compGuess == 2 && guessNumb == 1)
            {
               System.out.println("You chose rock");
               System.out.println("I chose paper");
               System.out.println();
               System.out.println("You loose, paper beats rock!");
               tallyScore(0,1,0);
            }
            if (compGuess == 3 && guessNumb == 1)
            {
               System.out.println("You chose rock");
               System.out.println("I chose scissors");
               System.out.println();
               System.out.println("You win, rock beats scissors!");
               tallyScore(1,0,0);
            }
         
            if (compGuess == 1 && guessNumb == 2)
            {
               System.out.println("You chose paper!");
               System.out.println("I chose rock");
               System.out.println();
               System.out.println("You win, paper beats rock!");
               tallyScore(1,0,0);
            }
            if (compGuess == 3 && guessNumb == 2)
            {
               System.out.println("You chose paper");
               System.out.println("I chose scissors");
               System.out.println();
               System.out.println("You loose, scissors beats paper!");
               tallyScore(0,1,0);
            }
         
            if (compGuess == 1 && guessNumb == 3)
            {
               System.out.println("You chose scissors");
               System.out.println("I chose rock");
               System.out.println();
               System.out.println("You loose, rock beats scissors!");
               tallyScore(0,1,0);
            }
            if (compGuess == 2 && guessNumb == 3)
            {
               System.out.println("You chose scissors");
               System.out.println("I chose paper");
               System.out.println();
               System.out.println("You win, scissors beats paper!");
               tallyScore(1,0,0);
            }
         
            break;
         }
      }
       while(matchOver==false);
       
       System.out.println("Thanks for playing.\n");

         
   }
   
   public static void delay(int n)
   {
      long startDelay = System.currentTimeMillis();
      long endDelay = 0;
      while(endDelay- startDelay < n)
         endDelay = System.currentTimeMillis();
   }
   
   public static void tallyScore(int you, int comp, int d)
   {
      yourWins = yourWins + you;
      compWins = compWins + comp;
      draws = draws + d;
      gameCount = gameCount + 1;
      
      System.out.println();
      System.out.println("Your score     : " + yourWins);
      System.out.println("Computer score : " + compWins);
      System.out.println("Draws          : " + draws);
      System.out.println("-------------------------------");
      System.out.println("Game count     : " + gameCount);
      System.out.println();
      
      if(yourWins == numbToWin)
      {
      System.out.println("Congratulations, you won the match!\n");
      matchOver=true;
      }
      if(compWins == numbToWin)
      {
      System.out.println("Sorry, you lost the match!\n");
      matchOver=true; 
      }        
   }

    
}