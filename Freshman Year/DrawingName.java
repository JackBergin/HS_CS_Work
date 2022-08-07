/**********************
Programmer: Jack Bergin
Class: Intro to comp. sci.
Date: 12/10/15
Description: DrawingPractice
************************/
//score = score (-*/+) x

import java.awt.*; //need to use DrawingPanel

public class DrawingName
{
   public static void main (String[] args)
   {
   //add these two lines of code to use DrawingPanel
   DrawingPanel panel = new DrawingPanel (800,600);
   Graphics g = panel.getGraphics ();
   
     
   g. setColor(new Color(153,0,255)); 
   g. fillRect(60, 40, 120, 40);    
   g. fillRect(100, 80, 40, 120);
   g. fillRect(60, 160, 40, 40);
   g. fillRect(200, 40, 120, 160);    
   g. setColor(Color.white); 
   g. fillRect(240, 80, 80, 80);
   g. setColor(Color.red); 
   g. fillRect(340, 40, 40, 160);
   g. setColor(Color.green); 
   g. fillRect(380, 40, 80, 160);
   g. setColor(Color.white); 
   g. fillRect(400, 60, 40, 40);
   g. fillRect(400, 140, 40, 40);



   }
}