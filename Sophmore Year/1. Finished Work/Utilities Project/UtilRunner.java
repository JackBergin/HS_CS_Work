/*
Source File Name: Util
Programmer: Jack Bergin
Class: Ap Computer Science
Date: 11/1/16
Description: It will execute utilities
*/
public class UtilRunner
{ 
   public static void main (String[] args)
   {
      //This gives the hypotenuse of a triangle
      double answer = Util.hypotenuse(4.6,5.6);
      System.out.println("The hypotenuse is: "+ answer);
      System.out.println();
      
      //This gives the average of 2,3 or 4 numbers
      double aver = Util.average(4,5,4,6);
      System.out.println("The average of your numbers is " + aver);
      System.out.println();
     
      //This calculates your grade for the year in a class
      double gradeForYear = Util.yearGrade(90,100,98,94,78,81);
      System.out.println("The grade average you have for the year is the following: " + gradeForYear);
      System.out.println();
     
      //By using the quadratic formula the following 
      //program allows one to solve a quadratic equation in standard form.
      Util.quad(4, 3, -6);
      System.out.println();
     
      //This calculates the vertex of a quadratic equation 
      Util.quadVer(4, 3, -6);
      System.out.println();  
   }
}