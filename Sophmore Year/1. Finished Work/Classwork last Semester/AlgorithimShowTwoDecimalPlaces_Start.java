/*
Programm: javaNotesNineSix.java
Programmer: Jack Bergin
Date: 10/3/16
Class: Comp Sci.
What about: counting number spots
*/

public class AlgorithimShowTwoDecimalPlaces_Start
{
   public static void main (String [] args)
   {
   double num1 = 5.67;
   double num2 = 6.5656;
   double quot = num1/num2;
   
   quot = ((int)(quot *100))/100.0;
   
   System.out.println(quot);
   
   }
}