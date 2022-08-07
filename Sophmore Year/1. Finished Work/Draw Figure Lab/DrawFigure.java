
public class DrawFigure 
{
   public static final int hight = 5;

   public static void main(String[] args) 
   {
      drawLine();
      drawTop();
      drawBottom();
      drawLine();
   }
   //This will make the line that closes the box at the top
   public static void drawLine() 
   {
      System.out.print("+");
      for (int i = 1; i <= (2 * hight); i++) 
      {
         System.out.print("-");
      }
      System.out.println("+");
   }
   // This little blerb will create the top half of the hr glass
   public static void drawTop()   
   {
      for (int line = 1; line <= hight; line++) 
      {
         System.out.print("|");
         for (int a = 1; a <= (line - 1); a++) 
         {
            System.out.print(" ");
         }
      
         System.out.print("\\");
         int dots = 2 * hight - 2 * line;
         
         for (int b = 1; b <= dots; b++) 
         {
            System.out.print(".");
         }
      
         System.out.print("/");
         for (int c = 1; c <= (line - 1); c++) 
         {
            System.out.print(" ");
         }
         System.out.println("|");
      }
   }
   // This blerb is just like the prior but will print the bottom half of the hr glass figure
   public static void drawBottom() 
   {
      for (int line = 1; line <= hight; line++) 
      {
         System.out.print("|");
         for (int d = 1; d <= (hight - line); d++) 
         {
            System.out.print(" ");
         }
      
         System.out.print("/");
         for (int e = 1; e <= 2 * (line - 1); e++) 
         {
            System.out.print(".");
         }
      
         System.out.print("\\");
         for (int f = 1; f <= (hight -line); f++) 
         {
            System.out.print(" ");
         }
         System.out.println("|");
      }
   }
}
