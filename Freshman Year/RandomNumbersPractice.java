/*
Programmer: Jack Bergin
Class: Intro to comp. sci.
Date: 12/10/15
Description: This propgram will be used to 
practice generating random numbers aswell 
as leading into the creation of the dice 
game.
*/
public class RandomNumbersPractice
{
   public static void main (String[] args) 
   {
        int ones = 0;
        int twos= 0;
        int threes = 0;
        int fours = 0;
        int fives = 0;
        int sixes = 0;
        
         int raNum;
         for(int k=1; k<=20; k++)
         {
         for(int i=1; i<=20; i++)
         {
         raNum = (int)(Math.random()*6+1);
         System.out.print(raNum + " ");
         
         if(raNum == 1)
         {
         ones = ones+1;
         }
         if(raNum == 2)
         {
         twos = twos+1;
         }
         if(raNum == 3)
         {
         threes = threes+1 ;
         }
         if(raNum == 4)
         {
         fours = fours+1;
         }
         if(raNum == 5)
         {
         fives = fives+1;
         }
         if(raNum == 6)
         {
         sixes = sixes+1;
         }
         
         }
         System.out.println();
         }
         //Tells how many types of #s there are
         System.out.println( );
         System.out.println("Number of 1s: " +ones + " out of 400" );
         System.out.println("Number of 2s: " +twos + " out of 400" );
         System.out.println("Number of 3s: " +threes + " out of 400" );
         System.out.println("Number of 4s: " +fours + " out of 400" );
         System.out.println("Number of 5s: " +fives + " out of 400" );
         System.out.println("Number of 6s: " +sixes + " out of 400" );  
      }
   }
