import java.awt.*;

public class MazeProjectJack
{
   //class variables (can be used in all methods)
   public static int xPos = 0;
   public static int yPos = 0;
   public static int xStart = 100;
   public static int yStart = 100;

   public static void main(String[] args)
   {
      DrawingPanel panel = new DrawingPanel(1000,800);
      Graphics g = panel.getGraphics();
      
      //This section draws the maze (created by Brendan)
      BackGround.draw(g,panel,Color.white); //change maze color if you want
      BackGround.guidePath(g); //if you want, draws a guide to show the path to follow
      
      //**START YOUR CODE HERE**
      moveStraight(g);
      moveCircle(g,100);
      moveStraight2(g);
   }
//CODE STARTS HERE.................................................................................................
   public static void moveStraight (Graphics g)
   {
      for (int k=0; k<=620; k++)
      {
         //1. Calculate the x and y points
         xPos = xStart;
         yPos = yStart + k;
         
         //2. Draw method
         draw(g,xPos,yPos);
         
         //3. delayMethod
         delay(5);
         
         //4. Erase Method
         erase (g,xPos, yPos);
      
      }
      for (int k=0; k<=200; k++)
      {
         //1. Calculate the x and y points
         xPos = 100 + k;
         yPos = 750;
         
         //2. Draw method
         draw(g,xPos,yPos);
         
         //3. delayMethod
         delay(5);
         
         //4. Erase Method
         erase (g,xPos, yPos);
      
      }
      for (int k=0; k<=250; k++)
      {
         //1. Calculate the x and y points
         xPos = 300;
         yPos = 750 - k;
         
         //2. Draw method
         draw(g,xPos,yPos);
         
         //3. delayMethod
         delay(5);
         
         //4. Erase Method
         erase (g,xPos, yPos);
      }
      for (int k=0; k<=200; k++)
      {
         //1. Calculate the x and y points
         xPos = 300 + k;
         yPos = 500;
         
         //2. Draw method
         draw(g,xPos,yPos);
         
         //3. delayMethod
         delay(5);
         
         //4. Erase Method
         erase (g,xPos, yPos);
      }
      for (int k=0; k<=200; k++)
      {
         //1. Calculate the x and y points
         xPos = 500;
         yPos = 500 - k;
         
         //2. Draw method
         draw(g,xPos,yPos);
         
         //3. delayMethod
         delay(5);
         
         //4. Erase Method
         erase (g,xPos, yPos);
      }
      for (int k=0; k<=200; k++)
      {
         //1. Calculate the x and y points
         xPos = 500-k;
         yPos = 300;
         
         //2. Draw method
         draw(g,xPos,yPos);
         
         //3. delayMethod
         delay(5);
         
         //4. Erase Method
         erase (g,xPos, yPos);
      }
      for (int k=0; k<=200; k++)
      {
         //1. Calculate the x and y points
         xPos = 300;
         yPos = 300-k;
         
         //2. Draw method
         draw(g,xPos,yPos);
         
         //3. delayMethod
         delay(5);
         
         //4. Erase Method
         erase (g,xPos, yPos);
      }
      for (int k=0; k<=500; k++)
      {
         //1. Calculate the x and y points
         xPos = 300+k;
         yPos = 100;
         
         //2. Draw method
         draw(g,xPos,yPos);
         
         //3. delayMethod
         delay(5);
         
         //4. Erase Method
         erase (g,xPos, yPos);
      }
      
      }
    public static void moveCircle(Graphics g, int radius)
   {
      for (int k=0; k<=350; k++)
      {
         //1. Calculate the x and y points
         xPos = 820 +(int)(radius*Math.cos(Math.toRadians(k)));
         yPos = 200 +(int)(radius*Math.sin(Math.toRadians(k)));
         
         //2. Draw method
         draw(g,xPos,yPos);
         
         //3. delayMethod
         delay(5);
         
         //4. Erase Method
         erase (g,xPos, yPos);
   }


    }
    public static void moveStraight2 (Graphics g)
   {
      for (int k=0; k<=250; k++)
      {
         //1. Calculate the x and y points
         xPos = 925;
         yPos = 220 + k;
         
         //2. Draw method
         draw(g,xPos,yPos);
         
         //3. delayMethod
         delay(5);
         
         //4. Erase Method
         erase (g,xPos, yPos);
      
      }
      for (int k=0; k<=250; k++)
      {
         //1. Calculate the x and y points
         xPos = 925-k;
         yPos = 500+k;
         
         //2. Draw method
         draw(g,xPos,yPos);
         
         //3. delayMethod
         delay(5);
         
         //4. Erase Method
         erase (g,xPos, yPos);
      
      }
      for (int k=0; k<=200; k++)
      {
         //1. Calculate the x and y points
         xPos = 675-k;
         yPos = 775;
         
         //2. Draw method
         draw(g,xPos,yPos);
         
         //3. delayMethod
         delay(5);
         
         //4. Erase Method
         erase (g,xPos, yPos);
      
      }
      for (int k=0; k<=101; k++)
      {
         //1. Calculate the x and y points
         xPos = 510;
         yPos = 775-k;
         
         //2. Draw method
         draw(g,xPos,yPos);
         
         //3. delayMethod
         delay(5);
         
         //4. Erase Method
         erase (g,xPos, yPos);
      }
   }
   
