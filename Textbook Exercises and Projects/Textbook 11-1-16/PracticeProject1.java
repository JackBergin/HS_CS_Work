/*
This is the project and then the two exercises
Programmer: Jack Bergin
Class: Computer Science
Date: 11/15/16
*/

public class PracticeProject1 
{
   public static void main(String []args)
   {
      int count=3;
      int dash = 100;
      int totalPresents=0;
        
      dashSpace(dash);
      System.out.println();
      System.out.print("Day: ");
   	
      blankSpace(count); 
      System.out.print("Presents Received: ");
   	
      blankSpace(count); 
      System.out.println("Total Presents: ");
   	
      dashSpace(dash);
      System.out.println(); 
   	
   	//Shows the Day and the presents received on that day
      for(int i = 1; i <= 12; i++)
      {
         String outputString = "";
         int numPres = i ;
         totalPresents += numPres;
         outputString = i + "\t\t\t" + numPres + "\t\t\t\t\t\t\t" + totalPresents;
         System.out.println(outputString);
      }    	
      System.out.println();
   }
    
   //Spaces for the table
   public static void blankSpace (int count)
   {
      for(int i = 1; i <= count; i++)
      {
         System.out.print(" ");
      }
   }
    //Dashes for the table
   public static void dashSpace (int dash)
   {
      for(int j = 1; j <= dash; j++)
      {
         System.out.print("-");
      }
   }
}