/*
Java Practice
*/

import java.awt.*; 
import java.util.*;
import java.util.Scanner;


public class Tester3
{
   public static void main(String[] args)   
   {
      System.out.println("How many times would you like for this program to run?");
      // Amount of times the user wants this program to run
      Scanner input = new Scanner(System.in);
      int times = input.nextInt();
      int count = 0;
      
      DrawingPanel panel = new DrawingPanel(1000,1000);
      Graphics g = panel.getGraphics();
   
      int[] arrayTop = new int[50]; // First array
      
      int[] ruleSet = {0,0,0,0,0,0,0,0};
      // Decides what rules you want to be written; 
      //acts like an on off switch
      

      while (count != times)
      {
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
            if ((arrayTop[49] == 0 && arrayTop[0] == 0 && arrayTop[1] == 0 && ruleSet[0] == 1) ||
             (arrayTop[49] == 1 && arrayTop[0] == 1 && arrayTop[1] == 1 && ruleSet[1] == 1) ||
             (arrayTop[49] == 1 && arrayTop[0] == 0 && arrayTop[1] == 0 && ruleSet[2] == 1) ||
             (arrayTop[49] == 0 && arrayTop[0] == 0 && arrayTop[1] == 1 && ruleSet[3] == 1) ||
             (arrayTop[49] == 1 && arrayTop[0] == 1 && arrayTop[1] == 0 && ruleSet[4] == 1) ||
             (arrayTop[49] == 0 && arrayTop[0] == 1 && arrayTop[1] == 1 && ruleSet[5] == 1) ||
             (arrayTop[49] == 1 && arrayTop[0] == 0 && arrayTop[1] == 1 && ruleSet[6] == 1) ||
             (arrayTop[49] == 0 && arrayTop[0] == 1 && arrayTop[1] == 0 && ruleSet[7] == 1))
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
               if ((arrayTop[i-1] == 0 && arrayTop[i] == 0 && arrayTop[i+1] == 0 && ruleSet[0] == 1)||
                (arrayTop[i-1] == 1 && arrayTop[i] == 1 && arrayTop[i+1] == 1 && ruleSet[1] == 1)||
                (arrayTop[i-1] == 1 && arrayTop[i] == 0 && arrayTop[i+1] == 0 && ruleSet[2] == 1)||
                (arrayTop[i-1] == 0 && arrayTop[i] == 0 && arrayTop[i+1] == 1 && ruleSet[3] == 1)||
                (arrayTop[i-1] == 1 && arrayTop[i] == 1 && arrayTop[i+1] == 0 && ruleSet[4] == 1)||
                (arrayTop[i-1] == 0 && arrayTop[i] == 1 && arrayTop[i+1] == 1 && ruleSet[5] == 1)||
                (arrayTop[i-1] == 1 && arrayTop[i] == 0 && arrayTop[i+1] == 1 && ruleSet[6] == 1)||
                (arrayTop[i-1] == 0 && arrayTop[i] == 1 && arrayTop[i+1] == 0 && ruleSet[7] == 1))
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
         
            //for index [49], this is the last box of the array
            if ((arrayTop[48] == 0 && arrayTop[49] == 0 && arrayTop[0] == 0 && ruleSet[0] == 1)||
             (arrayTop[48] == 1 && arrayTop[49] == 1 && arrayTop[0] == 1 && ruleSet[1] == 1)||
             (arrayTop[48] == 1 && arrayTop[49] == 0 && arrayTop[0] == 0 && ruleSet[2] == 1)||
             (arrayTop[48] == 0 && arrayTop[49] == 0 && arrayTop[0] == 1 && ruleSet[3] == 1)||
             (arrayTop[48] == 1 && arrayTop[49] == 1 && arrayTop[0] == 0 && ruleSet[4] == 1)||
             (arrayTop[48] == 0 && arrayTop[49] == 1 && arrayTop[0] == 1 && ruleSet[5] == 1)||
             (arrayTop[48] == 1 && arrayTop[49] == 0 && arrayTop[0] == 1 && ruleSet[6] == 1)||
             (arrayTop[48] == 0 && arrayTop[49] == 1 && arrayTop[0] == 0 && ruleSet[7] == 1))
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
         
            for (int k = 0; k< arrayTop.length; k++)
            {
               arrayTop[k] = arrayBottom[k];
            }
         }
          g.drawRect(0, 0, 1000, 1000); //white
          count++;
      }
   }// ends the main for loop
      //System.out.println(Arrays.toString(arrayTop)); //nice way to print an array
      //System.out.println(Arrays.toString(arrayBottom)); //nice way to print an array
}//end main method