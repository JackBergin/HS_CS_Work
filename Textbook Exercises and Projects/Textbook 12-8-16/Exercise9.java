public class Exercise9
{
   public static void main(String[] args)
   {
      printTriangleType(8, 8, 8);
   }

   public static void printTriangleType(int a, int b, int c)
   {
           //Equilateral
      if( a == b && a == c && b == c)
      {
         System.out.println("Equilateral");
      }
           //Isosceles
      if ((a == b || a == c || b == c) && (a!=b || a!=c || b != c))
      {
         System.out.println("Isosceles");
      }
           //Scalene
      if(a != b && a != c && b !=c)
      {
         System.out.println("Scalene");
      }
   }
}
