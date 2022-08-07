/*
Programmer: Jack Bergin
Class: Int. to Comp Sci
Date: 3/28/16
*/

import java.awt.*;

public class RandomShapes
{
   public static void main(String[] args) 
   {
      DrawingPanel panel = new DrawingPanel(1000,800);
      Graphics g = panel.getGraphics(); 
     
      for(int k=1; k <= 500; k++)
      {
         int x1 = (int)(Math.random()*1000); 
         int y1 = (int)(Math.random()*800); 
         int x2 = (int)(Math.random()*1000); 
         int y2 = (int)(Math.random()*800); 
         
         int a = (int)(Math.random()*256); 
         int b = (int)(Math.random()*256); 
         int c = (int)(Math.random()*256);  
         
         Color randomColor = new Color(a,b,c);
         g.setColor(randomColor);
         
         g.drawLine(x1,y1,x2,y2);
      }
   
      
      for(int k=1; k <= 2000; k++)
      {
         int x1 = (int)(Math.random()*1000); 
         int y1 = (int)(Math.random()*800); 
         int x2 = (int)(Math.random()*30+10); 
         
         int a = (int)(Math.random()*256); 
         int b = (int)(Math.random()*256); 
         int c = (int)(Math.random()*256);  
         
         Color randomColor = new Color(a,b,c);
         g.setColor(randomColor);
         
         g.drawRect(x1,y1,x2,x2);
      
      }     
      for(int k=1; k <= 100; k++)
      {
         int x1 = (int)(Math.random()*1000); 
         int y1 = (int)(Math.random()*800); 
         int x2 = (int)(Math.random()*30+10);  
         
         int a = (int)(Math.random()*256); 
         int b = (int)(Math.random()*256); 
         int c = (int)(Math.random()*256);  
         
         Color randomColor = new Color(a,b,c);
         g.setColor(randomColor);
         
         g.drawOval(x1,y1,x2,x2);
      }
      /*
      for(int k=1; k <= 1000000; k++)
      {
         int x1 = (int)(Math.random()*1000); 
         int y1 = (int)(Math.random()*800); 
         int x2 = (int)(Math.random()*20+10);  
         
         int a = (int)(Math.random()*256); 
         int b = (int)(Math.random()*256); 
         int c = (int)(Math.random()*256);  
      
         g. setColor(Color.red); 
      
         
         g.fillOval(x1,y1,x2,x2);
      }
      for(int k=1; k <= 5000; k++)
      {
         int x1 = (int)(Math.random()*1000); 
         int y1 = (int)(Math.random()*800); 
         int x2 = (int)(Math.random()*700+100);  
         int y2 = (int)(Math.random()*500+10);
         int x3 = (int)(Math.random()*360);  
         int y3 = (int)(Math.random()*-180);
         
         int a = (int)(Math.random()*256); 
      
         
         Color randomColor = new Color(a);
         g.setColor(randomColor);
         
         g.drawArc(x1,y1,x2,y2,x3,y3);
      }   
      for(int k=1; k <= 100; k++)
      {
         int x1 = (int)(Math.random()*1000); 
         int y1 = (int)(Math.random()*800); 
         int x2 = (int)(Math.random()*10+10);  
         
         int a = (int)(Math.random()*256); 
         int b = (int)(Math.random()*256); 
         int c = (int)(Math.random()*256);  
         
         g. setColor(Color.red); 
      
         
         g.fillOval(x1,y1,x2,x2);
      }
   
      for(int k=1; k <= 250; k++)
      {
         int x1 = (int)(Math.random()*1000); 
         int y1 = (int)(Math.random()*800); 
         int x2 = (int)(Math.random()*1000); 
         int y2 = (int)(Math.random()*800); 
         
         int a = (int)(Math.random()*256); 
         int b = (int)(Math.random()*256); 
         int c = (int)(Math.random()*256);  
         
         g. setColor (new Color (255,255,255)); 
         
         g.drawLine(x1,y1,x2,y2);
      }
      for(int k=1; k <= 500; k++)
      {
         int x1 = (int)(Math.random()*1000); 
         int y1 = (int)(Math.random()*800); 
         int x2 = (int)(Math.random()*700+100);  
         int y2 = (int)(Math.random()*500+10);
         int x3 = (int)(Math.random()*360);  
         int y3 = (int)(Math.random()*-180);
         
         int a = (int)(Math.random()*256); 
      
         
         g. setColor (new Color (255,255,0)); 
      
         
         g.drawArc(x1,y1,x2,y2,x3,y3);
      }
      for(int k=1; k <= 500; k++)
      {
         int x1 = (int)(Math.random()*1000); 
         int y1 = (int)(Math.random()*800); 
         int x2 = (int)(Math.random()*700+100);  
         int y2 = (int)(Math.random()*500+10);
         int x3 = (int)(Math.random()*360);  
         int y3 = (int)(Math.random()*-180);
         
         int a = (int)(Math.random()*256); 
      
         
         g. setColor(Color.black); 
      
         
         g.drawArc(x1,y1,x2,y2,x3,y3);
      }
      */
   }
}
