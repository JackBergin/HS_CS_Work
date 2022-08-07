import java.util.Scanner;

public class TriangleTest
{
   static boolean end = true;
  
   public static void main (String [] args)
   {
      do
      {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the following values:");
     
         System.out.println("Side A: ");
         int sideA = input.nextInt(); 
     
         System.out.println("Side B: ");
         int sideB = input.nextInt();  
     
         System.out.println("Side C: ");
         int sideC = input.nextInt();   
     
         printOut(sideA, sideB, sideC); 
      }
      while (end == false);
      System.out.println("Thank your for your time."); 
   }
   public static void printOut(double a, double b, double c)
   {
      System.out.println("Your Triangle:");
        
      System.out.println("Side A: " + a);
      System.out.println("Side B: " + b);     
      System.out.println("Side C: " + c);
  
      double heron = calculateArea(a, b, c);
        
      System.out.println("The area is: " + heron);
       
      boolean rightTriangle = isRightTriangle(a, b, c);
     
      if (rightTriangle == false)
      {
         System.out.println("The triangle is not right");
      }
      else
      {
         System.out.println("The triangle is right");
      }
     
      System.out.println("Would you like to enter another triangle? (y/n)");
      Scanner console = new Scanner(System.in);
      String answer = console.nextLine();
      if (answer.equals("y"))          
      {
         end = false;
      }
      else
      {
         end = true;
      }
   }
  
   public static double calculateArea(double a, double b, double c)
   {
      double s = (a+b+c)/2;
      double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
      return area;
   }
   public static boolean isRightTriangle(double a, double b, double c)
   {
      if(Math.abs(a*a + b*b - c*c) < 0.2)
         return true;
      if(Math.abs(a*a + c*c - b*b) < 0.2)
         return true;
      if(Math.abs(c*c + b*b - a*a) < 0.2)
         return true;
      else
         return false;
   }
}


