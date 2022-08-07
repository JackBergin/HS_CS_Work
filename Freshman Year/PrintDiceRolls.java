import java.util.Scanner;

public class PrintDiceRolls
{                  
   public static void main (String[] args) 
   {   
         int number = 1;
         String response = "";           
         Scanner input = new Scanner (System.in);
         System.out.println("1 or 2 (1=Dice Roll or 2=Coin Flip)");
         int raNum2=0; 
         int choice = input.nextInt();

         if (choice == 1)
         {
         int raNum; 
         for(int i=1; i<=2; i++)
         {
         raNum = (int)(Math.random()*6+1);
         
         if(raNum == 1)
         {
         System.out.println("   ___________" );
         System.out.println("  /           /|" );
         System.out.println(" /           / |" );
         System.out.println("+-----------+  |" );
         System.out.println("|    _      |  |" );
         System.out.println("|     |     |  |" );
         System.out.println("|     |     |  /" );
         System.out.println("|     |     | /" );
         System.out.println("|    ---    |/" );
         System.out.println("+-----------+ " );
         System.out.println();

         }
         if(raNum == 2)
         {
         System.out.println("   ___________" );
         System.out.println("  /           /|" );
         System.out.println(" /           / |" );
         System.out.println("+-----------+  |" );
         System.out.println("|  ------+  |  |" );
         System.out.println("|        |  |  |" );
         System.out.println("|  +-----+  |  /" );
         System.out.println("|  |        | /" );
         System.out.println("|  +-----+  |/" );
         System.out.println("+-----------+ " );
         System.out.println();
         }
         if(raNum == 3)
         {
         System.out.println("   ___________" );
         System.out.println("  /           /|" );
         System.out.println(" /           / |" );
         System.out.println("+-----------+  |" );
         System.out.println("|    __     |  |" );
         System.out.println("|   /  \\    |  |" );
         System.out.println("|      /    |  /" );
         System.out.println("|      \\    | /" );
         System.out.println("|   \\__/    |/" );
         System.out.println("+-----------+ " );
         System.out.println();
         }
         if(raNum == 4)
         {
         System.out.println("   ___________" );
         System.out.println("  /           /|" );
         System.out.println(" /           / |" );
         System.out.println("+-----------+  |" );
         System.out.println("|  |    |   |  |" );
         System.out.println("|  |    |   |  |" );
         System.out.println("|  +----|   |  /" );
         System.out.println("|       |   | /" );
         System.out.println("|       |   |/" );
         System.out.println("+-----------+ " );
         System.out.println();
         }
         if(raNum == 5)
         {
         System.out.println("   ___________" );
         System.out.println("  /           /|" );
         System.out.println(" /           / |" );
         System.out.println("+-----------+  |" );
         System.out.println("|  +------  |  |" );
         System.out.println("|  |        |  |" );
         System.out.println("|  +-----+  |  /" );
         System.out.println("|        |  | /" );
         System.out.println("|  ------+  |/" );
         System.out.println("+-----------+ " );
         System.out.println();
         }
         if(raNum == 6)
         {
         System.out.println("   ___________" );
         System.out.println("  /           /|" );
         System.out.println(" /           / |" );
         System.out.println("+-----------+  |" );
         System.out.println("|  +------  |  |" );
         System.out.println("|  |        |  |" );
         System.out.println("|  +-----+  |  /" );
         System.out.println("|  |     |  | /" );
         System.out.println("|  +-----+  |/" );
         System.out.println("+-----------+ " );
         System.out.println();
         }
         
            if (choice == 2)
            {
            for(int k=1; k<=2; k++)
           {
           raNum2 = (int)(Math.random()*6+1);
        
           if (raNum2 == 3)
           {
           System.out.println("    *   *    " );
           System.out.println(" * _______ * " );
           System.out.println("*     |     *" );            
           System.out.println("*     |     *" );
           System.out.println("*     |     *" );
           System.out.println(" *    |    * " );
           System.out.println("    *   *    " );
           System.out.println();
           }
           if (raNum2 == 2)
           {
           System.out.println("    *  *    " );
           System.out.println(" * |    | * " );
           System.out.println("*  |    |  *" );            
           System.out.println("*  |----|  *" );
           System.out.println("*  |    |  *" );
           System.out.println(" * |    | * " );
           System.out.println("    *  *    " );
           System.out.println();
            }
            }
            }
            }
         while (response.equals ("Yes")|| response.equals("yes") );

         }
         } 
   }
         
            
    
      



       
   
