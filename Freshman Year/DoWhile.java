/*
This program is to guess the number of 
the computer that is generated.
*/

import java.util.Scanner;

public class DoWhile
{                  
   public static void main (String[] args) 
   { 
    Scanner input = new Scanner(System.in);
        
        int pick = (int)(Math.random()*10+1);

    System.out.println(pick);
       }
}      