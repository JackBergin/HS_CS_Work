/**********************
Programmer: Jack Bergin
Class: Intro to comp. sci.
Date: 12/10/15
Description: DrawingPractice
************************/

import java.awt.*; //need to use DrawingPanel

public class FinalDraw
{
   public static void main (String[] args)
   {
   //add these two lines of code to use DrawingPanel
   DrawingPanel panel = new DrawingPanel (800,800);
   Graphics g = panel.getGraphics ();
   //Sky:
   g. setColor (new Color (102,153,255)); 
   g. fillRect(0, 0, 1000, 1000);
      
   //Sign/Poster:  
   g. setColor (new Color (80,0,0)); 
   g. fillRect(0, 300, 800, 400);
   g. setColor (new Color (0,0,0)); 
   g. fillRect(0, 300, 800, 60);

   g. setColor (new Color (255,255,255)); 
   g. fillRect(520, 340, 280, 140);
   g. setColor (new Color (204,204,0)); 
   g. fillRect(540, 360, 80, 100);
   g. setColor (new Color (255,255,255)); 
   g. fillRect(560, 380, 60, 40);
   g. fillRect(560, 420, 20, 20);
   g. setColor (new Color (204,204,0)); 
   g. fillRect( 640, 360, 80, 100);
   g. setColor (new Color (255,255,255));
   g. fillRect( 660, 380, 40, 60);
   g. setColor (new Color (204,204,0)); 
   g. fillRect(760, 360, 80, 100);
   g. setColor (new Color (255,255,255)); 
   g. fillRect(780, 380, 80, 60);
   
   //Feild Goal:
   g. setColor (new Color (255,243,0)); 
   g. fillRect(335, 360, 40, 280);
   g. fillRect(120, 360, 490, 40);
   g. fillRect(80, 0, 40, 400);
   g. fillRect(600, 0, 40, 400);

   //Ground:
   g. setColor (new Color (90,162,0)); 
   g. fillRect(0, 640, 800, 500);

   //Netting:
   g. setColor (new Color (255,255,255)); 
   g. drawLine (210, 450, 353, 642);
   g. drawLine (500,450, 353, 642);
   
   g. drawLine (210, 450, 353, 642);
   g. drawLine (500,450, 353, 642);
   g. drawLine (210, 450, 353, 642);
   g. drawLine (500,450, 353, 642);
     
      g. setColor (new Color (255,255,255));
      for(int k = 3; k<=75; k++)
      {
      g. drawLine(200+k*4, 450, 200+k*4, 730);
      }
      
       g. setColor (new Color (255,255,255));
      for(int k = 3; k<=72; k++)
      {
      g. drawLine(500, 440+k*4, 200, 440+k*4);
      }
  
     g. setColor (new Color (90,162,0)); 
   Polygon shape3 = new Polygon(); 
   
   
   shape3.addPoint(219,737); 
   shape3.addPoint(489,737); 
   shape3.addPoint(354,643); 
   
   g. fillPolygon(shape3);
   
   //Crease:
   g. setColor (new Color (255,255,255)); 
   g. drawOval (150, 640, 400, 150);
   
   //Net:
   g. setColor (new Color (255,159,0)); 
   g. fillRect(200, 440, 300, 10);
   g. fillRect(200, 440, 10, 300);
   g. fillRect(500, 440, 10, 300);
   g. setColor (new Color (255,255,255));
   g. fillOval(340, 680, 20, 20);
   g. setColor (new Color (255,159,0)); 
 
   Polygon shape1 = new Polygon(); 
   
   shape1.addPoint(200,740);
   shape1.addPoint(220,740); 
   shape1.addPoint(360,640); 
   shape1.addPoint(340,640); 
   
   g. fillPolygon(shape1); 
   
   Polygon shape2 = new Polygon(); 
   
   shape2.addPoint(490,740); 
   shape2.addPoint(510,740); 
   shape2.addPoint(370,640); 
   shape2.addPoint(350,640); 

   g. fillPolygon(shape2); 

   }
}


   /*
   Polygon shape1 = new Polygon(); 
   
   
   shape1.addPoint(200,100); 
   shape1.addPoint(100,200); 
   shape1.addPoint(100,300); 
   shape1.addPoint(300,300); 
   shape1.addPoint(300,200);
   
   g. fillPolygon(shape1); 
   g. setColor(Color.green); 
   g. fillRect(0, 300, 800, 1000); 
   */   