/*
Programmer: Jack Bergin
Class: Computer Science
Date: 1/16/17
Description: These are all three of the 
exercises that I did prior to the test
*/
import java.util.*;
public class ExercisesForChapter7
{
   public static void main (String []args)
   {
     //Exercise # 3:
      int [] exercise3  = {14, 1, 22, 17, 36, 7, -43, 5}; 
      int printOutCountRange = countInRange(4, 17, exercise3);
      System.out.println(printOutCountRange);
     
     //Exercise # 10:
      double [] exercise10 = {6,2,9,11,3};
      double percentEven = percentEven(exercise10);
      System.out.println(percentEven+ "% of the array has even numbers.");
     
     //Exercise # 11:
      int [] exercise11 = {3,7,8,5,1};
      boolean printOutIsUnique = isUnique(exercise11);
      System.out.println("It is " +printOutIsUnique+ " that this array is unique.");
   }
   //Exercise # 3: 
   public static int countInRange(int min, int max, int [] array)
   {
      int counter = 0; 
      for(int i = 0; i < array.length; i++)
      {
         int relater = array[i];
         if(min <= relater && relater <= max)
         {
            counter++;
         }
      }
      return counter;
   }
   
   //Exercise # 10:
   public static double percentEven(double [] array)
   {
      double counter = 0;
      for(int i = 0; i < array.length; i++)
      {
         if((array[i]%2) == 0)
         {
            counter++;
         }
      }
      double average = (counter/array.length)*100;
      return average;
   }
  
  //Exercise # 11:
   public static boolean isUnique (int []array)
   {
      boolean bool = true;
      
      for(int i = 0; i < array.length; i++)
      {
         for(int j = i+1; j < array.length; j++)
         {   
                 
            if(array[i] == array[j])
            {
               bool = false;
               break;
            }
         }
      }
      return bool;
   }
}