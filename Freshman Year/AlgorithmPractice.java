/*
File: Practice four loop
Programmer:Jack Bergin
Class: Comp sci
Date: 1/25/16

Description: Programm is for creating 
simple Algorithm and practicing 
an if else statement
*/
public class AlgorithimPractice
{
   public static void main(String [] args)
   {
     int temp = mystery2 (2, 8);
     System.out.println(temp);
   }
   
   public static int mystery2 (int x, int y)
   {
      while (x != 0 && y != 0)
      {
         if (x < y) {y -= x;}
         else {x -= y;}
      }
         return x+y;
   }
}