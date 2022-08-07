
/*
Programmer: Jack Bergin
Program: Encryption
Program Objective: Make a quiz that works 
and asks questions about lacrosse reffing.
*/

import java.util.Scanner;

public class Trash2
{
   public static void main(String[] args) 
   {
      Scanner input = new Scanner(System.in);
            
      //create questions 
      String[] quest = new String[3];
      quest[0] = "What is the penalty when a player is two handed from behind?";
      quest[1] = "How does a player clear the zone properly";
      quest[2] = "How do you properly say down when setting up a faceoff?";

      
      //Create answer choices
      String[] answ = new String[3];
      answ[0] = "A. Cross check   B. Slash               C. Trip          D. Unessary roughness";
      answ[1] = "A. 30 seconds    B. 20 seconds          C. 60 seconds    D. 10 seconds";
      answ[2] = "A. Nothing       B. You dont say down   C. Just say go   D. Set up on my foot, down.";
      
      //create answer key
      String [] answerKey = new String[3];
      answerKey[0] = "d";
      answerKey[1] = "a";
      answerKey[2] = "d";
      
      // The guess for the question
      
      String[] guess = new String[3];
      for(int k=0; k<quest.length; k++)
      {
         System.out.println(quest[k]);
         System.out.println(answ[k]);
         
         guess[k] = input.nextLine();
      }
      
         int answer = 0;
         
         if (guess.equals("a"))
         {
            answer = 1;
         }
         if (guess.equals("b"))
         {
            answer = 2;
         }
         if (guess.equals("c"))
         {
            answer = 3;
         }
         if (guess.equals("d"))
         {
            answer = 4;
         }
         if (guess.equals("A"))
         {
            answer = 1;
         }
         if (guess.equals("B"))
         {
            answer = 2;
         }
         if (guess.equals("C"))
         {
            answer = 3;
         }
         if (guess.equals("D"))
         {
            answer = 4;
         }
      
     
     
      //for loop to grade answers
      int sum = 0;
      
      for(int i=0; i<quest.length; i++)
      {
         if(answerKey[i]==guess[i])
         {
          sum = sum + 1;
         }
      }  
      
 
      
      //print out results
      System.out.println("SUMMARY OF RESULTS");
      System.out.println("----------------------------------------------");
      System.out.println();

      for(int j=0; j<quest.length; j++)
      {
         System.out.println(quest[j]);
         System.out.println(answ[j]);
         System.out.println();
         System.out.println("Your answer:" +guess[j]+" Correct answer: " +answerKey[j]);
         System.out.println();
              
      }      
      
   }

}

/*

        guess[k] = input.nextLine();
         
         if (guess.equals("a"))
         {
            answerKey[0] = 1;
         }
         if (guess.equals("b"))
         {
            answerKey[0] = 2;
         }
         if (guess.equals("c"))
         {
            answerKey[0] = 3;
         }
         if (guess.equals("d"))
         {
            answerKey[0] = 4;
         }
         if (guess.equals("A"))
         {
            answerKey[0] = 1;
         }
         if (guess.equals("B"))
         {
            answerKey[0] = 2;
         }
         if (guess.equals("C"))
         {
            answerKey[0] = 3;
         }
         if (guess.equals("D"))
         {
            answerKey[0] = 4;
         }
         
         if (guess.equals("a"))
         {
            answerKey[1] = 1;
         }
         if (guess.equals("b"))
         {
            answerKey[1] = 2;
         }
         if (guess.equals("c"))
         {
            answerKey[1] = 3;
         }
         if (guess.equals("d"))
         {
            answerKey[1] = 4;
         }
         if (guess.equals("A"))
         {
            answerKey[1] = 1;
         }
         if (guess.equals("B"))
         {
            answerKey[1] = 2;
         }
         if (guess.equals("C"))
         {
            answerKey[1] = 3;
         }
         if (guess.equals("D"))
         {
            answerKey[1] = 4;
         }
         
         if (guess.equals("a"))
         {
            answerKey[2] = 1;
         }
         if (guess.equals("b"))
         {
            answerKey[2] = 2;
         }
         if (guess.equals("c"))
         {
            answerKey[2] = 3;
         }
         if (guess.equals("d"))
         {
            answerKey[2] = 4;
         }
         if (guess.equals("A"))
         {
            answerKey[2] = 1;
         }
         if (guess.equals("B"))
         {
            answerKey[2] = 2;
         }
         if (guess.equals("C"))
         {
            answerKey[2] = 3;
         }
         if (guess.equals("D"))
         {
            answerKey[2] = 4;
         }
         
         if (guess.equals("a"))
         {
            answerKey[3] = 1;
         }
         if (guess.equals("b"))
         {
            answerKey[3] = 2;
         }
         if (guess.equals("c"))
         {
            answerKey[3] = 3;
         }
         if (guess.equals("d"))
         {
            answerKey[3] = 4;
         }
         if (guess.equals("A"))
         {
            answerKey[3] = 1;
         }
         if (guess.equals("B"))
         {
            answerKey[3] = 2;
         }
         if (guess.equals("C"))
         {
            answerKey[3] = 3;
         }
         if (guess.equals("D"))
         {
            answerKey[3] = 4;
         }
*/