   //draws the shape
   public static void draw(Graphics g, int xPos, int yPos)
   {
      g.setColor(Color.white);
      g.drawRect(xPos,yPos,30,30);
   }
   
   //erases the previously drawn shape
   public static void erase(Graphics g, int xPos, int yPos)
   {
      g.setColor(Color.black);
      g.drawRect(xPos,yPos,30,30);
   }
   
   //delays the drawing of the white/erase shape
   public static void delay(int n)
   {
      long startDelay = System.currentTimeMillis();
      long endDelay = 0;
      while(endDelay- startDelay < n)
         endDelay = System.currentTimeMillis();
   }  
   
}
//CoDE ENDS HERE....................................................................................................

// This section programmed by the one and only Brendan Geary
class BackGround
{
   public static void draw(Graphics g, DrawingPanel panel)
   {
      panel.setBackground(Color.black);
      /*Draws obstacles*/
      g.setColor(Color.white);
      g.drawRect(0,0,999,799);
      g.drawRect(1,1,997,797);
      g.fillRect(200,0,25,625);
      g.fillRect(200,400,200,25);
      g.fillRect(400,200,200,25);
      g.fillRect(600,200,25,425);
      g.fillRect(400,600,200,25);
      g.fillRect(400,600,25,400);
      /*Starting Point*/
      g.setColor(Color.red);
      g.fillRect(75,75,50,50);
      
      /*Finish point*/
      g.setColor(Color.blue);
      g.fillRect(485,650,50,50);
      
      /*Draws triangles*/
      g.setColor(Color.white);
      Polygon p1 = new Polygon();
      Polygon p2 = new Polygon();
      
      p1.addPoint(600,425);
      p1.addPoint(900,425);
      p1.addPoint(600,750);
      
      g.fillPolygon(p1);
      
      p2.addPoint(1000,500);
      p2.addPoint(1000,800);
      p2.addPoint(750,800);
      
      g.fillPolygon(p2);
   }
   public static void draw(Graphics g, DrawingPanel panel, Color c1)
   {
      panel.setBackground(Color.black);
      /*Draws obstacles*/
      g.setColor(c1);
      g.drawRect(0,0,999,799);
      g.drawRect(1,1,997,797);
      g.fillRect(200,0,25,625);
      g.fillRect(200,400,200,25);
      g.fillRect(400,200,200,25);
      g.fillRect(600,200,25,425);
      g.fillRect(400,600,200,25);
      g.fillRect(400,600,25,400);
      /*Starting Point*/
      g.setColor(Color.red);
      g.fillRect(75,75,50,50);
      
      /*Finish point*/
      g.setColor(Color.blue);
      g.fillRect(485,650,50,50);
      
      /*Draws triangles*/
      g.setColor(c1);
      Polygon p1 = new Polygon();
      Polygon p2 = new Polygon();
      
      p1.addPoint(600,425);
      p1.addPoint(900,425);
      p1.addPoint(600,750);
      
      g.fillPolygon(p1);
      
      p2.addPoint(1000,500);
      p2.addPoint(1000,800);
      p2.addPoint(750,800);
      
      g.fillPolygon(p2);
   }
   public static void guidePath(Graphics g)
   {
      g.setColor(Color.yellow);
      g.drawLine(100,100,100,750);
      g.drawLine(100,750,300,750);
      g.drawLine(300,750,300,500);
      g.drawLine(300,500,500,500);
      g.drawLine(500,500,500,300);
      g.drawLine(500,300,300,300);
      g.drawLine(300,300,300,100);
      g.drawLine(300,100,825,100);
      g.drawOval(725,100,200,200);
      g.drawLine(925,200,925,500);
      g.drawLine(925,500,675,775);
      g.drawLine(510,775,675,775);
      g.drawLine(510,775,510,675);
   }
}