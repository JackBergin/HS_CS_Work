public class Rectangle
{
   public static void main (String [] args)
   {
     drawBox(8,6); 
   }
   
   public static void drawBox(int height, int width)
   {
      for (int i = 1; i<= width; i++)
      {
         System.out.print("* ");
      }
      System.out.println();
      
      for (int j = 1; j<= height-2; j++)
      {
         System.out.print("* ");
         for (int k = 1; k<= width-2; k++)
         {
            System.out.print("  ");
         }
            System.out.print("* ");
            System.out.println();
       
      }
      for (int l = 1; l<= width;l++)
      {
         System.out.print("* ");
      }
    }
}