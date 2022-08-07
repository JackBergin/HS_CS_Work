import java.util.Scanner;

public class SpareChange
{
   public static void main (String[] args)
   {
      Scanner console = new Scanner(System.in);
      
      System.out.println("How much did it cost ");
      double cost = console.nextDouble();
      
      System.out.println("How much did you pay with?");
      double pay = console.nextDouble();
      
      double difference = pay - cost;
     
      double spare = changeCalc(difference);
      System.out.println(spare);
   }
   public static double changeCalc (double change)
   {
      if(change >= 100)
      {
         double oneHundred = change/100;
         return oneHundred;
      }
}
}
