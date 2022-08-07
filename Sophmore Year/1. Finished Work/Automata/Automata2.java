/*
Java Practice
*/

import java.awt.*; 
import java.util.*;
import java.util.Scanner;

public class Automata2
{
   public static void main(String[] args)   
   {
      Scanner input = new Scanner(System.in);
      
      System.out.println("How would you like the pattern of the program?");
      System.out.println();
      
      //All of this decides the pattern that will be printed out for the array ruleSet[]
      System.out.println("On or off for the pattern: 000 (on = 1, off = 0)");
      int a = input.nextInt();
      System.out.println("On or off for the pattern: 111 (on = 1, off = 0)");
      int b = input.nextInt();
      System.out.println("On or off for the pattern: 100 (on = 1, off = 0)");
      int c = input.nextInt();
      System.out.println("On or off for the pattern: 001 (on = 1, off = 0)");
      int d = input.nextInt();
      System.out.println("On or off for the pattern: 110 (on = 1, off = 0)");
      int e = input.nextInt();
      System.out.println("On or off for the pattern: 011 (on = 1, off = 0)");
      int f = input.nextInt();
      System.out.println("On or off for the pattern: 101 (on = 1, off = 0)");
      int h = input.nextInt();
      System.out.println("On or off for the pattern: 010 (on = 1, off = 0)");
      int l = input.nextInt();
      System.out.println();
      
      System.out.println("How many times would you like for this program to run?");
      int times = input.nextInt(); //Amount of times the user wants this program to run
     
      int count = 0;//The cumulitive integer that will be used in a 
                    //while statement to be compared to int times
      
      DrawingPanel panel = new DrawingPanel(1000,1000);
      Graphics g = panel.getGraphics();
      
      g. setColor (Color.black);
   
      int[] arrayTop = new int[100]; // First array
      
      
      //The reason why its not a,b,c,d,e,f,g,h,i is because g,i,j,k are 
      //alredy defined and used as variables inside of the program and 
      //this part was put on lat as a finshing touch.
      int[] ruleSet = {a,b,c,d,e,f,h,l};
      // Decides what rules you want to be written; 
      //acts like an on off switch
   
      while (count != times)
      {
         //This will makesure that for every loop the drawer 
         //makes, a new and completly unique color will be used
         int randomColor1 = (int)(Math.random()*256+0);
         int randomColor2 = (int)(Math.random()*256+0);
         int randomColor3 = (int)(Math.random()*256+0);
         
         g. setColor (new Color (randomColor1,randomColor2,randomColor3));
         
         //FIRST ROW
         for (int i = 0; i < arrayTop.length; i++)
         {
            int randomNumber = (int)(Math.random()*2+0);
            arrayTop[i] = randomNumber;
         
            if (randomNumber == 0) //white
            {
               g.drawRect(i*10, 0, 10, 10); //white
            }
            if (randomNumber == 1) //black
            {
               g.fillRect(i*10, 0, 10, 10); //black fill
               g.drawRect(i*10, 0, 10, 10); //black outline
            }
         }
         
         //This will makesure that for every loop the drawer 
         //makes, a new and completly unique color will be used
         int randomColor4 = (int)(Math.random()*256+0);
         int randomColor5 = (int)(Math.random()*256+0);
         int randomColor6 = (int)(Math.random()*256+0);
         
         g. setColor (new Color (randomColor4,randomColor5,randomColor6));
      
         //SECOND ROW
         int[] arrayBottom = new int[100]; //create new array
      
         for (int j = 1; j <= 800; j++)
         {
            //for index [0], this is the first box of the array
            if ((arrayTop[99] == 0 && arrayTop[0] == 0 && arrayTop[1] == 0 && ruleSet[0] == 1) ||
                (arrayTop[99] == 1 && arrayTop[0] == 1 && arrayTop[1] == 1 && ruleSet[1] == 1) ||
                (arrayTop[99] == 1 && arrayTop[0] == 0 && arrayTop[1] == 0 && ruleSet[2] == 1) ||
                (arrayTop[99] == 0 && arrayTop[0] == 0 && arrayTop[1] == 1 && ruleSet[3] == 1) ||
                (arrayTop[99] == 1 && arrayTop[0] == 1 && arrayTop[1] == 0 && ruleSet[4] == 1) ||
                (arrayTop[99] == 0 && arrayTop[0] == 1 && arrayTop[1] == 1 && ruleSet[5] == 1) ||
                (arrayTop[99] == 1 && arrayTop[0] == 0 && arrayTop[1] == 1 && ruleSet[6] == 1) ||
                (arrayTop[99] == 0 && arrayTop[0] == 1 && arrayTop[1] == 0 && ruleSet[7] == 1))
            {
               arrayBottom[0] = 0; //white
               g.drawRect(0*10, j*10, 10, 10); //white
            } 
            else
            {
               arrayBottom[0] = 1; //black
               g.fillRect(0*10, j*10, 10, 10); //black fill
               g.drawRect(0*10, j*10, 10, 10); //black outline
            }
            
            //This will makesure that for every loop the drawer 
            //makes, a new and completly unique color will be used
            int randomColor7 = (int)(Math.random()*256+0);
            int randomColor8 = (int)(Math.random()*256+0);
            int randomColor9 = (int)(Math.random()*256+0);
         
            g. setColor (new Color (randomColor7,randomColor8,randomColor9));
         
            //for indexes [1] through [98], these are the middle 98 boxes
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
                  g.drawRect(i*10, j*10, 10, 10); //white
               }
               else
               {
                  arrayBottom[i] = 1; //black
                  g.fillRect(i*10, j*10, 10, 10); //black fill
                  g.drawRect(i*10, j*10, 10, 10); //black outline
               }
            }
            
            //This will makesure that for every loop the drawer 
         //makes, a new and completly unique color will be used
            int randomColor10 = (int)(Math.random()*256+0);
            int randomColor11= (int)(Math.random()*256+0);
            int randomColor12 = (int)(Math.random()*256+0);
         
            g. setColor (new Color (randomColor10,randomColor11,randomColor12));
         
            //for index [99], this is the last box of the array
            if ((arrayTop[98] == 0 && arrayTop[99] == 0 && arrayTop[0] == 0 && ruleSet[0] == 1)||
             (arrayTop[98] == 1 && arrayTop[99] == 1 && arrayTop[0] == 1 && ruleSet[1] == 1)||
             (arrayTop[98] == 1 && arrayTop[99] == 0 && arrayTop[0] == 0 && ruleSet[2] == 1)||
             (arrayTop[98] == 0 && arrayTop[99] == 0 && arrayTop[0] == 1 && ruleSet[3] == 1)||
             (arrayTop[98] == 1 && arrayTop[99] == 1 && arrayTop[0] == 0 && ruleSet[4] == 1)||
             (arrayTop[98] == 0 && arrayTop[99] == 1 && arrayTop[0] == 1 && ruleSet[5] == 1)||
             (arrayTop[98] == 1 && arrayTop[99] == 0 && arrayTop[0] == 1 && ruleSet[6] == 1)||
             (arrayTop[98] == 0 && arrayTop[99] == 1 && arrayTop[0] == 0 && ruleSet[7] == 1))
            {
               arrayBottom[99] = 0; //white
               g.drawRect(99*10, j*10, 10, 10); //white
            } 
            else
            {
               arrayBottom[99] = 1; //black
               g.fillRect(99*10, j*10, 10, 10); //black fill
               g.drawRect(99*10, j*10, 10, 10); //black outline
            }
         
            for (int k = 0; k< arrayTop.length; k++)
            {
               arrayTop[k] = arrayBottom[k];
            }
         }
         delay(1000);//delay for the frame to be repainted
                     // the delay in this case will be for 1 second
         g. setColor (new Color (255,255,255));//the white repaint of the frame
         g.fillRect(0, 0, 1000, 1000);
         count++;//adds to the count for the amount 
                 //of times you want theis program to run
      }
      System.exit(0);//After all of the patterns are finished 
                     //this will automatically exit out of the program
   }
   //This allows for a delay when the frame is being repainted
   public static void delay(int n)
   {
      long startDelay = System.currentTimeMillis();
      long endDelay = 0;
      while(endDelay- startDelay < n)
         endDelay = System.currentTimeMillis();
   }
}