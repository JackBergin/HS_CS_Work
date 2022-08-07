/*
Program: SongRepeat
Programmer: Jack Bergin
Class: AP Computer Science
Date: 09/12/16
Description: Makes a song look like its being sung.
*/

public class SongRepeat
{
   public static void main (String[] args)
   {
      System.out.println("Hello");
      delay(2100);
      System.out.print("it's");
      delay(200);
      System.out.println(" me");
      delay(1000);
      System.out.print("I");
      delay(800);
      System.out.print(" was");
      delay(500);
      System.out.print(" wondering ");
      delay(1000);
      System.out.print("if ");
      delay(400);
      System.out.print("after");
      delay(500);
      System.out.print(" all ");
      delay(500);
      System.out.println("these ");
      delay(450);
      System.out.print("years");
      delay(450);
      System.out.print(" you'd ");
      delay(300);
      System.out.print("like");
      delay(200);
      System.out.print(" to");
      delay(200);
      System.out.print(" meet");
   }
   //This is so that the delay can work
   
   public static void delay(int n)
   {
      long startDelay = System.currentTimeMillis();
      long endDelay = 0;
      while(endDelay- startDelay < n)
         endDelay = System.currentTimeMillis();
   } 
}