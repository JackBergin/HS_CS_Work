import java.util.Scanner;

public class SpareChangeCalculator
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("How much did it cost ");
      double cost = input.nextDouble();
      System.out.println("How much did you pay with?");
      double pay = input.nextDouble();
     
      double amount = pay-cost;

     if(amount >= 100)
      {
         amount = amount % 100;
         System.out.println (amount + " $100 bills");
      }
      else
      {

     if(amount >= 20)
      {
         amount = amount % 20;
         System.out.println (amount + " $20 bills");
      }
      else
      {

      if(amount >= 10)
      {
         amount = amount % 10;
         System.out.println (amount + " $10 bills");
      }
      else
      {
         if(amount >= 5)
         {
            amount = amount % 5;
            System.out.println (amount + " $5 bills");
         }
         else
         {
            if(amount >= 1)
            {
               amount = amount % 1;
               System.out.println (amount + " $1 bills");
            }
            else
            {
               if(amount >= .25)
               {
                  amount = amount % .25;
                  System.out.println (amount + " quater");
               }
               else
               {
                  if(amount >= .10)
                  {
                     amount = amount % .10;
                     System.out.println (amount + " dime");
                  }
                  else
                  {
                     if(amount >= .05)
                     {
                        amount = amount % .05;
                        System.out.println (amount + " nickel");
                     }
                     else
                     {
                        if(amount >= .01)
                        {
                           amount = amount % 01;
                           System.out.println (amount + " penny");
                        }
                     }
                  }
               }
            }
         }
      }
   }
}
}
}
