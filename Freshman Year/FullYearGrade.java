/*
File: Practice four loop
Programmer:Jack Bergin
Class: Comp sci
Date: 1/25/16

Description: Program is for creating 
practicing an if else statement by 
converting regular numbers to roman
numerals
*/
import java.util.Scanner; // Must import this library for the scanner

public class FullYearGrade
{
   public static void main (String[] args)
   {
   Scanner input = new Scanner (System.in);
   
   System.out.println ("Hello, please enter your name even though I don't really care.");
   String yourName = input.nextLine();
   
   System.out.println ("What was your term 1 grade?");
   int term1 = input.nextInt();
   
   System.out.println ("What was your term 2 grade?");
   int term2 = input.nextInt();

   System.out.println ("What what was your Midyear grade?");
   int midterm = input.nextInt();

   System.out.println ("What was your term 3 grade?");
   int term3 = input.nextInt();
   
   System.out.println ("What was your term 4 grade?");
   int term4 = input.nextInt();
   
   System.out.println ("What was your grade for finals?");
   int fin = input.nextInt();
   
   double finalGrade = term1*.20 + term2*.20 + term3*.20 + term4*.20 + fin*.10 + midterm*.10;
   
   if(finalGrade >= 90)
   {
   System.out.println("-----------------------------------");
   System.out.println("Your term one grade     = " + term1);
   System.out.println("Your term two grade     = " + term2);
   System.out.println("Your Midyear grade      = " + midterm);
   System.out.println("Your term three grade   = " + term3);
   System.out.println("Your term four grade    = " + term4);
   System.out.println("Your final exam grade   = " + fin);
   System.out.println();
   System.out.println("Your grade is a " +finalGrade+ "% or an A for the year.");
   System.out.println("------------------------------------------");
   }
   if (finalGrade<90 && finalGrade>= 80)
   {
   System.out.println("-----------------------------------");
   System.out.println("Your term one grade     = " + term1);
   System.out.println("Your term two grade     = " + term2);
   System.out.println("Your Midyear grade      = " + midterm);
   System.out.println("Your term three grade   = " + term3);
   System.out.println("Your term four grade    = " + term4);
   System.out.println("Your final exam grade   = " + fin);
   System.out.println();
   System.out.println("Your grade is a " +finalGrade+ "% or a B for the year.");
   System.out.println("------------------------------------------");
   }
   if (finalGrade<80 && finalGrade>= 70)
   {
   System.out.println("-----------------------------------");
   System.out.println("Your term one grade     = " + term1);
   System.out.println("Your term two grade     = " + term2);
   System.out.println("Your Midyear grade      = " + midterm);
   System.out.println("Your term three grade   = " + term3);
   System.out.println("Your term four grade    = " + term4);
   System.out.println("Your final exam grade   = " + fin);
   System.out.println();
   System.out.println("Your grade is a " +finalGrade+ "% or a C for the year.");
   System.out.println("------------------------------------------");
   }
   if (finalGrade<70 && finalGrade>= 65)
   {
   System.out.println("-----------------------------------");
   System.out.println("Your term one grade     = " + term1);
   System.out.println("Your term two grade     = " + term2);
   System.out.println("Your Midyear grade      = " + midterm);
   System.out.println("Your term three grade   = " + term3);
   System.out.println("Your term four grade    = " + term4);
   System.out.println("Your final exam grade   = " + fin);
   System.out.println();
   System.out.println("Your grade is a " +finalGrade+ "% or a D for the year.");
   System.out.println("------------------------------------------");
   }
   if (finalGrade < 65)
   {   
   System.out.println("-----------------------------------");
   System.out.println("Your term one grade     = " + term1);
   System.out.println("Your term two grade     = " + term2);
   System.out.println("Your Midyear grade      = " + midterm);
   System.out.println("Your term three grade   = " + term3);
   System.out.println("Your term four grade    = " + term4);
   System.out.println("Your final exam grade   = " + fin);
   System.out.println();
   System.out.println("Your grade is a " +finalGrade+ "% or an F for the year.");
   System.out.println("------------------------------------------");

   }
}
}
