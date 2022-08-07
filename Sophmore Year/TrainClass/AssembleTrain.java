/*****************************************
Java Project
*****************************************/

import java.awt.*;   //allows use of Color class

public class AssembleTrain
{
	//FIELDS
   int xStart;
   int yStart;
   int numberOfTrains;   
   //CONSTRUCTORS
   public AssembleTrain(int x, int y, int nC)     
   {                                      
      xStart = x;
      yStart = y;
      numberOfTrains = nC;
   }
   
   //INSTANCE VARIABLES
   
   //METHOD: draws boxcar from xStart and yStart reference point
   public void assembleTrain(Graphics g)
   {
      //1. Add one locomotive
      LocoMotive loco = new LocoMotive(xStart, yStart);
      loco.drawLocoMotive(g);
      
      xStart = xStart + 110;
      yStart = yStart + 0;
      
      //2. Add the number of box cars      
      for(int i = 1; i <= numberOfTrains; i++)
      {
         BoxCar box = new BoxCar (xStart, yStart);
         box.drawBoxCar(g);
         
         xStart = xStart + 110;
         yStart = yStart + 0;
      }
      
      //3. Add one caboose at the end
      Caboose boose = new Caboose (xStart, yStart);
      boose.drawCaboose(g);
   }
}//ends the sequance of classes used