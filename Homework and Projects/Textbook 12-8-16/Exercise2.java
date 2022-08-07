public class Exercise2
{
   public static void main(String[] args)
   {
      printTriangleType("hello", 3);
   }
   public static void printTriangleType(String word, int times)
   {
   //Will run until the number of times is equal to i giving 
   //us the output “hellohellohello”
      for(int i = 1; i <= times; i++)
      {
         System.out.print(word);
      }
      System.out.println();
   }
}
