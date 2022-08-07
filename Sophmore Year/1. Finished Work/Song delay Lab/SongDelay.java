/*
Program: SongDelay
Programmer: Jack Bergin
Class: AP Computer Science
Date: 09/12/16
Description: Makes a song look like its being sung.

The song is Hello By Adelle

Hello, it's me
I was wondering if after all these years you'd like to meet
To go over everything
They say that time's supposed to heal ya
But I ain't done much healing
*/

public class SongDelay
{
   public static void main (String[] args)
   {
      System.out.print("Hello");
      delay(2100);
      System.out.print(", it's");
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
      System.out.print("these");
      delay(450);
      System.out.print(" years");
      delay(450);
      System.out.print(" you'd ");
      delay(300);
      System.out.print("like");
      delay(200);
      System.out.print(" to");
      delay(200);
      System.out.println(" meet");
      delay(300);
      System.out.print("to ");
      delay(450);
      System.out.print("go");
      delay(450);
      System.out.print(" over ");
      delay(900);
      System.out.println("everything");
      delay(1200);
      System.out.print("They ");
      delay(200);
      System.out.print("say ");
      delay(200);
      System.out.print("that");
      delay(200);
      System.out.print(" time's");
      delay(200);
      System.out.print(" supposed ");
      delay(300);
      System.out.print("to ");
      delay(200);
      System.out.print("heal");
      delay(200);
      System.out.println(" ya");
      delay(450);
      System.out.print("but ");
      delay(450);
      System.out.print("I");
      delay(450);
      System.out.print(" ain't ");
      delay(300);
      System.out.print("done");
      delay(300);
      System.out.print(" much");
      delay(200);
      System.out.print(" healing");
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