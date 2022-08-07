
/*
Programmer: Jack Bergin
Program: Encryption
Program Objective: Make a quiz that works 
and asks questions about lacrosse reffing.
*/

import java.util.Scanner;

public class BooleanTestJack
{
   public static void main(String[] args) 
   {
      Scanner input = new Scanner(System.in);
            
      //create questions 
      String[] quest = new String[10];
      quest[0] = "What is the penalty when a player is two handed from behind?";
      quest[1] = "How does a player clear the zone properly";
      quest[2] = "How do you properly say down when setting up a faceoff?";
      quest[3] = "What is a lacrosse stick?";
      quest[4] = "What is a lacrosse ball used for?";   
      quest[5] = "What is the main color of the lacrosse net?";
      quest[6] = "Are you allowed to put one arm out to block the defenders stick?";
      quest[7] = "Can a midfeilder go offsides?";
      quest[8] = "What is the most agregious penelty in lacrosse?";
      quest[9] = "How did Luke Duprey have his lacrosse career end?";

      //Create answer choices
      String[] answ = new String[10];
      answ[0] = "A. Cross check B. Slash C. Trip D. Unessary roughness";
      answ[1] = "A. 30 seconds B. 20 seconds C. 60 seconds D. 10 seconds";
      answ[2] = "A. Nothing B. You dont say down C. Just say go D. Set up on my foot, down.";
      answ[3] = "A. A stick B. Irrevelent C. You dont use a stick D. A thing you pass with and shoot with";
      answ[4] = "A. No ball B. No answer C. Something you pass and shoot with D. Trick question"; 
      answ[5] = "A. Blue B. Orange C. Black D. Green";
      answ[6] = "A. No, that is a ward. B. Only if you arent caught C. Yes D. Trick question";
      answ[7] = "A.Yes B. No C. Only if hes onsides for a defender or attacker D. Depends on where he is on the feild";
      answ[8] = "A.Slash B. Push with possession C. Push with out possession D. Unessary roughness";
      answ[9] = "A. He quit B. Got benched C. He was illegally bodychecked D. He died";
      
      //create answer key
      String [] answerKey = new String[10];
      answerKey[0] = "d";
      answerKey[1] = "a";
      answerKey[2] = "d";
      answerKey[3] = "d";
      answerKey[4] = "c";
      answerKey[5] = "b";
      answerKey[6] = "a";
      answerKey[7] = "c";
      answerKey[8] = "d";
      answerKey[9] = "c";

      // The guess for the question
      
      String[] guess = new String[10];
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
      
      System.out.println("You got " +sum+ " correct out of " +quest.length);      
      System.out.println("Your grade is: " +((double)sum/quest.length)*100+"%");      

      
   }

}

