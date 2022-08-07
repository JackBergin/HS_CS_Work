/**********************
Programmer: Jack Bergin
Class: Intro to comp. sci.
Date: 12/10/15
Description: This is to practice drawing in Java
************************/

import java.awt.*; //imports "abstract windows tools" library

public class Drawingjava
{
     public static void main (String[] args)
   {
      DrawingPanel panel = new DrawingPanel (800, 600);
      Graphics g = panel.getGraphics();
   
      g. setColor(Color.orange);
      g. drawRect(50, 50, 100, 75);  
      g. setColor(Color.blue);  
      g. drawRect(50, 50, 50, 40);
      g. setColor(Color.red);
      g. drawRect(50, 50, 25, 16);
      g. setColor(Color.green); 
      g. drawRect(50, 50, 12, 8);  
                         
   }


}
