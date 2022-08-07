public class FourLoop
{
   public static void main (String[] args)
   {

      for (int i =1; i<= 5; i++)
      { 
         for (int space =1; space<= i-1; space++)
         {
            System.out.print(" ");
         
         }
         for (int str = 1; str<= (11-i*2); str++)
         {
            System.out.print("*");
         }
         System.out.println();

      }
   }
}
