import java.util.Scanner;
public class Changecalc {
public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Enter amount) ");
     double amount = input.nextDouble();
     int amountInt = (int) (amount * 100);

     double tmp;
     if(amount >= 100)
         {
         tmp = (int) amount/100;
         System.out.println (tmp + "$100 bills");
         amount = amount % 100;
         }
     if(amount >= 50)
         {
         tmp = (int) amount/50;
         System.out.println (tmp + "$50 bills");
         amount = amount % 50;
         }
    if(amount >= 20)
    {
        tmp = (int) amount/20;
        System.out.println (tmp + "$20 bills");
        amount = amount % 20;
    }
    if(amount >= 10)
    {
        tmp= (int) amount/10;
        System.out.println (tmp + "$10 bills");
        amount = amount % 10;
    }
    if(amount >= 5)
    {
        tmp = (int) amount/5;
        System.out.println (tmp + "$5 bills");
        amount = amount % 5;
    }
    if(amount >= 1)
    {
        tmp = (int) amount/1;
        System.out.println (tmp + "$1 bills");
        amount = amount % 1;
    }
    if(amount >= .25)
    {
        tmp = (int) amount/.25;
        System.out.println (tmp + "quater");
        amount = amount % .25;
    }
    if(amount >= .10)
    {
        tmp = (int) amount/.10;
        System.out.println (tmp + "dime");
        amount = amount % .10;
    }
    if(amount >= .05)
    {
        tmp = (int) amount/.05;
        System.out.println (tmp + "nickel");
        amount = amount % .05;
    }
    if(amount >= .01)
    {
        tmp = (int) amount/.01;
        System.out.println (tmp + "penny");
        amount = amount % 01;
    }
}
}
