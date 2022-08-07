/*
Programmer: Your Name
Date: 02/14/17
Description: Day of Reckoning program for exam
*/

import java.util.*; //for Arrays class

public class DayOfReckoning_Exam07_Download
{
   public static void main (String[] args)   
   {
      //The arrays are declared and initalized
      int[] winningNumbers = new int [6];
      int[] yourNumbers = new int [6];
      
      //This is used to give both arrays random 
      //numbers to fill their 6 blank spaces
      for(int i = 0; i < winningNumbers.length; i++)
      {
         int numbers = (int)(Math.random()*50)+1;
         winningNumbers[i] = numbers;
      }
      for(int j = 0; j < yourNumbers.length; j++)
      {
         int numbers2 = (int)(Math.random()*50)+1;
         yourNumbers[j] = numbers2;
      }
      
      //This sorts the random arrays from least to greatest
      Arrays.sort(winningNumbers);
      Arrays.sort(yourNumbers);
      
      System.out.println("Winning Numbers:   " + Arrays.toString(winningNumbers));
      System.out.println("My Lottery Ticket: " + Arrays.toString(yourNumbers));
      
      boolean compareNumbersPrint = compareNumbers(winningNumbers, yourNumbers);
   
      //This takes the return methods value as a boolean and 
      //changes it to a string form saying whether one lost 
      //or won the lottery
      if (compareNumbersPrint == true)
      {
         System.out.println("You just one the lottery!!!!");
      }
      if (compareNumbersPrint == false)
      {
         System.out.println("Sorry, you lost, better luck next time");
      }
   }
   
   //METHOD: compares two arrays to determine if they are equal
   public static boolean compareNumbers(int[] winningNumbers, int[] lotteryTicket)
   {
      //initializes the boolean data type
      boolean winner = true;
      //Ensures that both arrays are the same length
      if(winningNumbers.length == lotteryTicket.length)
      {  
         //Compares each index of the array
         for(int i = 0; i < winningNumbers.length; i++)
         {
            if(winningNumbers[i] == lotteryTicket[i])
            {
               winner = true;
            }
            if(winningNumbers[i] != lotteryTicket[i])
            {
               winner = false;
               break;
            }
         }
      }
      //Returns a true or false 
      //statement on whether the two 
      //arrays are equal or not
      return winner;
   }
}//end class