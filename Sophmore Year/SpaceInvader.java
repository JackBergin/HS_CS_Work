//THE SHATTERED LANDS RPG V.1.0

import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

@SuppressWarnings("serial")
public class SpaceInvader extends JPanel 
{
   int xSpot = 850, ySpot = 850, velX = 0, velY = 0;
	
   public SpaceInvader() 
   {
		KeyListener listener = new MyKeyListener();
		addKeyListener(listener);
		setFocusable(true);
	}
	
	public static void main(String[] args) 
   {
		JFrame frame = new JFrame("Space Invaders 1");
		SpaceInvader spaceInvader = new SpaceInvader();
		frame.add(spaceInvader);
		frame.setSize(2000, 1000);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
  
   public void paint (Graphics g) //replaces main method
   {        
      super.paint(g);
      g. setColor(Color.black);
      g.fillRect(0,0,2000,1000);
      g.setColor(Color.green);
      //The blocades
      g.fillRect(50,700,200,50);
      g.fillRect(550,700,200,50);
      g.fillRect(1050,700,200,50);
      g.fillRect(1550,700,200,50);
      g.fillRect(2050,700,200,50);
      
      //The shooter sprite
      g.fillRect(xSpot, ySpot,100,20);
      g.fillRect(xSpot+40, ySpot-20,20,20);

      repaint();
      xSpot = xSpot + velX;
      ySpot = ySpot + velY;
   }
   
	public class MyKeyListener implements KeyListener 
   {
		@Override
		public void keyTyped(KeyEvent e) 
      {
		
      }
		@Override
		public void keyPressed(KeyEvent e) 
      {
			if (e.getKeyCode() == KeyEvent.VK_LEFT)
         {velX = -1;}
         if (e.getKeyCode() == KeyEvent.VK_RIGHT)
			{velX = 1;}
         //if (e.getKeyCode() == KeyEvent.VK_DOWN)
			//{velY = 1;}
         //if (e.getKeyCode() == KeyEvent.VK_UP)
			//{velY = -1;}
		}

		@Override
		public void keyReleased(KeyEvent e) 
      {
			velX = 0;
         velY = 0;
		}
	}
}