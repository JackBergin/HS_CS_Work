/*
File: Practice four loop
Programmer:Jack Bergin
Class: Comp sci
Date: 5/30/16
Description: Program introduce the concept of Objects
*/

import java.awt.*;

public class ButtonClassRunner
{
   public static void main (String[] args)
   {
      DrawingPanel panel = new DrawingPanel(1600,800);
      Graphics g = panel.getGraphics();
      
      ButtonClass button1 = new ButtonClass (g,100,0,100,50, Color.red, "I");
      button1.draw(g);
      
      ButtonClass button2 = new ButtonClass (g,100,100,100,50, Color.red, "Am");
      button2.draw(g);
      
      ButtonClass button3 = new ButtonClass (g,100,200,100,50, Color.red, "Iron");
      button3.draw(g);
      
      ButtonClass button4 = new ButtonClass (g,100,300,100,50, Color.red, "Man");
      button4.draw(g);
      
      ButtonClass button5 = new ButtonClass (g,100,400,100,50, Color.yellow, "I'M");
      button5.draw(g);
      
      ButtonClass button6 = new ButtonClass (g,100,500,100,50, Color.yellow, "BATMAN");
      button6.draw(g);
      
      ButtonClass button7 = new ButtonClass (g,100,600,100,50, Color.green, "HULK!");
      button7.draw(g);
      
      ButtonClass button8 = new ButtonClass (g,100,700,100,50, Color.green, "SMASH!!!");
      button8.draw(g);
   
   }
}

/*
This is a special type of class 
that just creates objects
*/

class ButtonClass
{
   //Create FEILDS/ATTRIBUTES
   int xStart;
   int yStart;
   int length;
   int width;
   double perimeter;
   double area;
   Color buttonColor;
   String buttonText;
   
   //Create CONSTRUCTORS (Sole pourpose is to assign values to FEILDS)
   
   //CONSTRUCTOR 1
   public ButtonClass(int l, int w)
   {
      xStart = 50;
      yStart = 50;
      length = l;
      width = w;
   }
   
   //CONSTRUCTOR 2
   public ButtonClass(int xS, int yS, int l, int w)
   {
      xStart = xS;
      yStart = yS;
      length = l;
      width = w;
   }
   
   //CONSTRUCTOR 3
   public ButtonClass(Graphics g, int xS, int yS, int l, int w, Color bC)
   {
      xStart = xS;
      yStart = yS;
      length = l;
      width = w;
      buttonColor = bC;
      g.setColor(buttonColor);
   }
   
   //CONSTRUCTOR 4
   public ButtonClass(Graphics g, int xS, int yS, int l, int w, Color bC, String bT)
   {
      xStart = xS;
      yStart = yS;
      length = l;
      width = w;
      buttonColor = bC;
      g.setColor(buttonColor);
      buttonText = bT;
      g.setFont(new Font("TimesRoman", Font.PLAIN, 20)); 
   }
   
   //Create METHODS
   public void draw(Graphics g)
   {
      //Draw Shadow
      g.setColor(Color.black);
      g. fillRect(xStart+10, yStart+10, length, width);
      //Draw Button
      g.setColor(buttonColor);
      g. fillRect(xStart, yStart, length, width);
      //Draw Text
      g.setColor(Color.black);
      g. drawString(buttonText, xStart+(length/6), yStart+(width/2) );
      

      
   }
}

