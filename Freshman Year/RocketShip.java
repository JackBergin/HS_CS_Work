/*
Source File Name: RocketShip
Programmer: Jack Bergin
Class:Ap Computer science
Date: 09/09/16
Block: E
Description: This is our first assignment of the year.
*/

public class RocketShip
{
   public static void main (String [] args)
   {
   
      cone();//These Method Calls make up the rocket; wall sides of rocket; 
      base();//base, sections of rocket; cone, top and bottom of rocket
      wall();
      base();
      wall();
      base();
      System.out.println("|United|");
      System.out.println("|States|");
      base();
      wall();
      base();
      wall();
      base();
      cone();
      
   }
   
   
   
   public static void base() 
   {
      System.out.println("+------+");
   }
   
   public static void wall()
   {
      System.out.println("|      |");
      System.out.println("|      |");
   }
        
   public static void cone() 
   {
      System.out.println("   /\\");
      System.out.println("  /  \\");
      System.out.println(" /    \\");
   }
   
      
}  