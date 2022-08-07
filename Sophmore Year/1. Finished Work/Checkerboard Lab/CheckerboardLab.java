/*
Project Name: CheckerboardLab
Programmer: Jack Bergin
Class: Computer Science
Date: 11/18/16
Description: Generates a drawing of a checkerboard
*/

import java.awt.*; //need to use DrawingPanel

public class CheckerboardLab
{
   public static void main (String[] args)
   {
      //add these two lines of code to use DrawingPanel
      DrawingPanel panel = new DrawingPanel (800,800);
      Graphics g = panel.getGraphics ();
      
      //These variables will define the placement 
      //of the squares that make up the checkerboard 
      //and eventually the ovals/pawns
      int group;   
      int period;   
      int x;
      int y; 
      
      //This sets some of the squares on the checkerboard to red
      g. setColor(Color.red);
      g. fillRect(0,0,800,800);
      
      //This will do the checkerboard
      for ( group = 0;  group < 8;  group++ ) 
      {
         for ( period = 0;  period < 8;  period++) 
         {
            x = period * 100;
            y = group * 100;
            
            if ( (group % 2) == (period % 2) )
            {
               g.setColor(Color.red);
            }
            else
            {
               g.setColor(Color.black);
               g.fillRect(x, y, 100, 100);
            }
         }  
      } 
      //This will be the first set of circles
      for ( group = 0;  group < 3;  group++ ) 
      {
         for ( period = 0;  period < 8;  period++) 
         {
            x = period * 100;
            y = group * 100;
            if ( (group % 2) == (period % 2))
            {
               g.setColor(Color.red);
               g.fillOval(x, y, 100, 100);
            }
            else
            {
               g.setColor(Color.blue);
               g.fillOval(x, y, 100, 100);
            }
         }
      }
      //This will be the second set of circles
      for ( group = 5;  group < 8;  group++ ) 
      {
         for ( period = 0;  period < 8;  period++) 
         {
            x = period * 100;
            y = group * 100;
            if ( (group % 2) == (period % 2))
            {
               g.setColor(Color.red);
               g.fillOval(x, y, 100, 100);
            }
            else
            {
               g.setColor(Color.green);
               g.fillOval(x, y, 100, 100);
            } 
         }
      }
   }
}