/*
Program: Mario Pixel Art Lab
Programmer: Jack Bergin
Date: 03/02/17

Description: This program uses 2d arrays to draw and manipulate a simple
"pixel art" image.
*/

import java.awt.*; //for Graphics class
import java.util.*; //for Arrays class

public class MarioDraw
{
   public static void main (String[] args)  
   {
      DrawingPanel panel = new DrawingPanel(1000,1000);
      Graphics g = panel.getGraphics();
      
      /*
      For this lab, I arbitrarily used the following numbers to correspond
      to the 7 colors used in the Mario pixel image:
         0 white
         1 black
         2 red
         3 blue
         4 yellow
         5 brown
         6 light brown
      */     
     
      //mario pixel image
      int[][] marioMatrix = {{0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                             {0,0,0,0,2,2,2,2,2,2,0,0,0,0},
                             {0,0,0,2,2,2,2,2,2,2,2,2,2,0},
                             {0,0,0,5,5,5,6,6,6,1,6,0,0,0},
                             {0,0,5,6,5,6,6,6,6,1,6,6,6,0},
                             {0,0,5,6,5,5,6,6,6,6,1,6,6,6},
                             {0,0,5,5,6,6,6,6,6,1,1,1,1,0},
                             {0,0,0,0,6,6,6,6,6,6,6,6,0,0},
                             {0,0,0,2,2,3,2,2,3,2,0,0,0,0},
                             {0,0,2,2,2,3,2,2,3,2,2,2,0,0},
                             {0,2,2,2,2,3,3,3,3,2,2,2,2,0},
                             {0,6,6,2,3,4,3,3,4,3,2,6,6,0},
                             {0,6,6,6,3,3,3,3,3,3,6,6,6,0},
                             {0,6,6,3,3,3,3,3,3,3,3,6,6,0},
                             {0,0,0,3,3,3,0,0,3,3,3,0,0,0},
                             {0,0,5,5,5,0,0,0,0,5,5,5,0,0},
                             {0,5,5,5,5,0,0,0,0,5,5,5,5,0},
                             {0,0,0,0,0,0,0,0,0,0,0,0,0,0}};
                            
      //1. prints out the 2d array
      System.out.println(Arrays.deepToString(marioMatrix));
      printMatrixToString(marioMatrix); //method call
     
      //2. prints out mario image to drawing panel
      //parameters: Graphics, array, grid size, start X, start Y, draw grid?
      drawArray(g, marioMatrix, 20, 100, 100, "yes");
     
     
      //3. reverses array and then prints out
      int [][] marioReverse = mirror(marioMatrix); //return method call
      drawArray(g, marioReverse, 20, 400, 100, "yes");
   
     
      //4. turns array upside down then prints out
      int [][] marioUpside = upsideDown(marioMatrix); //return method call
      drawArray(g, marioUpside, 20, 700, 100, "yes");
     
      //5. moves image across screen
      //move(g, marioMatrix, 20, 100, 100, "yes");
     
      //6. Switches color
      switchColor(g, marioMatrix, 20, 100, 500, "yes");
   }//end main method
  
  
   public static void move(Graphics g, int[][] matrix, int boxSize, int xStart, int yStart, String grid)
   {
      int xPos = xStart;
      int yPos = yStart;
     
      for (int i = 0; i <= 300; i++)
      {
         drawArray(g, matrix, boxSize, xPos, yPos, grid);
        
         xPos = xPos + 1;
         yPos = yPos + 0;
        
         delay(10);
        
         g.setColor(Color.white);
         g.fillRect(0,0,800,800);
      }
      System.exit(0);
   }
   //METHOD: Manipulates the image to reflect in the y direction
   public static int[][] mirror(int [][]matrix)
   {
      int [][]tempMatrix = new int [matrix.length][matrix[0].length]; 
   
      for (int i = 0; i < matrix.length; i++)
      {
         for(int j = 0; j < matrix[0].length; j++)
         {
            tempMatrix[i][(matrix[0].length-1)-j] = matrix[i][j];
         }
      }
      return tempMatrix;
   }  

   //METHOD: Manipulates the image to reflect in the x direction
   public static int [][] upsideDown(int[][] matrix)
   {
      int [][]tempMatrix = new int [matrix.length][matrix[0].length];
   
      for (int i = 0; i < matrix.length; i++)
      {
         for(int j = 0; j < matrix[0].length; j++)
         {
            tempMatrix[(matrix.length-1)-i][j] = matrix[i][j];
         }
      }
      return tempMatrix;
   }
  
   //METHOD: Color Switch
   public static void switchColor(Graphics g, int[][] matrix, int boxSize, int xStart, int yStart, String grid)
   {
      int xPos = xStart;
      int yPos = yStart;
     
      for (int row = 0; row < matrix.length; row++)
      {
         for (int col = 0; col < matrix[0].length; col++)
         {
            matrix[row][col]++;
            if (matrix[row][col] == 7) //white
            {
               g.setColor(Color.white);
               g.fillRect(xPos,yPos,boxSize,boxSize);
            }
           
            if (matrix[row][col] == 1) //black
            {
               g.setColor(Color.black);
               g.fillRect(xPos,yPos,boxSize,boxSize);
            }
           
            if (matrix[row][col] == 2) //red
            {
               g.setColor(Color.red);
               g.fillRect(xPos,yPos,boxSize,boxSize);
            }
           
            if (matrix[row][col] == 3) //blue
            {
               g.setColor(Color.blue);
               g.fillRect(xPos,yPos,boxSize,boxSize);
            }
           
            if (matrix[row][col] == 4) //yellow
            {
               g.setColor(Color.yellow);
               g.fillRect(xPos,yPos,boxSize,boxSize);
            }
           
            if (matrix[row][col] == 5) //brown
            {
               g.setColor(new Color(94,57,27));
               g.fillRect(xPos,yPos,boxSize,boxSize);
            }
           
            if (matrix[row][col] == 6) //light brown
            {
               g.setColor(new Color(234,192,134));
               g.fillRect(xPos,yPos,boxSize,boxSize);
            }
           
            if (grid.equals("yes")) //will draw grid if true
            {
               g.setColor(Color.black);
               g.drawRect(xPos,yPos,boxSize,boxSize);
            }
           
            xPos = xPos + boxSize;
         
         }//end inner loop
        
         xPos = xStart;
         yPos = yPos + boxSize;
      }//end outer loop
   }//end method
  
   public static void drawArray(Graphics g, int[][] matrix, int boxSize, int xStart, int yStart, String grid)
   {
      int xPos = xStart;
      int yPos = yStart;
     
      for (int row = 0; row < matrix.length; row++)
      {
         for (int col = 0; col < matrix[0].length; col++)
         {
            if (matrix[row][col] == 0) //white
            {
               g.setColor(Color.white);
               g.fillRect(xPos,yPos,boxSize,boxSize);
            }
           
            if (matrix[row][col] == 1) //black
            {
               g.setColor(Color.black);
               g.fillRect(xPos,yPos,boxSize,boxSize);
            }
           
            if (matrix[row][col] == 2) //red
            {
               g.setColor(Color.red);
               g.fillRect(xPos,yPos,boxSize,boxSize);
            }
           
            if (matrix[row][col] == 3) //blue
            {
               g.setColor(Color.blue);
               g.fillRect(xPos,yPos,boxSize,boxSize);
            }
           
            if (matrix[row][col] == 4) //yellow
            {
               g.setColor(Color.yellow);
               g.fillRect(xPos,yPos,boxSize,boxSize);
            }
           
            if (matrix[row][col] == 5) //brown
            {
               g.setColor(new Color(94,57,27));
               g.fillRect(xPos,yPos,boxSize,boxSize);
            }
           
            if (matrix[row][col] == 6) //light brown
            {
               g.setColor(new Color(234,192,134));
               g.fillRect(xPos,yPos,boxSize,boxSize);
            }
           
            if (grid.equals("yes")) //will draw grid if true
            {
               g.setColor(Color.black);
               g.drawRect(xPos,yPos,boxSize,boxSize);
            }
           
            xPos = xPos + boxSize;
         
         }//end inner loop
        
         xPos = xStart;
         yPos = yPos + boxSize;
      }//end outer loop
   }//end method
    
   //MATRIX: prints out matrix in nice format
   public static void printMatrixToString(int[][] matrix)
   {
      for (int row = 0; row < matrix.length; row++)
      {
         System.out.print("[" + matrix[row][0]); //fence post first number
        
         for (int col = 1; col < matrix[0].length; col++)
         {
            System.out.print(", " + matrix[row][col]);
         }
         System.out.println("]");
      }
   }
  
   //METHOD: adds delay to program
   public static void delay(int n)
   {
      long startDelay = System.currentTimeMillis();
      long endDelay = 0;
      while(endDelay - startDelay < n)
         endDelay = System.currentTimeMillis();
   }
}//end class