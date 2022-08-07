// Practice Java Concepts

public class PageSeparator
{
	public static void main(String[] args)
	{
      pageSeparator('*',80,5); //1st what symbol, 2nd how many, 3rd, how many lines
   }
   
   public static void pageSeparator(char symbol, int numberOfSymbol, int lines)
   {
      for (int i = 1; i <= lines; i++)
      {
          for (int j = 1; j <= numberOfSymbol; j++)
          {
             System.out.print(symbol);
          }
          System.out.println();   
      }    
   }
}