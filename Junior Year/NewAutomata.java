/*
Java Practice
*/

import java.awt.*; 
import java.util.*;

public class NewAutomata
{
   public static void main(String[] args)   
   {
      DrawingPanel panel = new DrawingPanel(1000,800);
      Graphics g = panel.getGraphics();
   
      int[] arrayTop = new int[50];
      
      //FIRST ROW
      for (int i = 0; i < arrayTop.length; i++)
      {
         int randomNumber = (int)(Math.random()*2+0);
         arrayTop[i] = randomNumber;
         
         if (randomNumber == 0) //white
         {
            g.drawRect(i*20, 0, 20, 20); //white
         }
         if (randomNumber == 1) //black
         {
            g.fillRect(i*20, 0, 20, 20); //black fill
            g.drawRect(i*20, 0, 20, 20); //black outline
         }
      }
      
      //SECOND ROW
      int[] arrayBottom = new int[50]; //create new array
      
      
      for (int j = 1; j <= 400; j++)
      {
         //for index [0], this is the first box of the array
         if ((arrayTop[49] == 0 && arrayTop[0] == 0 && arrayTop[1] == 0) ||
          (arrayTop[49] == 1 && arrayTop[0] == 1 && arrayTop[1] == 1))      
         {
            arrayBottom[0] = 0; //white
            g.drawRect(0*20, j*20, 20, 20); //white
         } 
         else 
         {
            arrayBottom[0] = 1; //black
            g.fillRect(0*20, j*20, 20, 20); //black fill
            g.drawRect(0*20, j*20, 20, 20); //black outline
         }
      
         //for indexes [1] through [48], these are the middle 48 boxes
         for (int i = 1; i < arrayBottom.length - 1; i++)
         {
            if (arrayTop[i-1] == 0 && arrayTop[i] == 0 && arrayTop[i+1] == 0)
            {
               arrayBottom[i] = 0; //white
               g.drawRect(i*20, j*20, 20, 20); //white
            }
            else
            {
               if (arrayTop[i-1] == 1 && arrayTop[i] == 1 && arrayTop[i+1] == 1)
               {
                  arrayBottom[i] = 0; //white
                  g.drawRect(i*20, j*20, 20, 20); //white
               }
               else
               {
                  arrayBottom[i] = 1; //black
                  g.fillRect(i*20, j*20, 20, 20); //black fill
                  g.drawRect(i*20, j*20, 20, 20); //black outline
               }
            }
         }
      
         //for index [49], this is the last box of the array
         if (arrayTop[48] == 0 && arrayTop[49] == 0 && arrayTop[0] == 0)
         {
            arrayBottom[49] = 0; //white
            g.drawRect(49*20, j*20, 20, 20); //white
         
         } 
         else 
         {
            if (arrayTop[48] == 1 && arrayTop[49] == 1 && arrayTop[0] == 1)
            {
               arrayBottom[49] = 0; //white
               g.drawRect(49*20, j*20, 20, 20); //white
            }
            else
            {
               arrayBottom[49] = 1; //black
               g.fillRect(49*20, j*20, 20, 20); //black fill
               g.drawRect(49*20, j*20, 20, 20); //black outline
            }
         }
      
         //turns arrayBottom into a new arrayTop and process starts again
         for (int k = 0; k < arrayTop.length; k++)
         {
            arrayTop[k] = arrayBottom[k];
         }
      
      }//end main for loop
      
      
      
      System.out.println(Arrays.toString(arrayTop)); //nice way to print an array
      System.out.println(Arrays.toString(arrayBottom)); //nice way to print an array
   }//end main method
}//end class
      
      
      
      
