/*
This program is going to be used to practice 
the new array programming inside of java.
Programmer: Jack Bergin
Date: 4/5/16
Block: E
*/
import java.util.Scanner;

public class PracticeArrays
{ 
   public static void main(String[] args)
   {
      int[] myArray = {1,2,3,4,5};
   
      double[] myDouble = {3.7, 6.7, 6.8};
   
      char[] myLetters = {'A','B','C',};
   
      boolean[] myBooleans = {true, false, true, true, false};
   
      String[] myNames = {"Jack", "Ryan", "Sean"};
   
   
   //How to print out all of the arrays wanted
   
      for(int i=0; i < myBooleans.length; i++)
      {
         System.out.println(myBooleans[i]);
      }
   
   }
}
   /*
   int[] myArray = new int [8];
   
   myArray[0] = 100;
   myArray[1] = 20;
   myArray[2] = 36;
   myArray[3] = 48;
   myArray[4] = 59;
   myArray[5] = 68;
   myArray[6] = 73;
   myArray[7] = 85;

   System.out.println(myArray[5]);
   
------------------------------------------
   
   String[] myArray = new string [8];
   
   myArray[0] = "Jack";
   myArray[1] = "Mom";
   myArray[2] = "Dad";
   myArray[3] = "Bailey";
   myArray[4] = "Ryan";
   myArray[5] = "Sean";
   myArray[6] = "Christopher";
   myArray[7] = "Bergin";

   System.out.println(myArray[5]);
   */