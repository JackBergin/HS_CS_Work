/*****************************************
Java Project
*****************************************/

import java.awt.*;   //allows use of Color class

public class BoxCar
{
	//FIELDS
   int xStart;
   int yStart;
   Color carColor;
   
   //CONSTRUCTORS
   public BoxCar(int x, int y)           //pass color like this: Color.yellow
   {                                     //or: new Color(R,G,B) 
      xStart = x;
      yStart = y;
      carColor = Color.blue;
      
   }
   
   //INSTANCE VARIABLES
   
   //METHOD: draws boxcar from xStart and yStart reference point
   public void drawBoxCar(Graphics g)
   {
      g.setColor(carColor);                  //body
      g.fillRect(xStart,yStart,100,60);
      
      g.setColor(Color.black);               //wheels
      g.fillOval(xStart+5,yStart+45,30,30);  
      g.fillOval(xStart+65,yStart+45,30,30);  
   }
}
