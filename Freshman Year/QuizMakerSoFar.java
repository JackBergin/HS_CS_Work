import java.util.Scanner;

public class QuizMakerSoFar
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      //create questions
      String[] questions = new String[10];
      questions[0] = "What year was I born?";
      questions[1] = "How many US states have I visited?";
      questions[2] = "What is my favorite baseball team?";
      questions[3] = "What was the last country I visited?";
      questions[4] = "What town/city do I currently live in?";
      questions[5] = "What kind of car do I drive?";
      questions[6] = "What is my favorite video game?";
      questions[7] = "Where was I born?";
      questions[8] = "What was my profession before teaching?";
      questions[9] = "Where did I go to college?";
      
      //create answer choices
      String[] answerChoices = new String[10];
      answerChoices[0] = "1. 1966, 2. 1962, 3. 1970, 4. 1974";
      answerChoices[1] = "1. 8, 2. 28, 3. 48, 4. 18";
      answerChoices[2] = "1. Cardinals, 2. Yankees, 3. Red Sox, 4. Phillies"; 
      answerChoices[3] = "1. Thailand, 2. Canada, 3. England, 4. Never left USA";
      answerChoices[4] = "1. Ipswich, 2. Gloucester, 3. Beverly, 4. Rockport";
      answerChoices[5] = "1. Chrysler Lebaron, 2. VW Van from the 60's, 3. Porshe, 4. Honda CRV"; 
      answerChoices[6] = "1. Kerbal Space Program, 2. XCOM, 3. Civilization V, 4. Skyrim";
      answerChoices[7] = "1. Oklahoma, 2. California, 3. Massachusetts, 4. Delaware";
      answerChoices[8] = "1. Civil Engineer, 2. Lawyer, 3. Accountant, 4. Bounty Hunter"; 
      answerChoices[9] = "1. Univ. of California, 2. Kansas, 3. UMass Amherst, 4. Syracuse"; 
      
      
      
      
      //create answer key
      int[] answerKey = new int[10];
      answerKey[0] = 1;
      answerKey[1] = 3;
      answerKey[2] = 4;
      answerKey[3] = 1;
      answerKey[4] = 1;
      answerKey[5] = 2;
      answerKey[6] = 3;
      answerKey[7] = 4;
      answerKey[8] = 1;
      answerKey[9] = 2;
      
      
      
      
      
      //create array to collect the user's answers
      int[] answerYours = new int[10];
      
      for(int k=0; k<questions.length; k++)
      {
         System.out.println(questions[k]);
         System.out.println(answerChoices[k]);
         
         answerYours[k] = input.nextInt(); //pauses and waits for your answer
      }
      
      //for loop to grade answers
      int sum = 0;
      for(int i=0; i<questions.length; i++)
      {
         if(answerKey[i]==answerYours[i])
         {
            sum = sum + 1;
         }
      }
      
      //print out results
      System.out.println("SUMMARY OF RESULTS");
      System.out.println("--------------------------------------");
      System.out.println();
      
      for(int j=0; j<questions.length; j++)
      {
         System.out.println(questions[0]);
         System.out.println(answerChoices[0]);
         System.out.println("Your answer: " +answerYours[j]+ ", Correct answer: " +answerKey[j]);
         System.out.println();
      }
      System.out.println("You got " +sum+ " correct out of " +questions.length);      
      System.out.println("Your grade is: " +((double)sum/questions.length)*100+"%");   
   }
}