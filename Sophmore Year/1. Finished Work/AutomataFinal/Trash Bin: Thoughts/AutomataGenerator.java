import java.awt.*; 
import java.util.*;

public class AutomataGenerator
{
   public static void main (String[] args)
   {
      //add these two lines of code to use DrawingPanel
      DrawingPanel panel = new DrawingPanel (1000,800);
      Graphics g = panel.getGraphics ();
      
      int[] arrayTop = new int[50];

      //FIRST ROW
   
      for(int i = 0; arrayTop.length > i; i++)
      {
         int count = (int)(Math.random()*2+0);
          
         arrayTop[i] = count;
         
         int x = 0;
         
         //0 = white 
         //1 = black
         
         //White
         for(int d = 0; arrayTop.length > d; d++)
         {
            if(arrayTop[d] == 0)
            {
               g. setColor (new Color (0,0,0)); 
               g. drawRect(x, 0, 20, 20);
            }
         //Black
            if(arrayTop[d] == 1)
            {
               g. setColor (new Color (0,0,0)); 
               g. fillRect(x, 0, 20, 20);
               g. drawRect(x, 0, 20, 20);
            }
            x = x+20;
         }
      }
      //SECOND ROW

      int[] arrayBott = new int [50];
      int x = 0;
      //For index [0]
      if (arrayTop[49] == 0 && arrayTop[0] == 0 && arrayTop[1] == 0)
      {
         arrayBott[0] = 0;
         g. setColor (new Color (0,0,0)); 
         g. drawRect(x, y, 20, 20);
         x=x+20;
      }
      else
      {
         if(arrayTop[49] == 1 && arrayTop[0] == 1 && arrayTop[1] == 1)
         {
            arrayBott[0] = 0;
            g. setColor (new Color (0,0,0)); 
            g. drawRect(x, y, 20, 20);
            x=x+20;
         }
         else
         {
            arrayBott[0] = 1;
            g. setColor (new Color (0,0,0)); 
            g. fillRect(x, y, 20, 20);
            g. drawRect(x, y, 20, 20);
            x=x+20;
         }
      }
   
      //For index [1] through [48]
      for (int i = 1; i<arrayBott.length - 1; i++)
      {
         if (arrayTop[i-1] == 0 && arrayTop[i] == 0 && arrayTop[i+1] == 0)
         {
            arrayBott[i] = 0;//White
            g. setColor (new Color (0,0,0)); 
            g. drawRect(x, y, 20, 20);
            x=x+20;
         }
         else
         {
            if(arrayTop[i-1] == 1 && arrayTop[i] == 1 && arrayTop[i+1] == 1)
            {
               arrayBott[i] = 0;//Black
               g. setColor (new Color (0,0,0)); 
               g. drawRect(x, y, 20, 20);
               x=x+20;
            }
            else
            {
               arrayBott[i] = 1;
               g. setColor (new Color (0,0,0)); 
               g. fillRect(x, y, 20, 20);
               g. drawRect(x, y, 20, 20);
               x=x+20;
            }
         }
      }
        //For index [49]
      if (arrayTop[0] == 0 && arrayTop[49] == 0 && arrayTop[48] == 0)
      {
         arrayBott[49] = 0;
         g. setColor (new Color (0,0,0)); 
         g. drawRect(x, y, 20, 20);
         x=x+20;
      }
      else
      {
         if(arrayTop[49] == 1 && arrayTop[0] == 1 && arrayTop[48] == 1)
         {
            arrayBott[49] = 0;
            g. setColor (new Color (0,0,0)); 
            g. drawRect(x, y, 20, 20);
            x=x+20;
         
         }
         else
         {
            arrayBott[49] = 1;
            g. setColor (new Color (0,0,0)); 
            g. fillRect(x, y, 20, 20);
            g. drawRect(x, y, 20, 20);
            x=x+20;
         }
      }
      }  
   }
}
