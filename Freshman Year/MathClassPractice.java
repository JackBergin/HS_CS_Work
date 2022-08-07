/**********************
Programmer: Jack Bergin
Class: Intro to comp. sci.
Date: 12/10/15
Description: Math Method learner
************************/
//score = score (-*/+) x


public class MathClassPractice
{
  public static void main (String[] args) 
   {
   /************************************* 
   double answer1 = Math.pow(3,10);
   System.out.println("The answer is " + answer1);
   System.out.println() ;  
   
   double answer2 = Math.sqrt(16);
   System.out.println("The answer is " + answer2) ;  
   System.out.println();
   
   double answer3 = Math.round(2.0);
   System.out.println("The answer is " + answer3) ;  
   System.out.println();

   double answer4 = Math.abs(-1);
   System.out.println("The answer is " + answer4) ;  
   System.out.println();
   
   System.out.println(Math.PI);
   System.out.println();

   System.out.println();
   System.out.println(Math.E);
   System.out.println();
   System.out.println();
   System.out.println();
   **********************/
  
   double a=2.0; 
   double b=7.5; 
   double c = 7.76;
   
   c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
   System.out.println(c);
   System.out.println();

   double x = -b + (Math.sqrt(Math.pow(b,2) - 4*a*c))/(2*a);
   System.out.println(x);
   }
}

