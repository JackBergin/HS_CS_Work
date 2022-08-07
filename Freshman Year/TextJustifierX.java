/*
Programmer: Jack Bergin
Date: 5/9/16
Block: E
Description: Last unit "Grade" until
the progress reports come out.
*/

public class TextJustifierX
{
   public static void main(String[] args)
   {
      String thisis = "Hello, my name is Jack Christopher Bergin";
      
      centerJustify(thisis);
   
   }
   
   public static void centerJustify(String thisis)
   {
      int length = thisis.length();
      int spaces = (80-length)/2;
      
      for(int j = 1; j <= spaces; j++)
      {
         System.out.print(" ");
      }
      System.out.println(thisis);
   }

   /*public static void rulerTop()
   {
   
      for (int k = 1; k <=8; k++)
      {
         System.out.print("1234567890");
      }
      System.out.println();
   }
   public static void centerJustify(String my)
   {
      int length = my.length();
      int spaces = (80-length)/2;
      
      for(int j = 1; j <= spaces; j++)
      {
         System.out.print(" ");
      }
      System.out.println(my);
   }
   public static void rightJustify(String my) 
   {
      int length = my.length();
      int spaces = (118-length)/2;
      
      for(int j = 1; j <= spaces; j++)
      {
         System.out.print(" ");
      }
      System.out.println(my);
   }
   */
}