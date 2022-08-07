/*****************************************
Java Project
*****************************************/

import java.awt.*;   //allows use of Color class

public class LocoMotive extends BoxCar
{
   //CONSTRUCTORS
   public LocoMotive(int x, int y)           //pass color like this: Color.yellow
   {                                    
      super(x,y);
      carColor = Color.darkGray;//Overriding the existing feild
   }
   
   //INSTANCE VARIABLES
   
   //METHOD: draws boxcar from xStart and yStart reference point
   public void drawLocoMotive(Graphics g)
   {
      drawBoxCar(g);
      
      g.fillRect(xStart+60,yStart-10,40,10); //cab
      
      Polygon stack = new Polygon(); //smoke stack
      stack.addPoint(xStart+10,yStart);
      stack.addPoint(xStart+10,yStart-15);
      stack.addPoint(xStart,yStart-22);
      stack.addPoint(xStart,yStart-32);
      stack.addPoint(xStart+30,yStart-32);
      stack.addPoint(xStart+30,yStart-22);
      stack.addPoint(xStart+20,yStart-15);
      stack.addPoint(xStart+20,yStart);
      stack.addPoint(xStart+10,yStart);
      g.fillPolygon(stack);
      
      Polygon scoop = new Polygon(); //scoop
      scoop.addPoint(xStart,yStart+40);
      scoop.addPoint(xStart,yStart+60);
      scoop.addPoint(xStart-30,yStart+60);
      g.fillPolygon(scoop);
   }
}
