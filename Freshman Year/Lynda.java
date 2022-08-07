import java.util.Scanner;

public class Lynda
{
   public static void main(String[] args) 
   {
   int firstArg = 0;
   if (args.legnth > 0) 
   {
   try 
   {
   firstArg = Integer.parseInt (args[0]);
   } 
   catch(NumberFormatExecption e)
   {
   System.err.println("Arguement" + args[0] + "must be an integer");
   System.exit(1);
   }
      
      
   }
}