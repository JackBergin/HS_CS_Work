/*****************************************
Java Project
*****************************************/

import java.awt.*;   //allows use of Color class

public class Caboose extends BoxCar
{
   //CONSTRUCTORS
   public Caboose(int x, int y)           //pass color like this: Color.yellow
   {                                     //or: new Color(R,G,B) 
      super(x,y);
      carColor = Color.red;//Overriding the existing feild
   }
   
   //INSTANCE VARIABLES
   
   //METHOD: draws boxcar from xStart and yStart reference point
   public void drawCaboose(Graphics g)
   {
      g. setColor(carColor);
      drawBoxCar(g); 
      
      g.setColor(carColor);
      g.fillRect(xStart+20,yStart-8, 60,8);
      g.fillRect(xStart+15,yStart-12, 70,4);
     
      g.setColor(Color.white);
      g.fillRect(xStart+20,yStart+15, 20,20);
      g.fillRect(xStart+60,yStart+15, 20,20);
   }
}
