/*
File: Practice four loop
Programmer:Jack Bergin
Class: Comp sci
Date: 1/25/16

Description: Programm is for creating four loops
*/
import java.awt.*;

public class Fourloop
{
   public static void main (String[] args)
   {
       {
   //add these two lines of code to use DrawingPanel
   DrawingPanel panel = new DrawingPanel (800,800);
   Graphics g = panel.getGraphics();
      //Horozontal line
      g. setColor (new Color (255,0,0));
      for(int i = 400; i<=800; i+=10)
      {
      g. drawLine(i, 0, i, 300);
      }
      //Verticle line
      g. setColor (new Color (0,255,0));
      for(int k = 0; k<=300; k+=10)
      {
      g. drawLine(400, k, 0, k);
      }
      //Box in a box
      g. setColor (new Color (0,0,255));
      for(int j = 0; j<=140; j+=10)
      {
      g. drawRect(0+j,300+j, 400-2*j, 300-2*j);
      } 
      

      }
   }
}

/*      for(int i = 1; i<=50; i++) 
      {
      for(int k = 1; k<=i; k++) 
      {
      System.out.print("*");
      }
      System.out.println();
*/
