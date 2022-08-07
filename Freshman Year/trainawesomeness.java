/*
Programmer: Jack Bergin
Class: Int. to Comp Sci
Date: 3/28/16
*/

import java.awt.*;

public class RunnerForBoxCarJack
{
   public static void main(String[] args) 
   {
      DrawingPanel panel = new DrawingPanel(1000,800);
      Graphics g = panel.getGraphics();
      
      BoxCarJack car1 = new BoxCarJack(100,150);
      car1.drawBoxCar(g);         
   }
}
