/**********************
Programmer: Jack Bergin
Class: Intro to comp. sci.
Date: 12/10/15
Description: DrawingPractice
************************/
//score = score (-*/+) x

import java.awt.*; //need to use DrawingPanel

public class DrawingPracticeTemplate
{
   public static void main (String[] args)
   {
   //add these two lines of code to use DrawingPanel
   DrawingPanel panel = new DrawingPanel (800,600);
   Graphics g = panel.getGraphics ();
   
   g. setColor(Color.red); 
   g. drawLine(200, 100, 240, 140);
   g. drawLine(400, 100, 440, 140);
   g. drawLine(200, 300, 240, 340);    
   g. drawLine(400, 300, 440, 340);   
   g. drawRect(200, 100, 200, 200);    
   g. drawRect(240, 140, 200, 200);

   //.............................
   System.out.println();
   //.............................
   
   g. drawOval(100, 100, 60, 60);
   g. drawOval(80, 80, 100, 100);
   g. drawOval(60, 60, 140, 140);
   g. drawOval(40, 40, 180, 180);
   g. drawOval(20, 20, 220, 220);
   
   //.............................
   System.out.println();
   //.............................
   
   g. drawLine(300, 300, 500, 300);
   g. drawLine(400, 100, 400, 300);
   g. drawLine(300, 300, 400, 100);
   g. drawLine(500, 300, 400, 100);
   g. drawLine(400, 200, 500, 300);
   g. drawLine(400, 200, 300, 300);
   g. drawLine(360, 180, 400, 200);
   g. drawLine(440, 180, 400, 200);
    
   //.............................
   System.out.println();
   //.............................
   
   g. drawOval(100, 100, 200, 300);
   g. drawOval(120,160, 60, 60);
   g. drawOval(220, 160, 60, 60);
   g. drawArc(110, 250, 180, 60, 180 ,180);
   g. drawArc(120, 150, 60, 20, -180 ,-180);
   g. drawArc(220, 150, 60, 20, -180 ,-180);
   g. drawOval(140,180, 20, 20);
   g. drawOval(240,180, 20, 20);
   
   //.............................
   System.out.println();
   //.............................

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

//drawOval(_,_,_,_);
//first number set determines where the 
//top left side of the shape is placed while 
//the second pair of numbers determines the 
//width and height of the shape.
//g. fillRect(60, 40, 120, 40);    
   //g. fillRect(100, 80, 40, 120);
   //g. fillRect(60, 160, 40, 40);
