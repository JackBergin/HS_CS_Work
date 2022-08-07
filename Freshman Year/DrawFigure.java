public class DrawFigure 
{
   public static void main(String[] args) 
   {
      int count=10;
      
      System.out.print("Hello");
      blankSpace(count);
      System.out.print("Hello"); 
   }
   
   public static void blankSpace (int count)
   {
      for(int i = 1; i <= count; i++)
      {
         System.out.print(" ");
      }
   }
}