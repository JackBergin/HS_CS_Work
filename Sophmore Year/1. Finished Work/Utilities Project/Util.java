/*
Source File Name: Util
Programmer: Jack Bergin
Class: Ap Computer Science
Date: 11/1/16
Description: Will have all the 
formulas needed for the utilities 
runner to run properly.
*/

public class Util
{
   //Formula to find the Hypotenuse of a Triangle
   public static double hypotenuse (double legA, double legB)
   {
      double result = Math.sqrt(legA*legA + legB*legB);
      return result;
   }
   //Formula to find your grade for a year in a class
   public static double yearGrade (int t1, int t2, int t3, int t4, int m, int f)
   {
      double grade = (.2 * t1 + .20 * t2 + .20 * t3 + .20* t4 + .10 *m + .10*f);
      return grade;
   }
   //How to find an average of 4,3 and 2 numbers
   public static double average (int num1, int num2, int num3, int num4)
   {
      double answer = (num1 + num2+ num3 + num4)/4;
      return answer;
   }
   public static double average (int num1, int num2, int num3)
   {
      double answer = (num1 + num2+ num3)/3;
      return answer;
   }
   public static double average (int num1, int num2)
   {
      double answer = (num1 + num2)/2;
      return answer;
   }
   //The formula in solving a quadratic equation
   public static void quad (double a, double b, double c)
   {
      double answer1 = (-b + Math.sqrt(b*b-4*a*c))/2*a;
      System.out.println("The solution x1 = " + answer1);
      double answer2 = (-b - Math.sqrt(b*b-4*a*c))/2*a;
      System.out.println("The solution x2 = " + answer2); 
   }   
   //The formula in finding a quadratic equations vertex
   public static void quadVer (double a, double b, double c)
   {
      double answer1 = (-b)/(2*a);
      double answer2 = (answer1*answer1*a)+(answer1*b)+c;
      System.out.println("The vertex = " + answer1 + ", " + answer2);
 
   }   
}