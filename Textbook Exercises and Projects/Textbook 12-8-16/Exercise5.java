/*
Programmer: Jack Bergin
Class: Computer Science
Date: 12/15/16
Description: These are the programs 
that we had to make for the test
*/

public class Exercise5
{
   public static void main (String []args)
   {
      printRange(1,24);
   }
   
   public static void printRange(int a, int b)
   {
       //First bracket
       System.out.print("[");
       for(int i = a; i <= b-1; i++)
       {
          //Prints the numbers in the middle
          System.out.print(i+ ", ");
       }
       System.out.print(b);
       System.out.println("]");
       //Second bracket
   }
}