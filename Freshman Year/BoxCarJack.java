/*
Name:Jack Bergin
Block:E 
Class: Comp Sci
Date: 4/4/16
I am # 15
*/ 


import java.awt.*;   //allows use of Color class

public class BoxCarJack
{
   //ATTRIBUTES
   int xStart;
   int yStart;
   
   //CONTRUCTORS
   public BoxCarJack(int x, int y)
   {
      xStart = x;
      yStart = y;
   }
   
   //METHOD FOR DRAWING YOUR TRAINCAR
   public void drawBoxCar(Graphics g)
   {
      g.setColor(Color.black);      
      g.fillOval(xStart,yStart+30,30,30);
      g.fillOval(xStart+30,yStart+30,30,30);  
      g.fillOval(xStart+60,yStart+30,30,30);  
      g.fillOval(xStart+90,yStart+30,30,30);
      g.fillOval(xStart+120,yStart+30,30,30);    
      g.fillRect(xStart+35,yStart-15,115,10);
      
      g. setColor (new Color (94,76,35)); 
      g.fillRect(xStart+35,yStart-15,50,20);
      
      g. setColor (new Color (0,110,35)); 
      g.fillRect(xStart,yStart,150,40);
           
      
      g.setColor(Color.black);               //wheels
      g. setFont(new Font ("TimesRoman", Font.PLAIN, 20));
      g.drawString("USA",xStart+40,yStart+20);
   }
}

