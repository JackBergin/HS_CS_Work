/**********************
Programmer: Jack Bergin
Class: Intro to comp. sci.
Date: 12/10/15
Description: DrawingPractice
************************/
//score = score (-*/+) x

import java.awt.*; //need to use DrawingPanel

public class PolygonPractice
{
   public static void main (String[] args)
   {
   //add these two lines of code to use DrawingPanel
   DrawingPanel panel = new DrawingPanel (800,600);
   Graphics g = panel.getGraphics ();

   Polygon shape1 = new Polygon(); //shape1 can be named anything u want
                                   //enter the coordinates of all of the points. x and y
   shape1.addPoint(100,100); 
   shape1.addPoint(500,200); 
   shape1.addPoint(700,300); 
   shape1.addPoint(900,400); 
   shape1.addPoint(1200,500);
   
   g. drawPolygon(shape1); // connect the dots
   }
}