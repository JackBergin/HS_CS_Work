/*
Source File Name: TheHouseofJack
Programmer:Jack Bergin
Class:AP Computer Science
Date:09/14/16
Description:This program uses method calls to get rid of 
repetitiveness and make everything more efficient.
*/


public class TheHouseOfJack
{
     public static void main (String[] args)
     {
         String thisis = "This is the ";
         
    	 System.out.print("    "+thisis + "house that Jack built.");
    	 System.out.println();
    	 System.out.println("           "+thisis + "malt");
    	 jack();
    	 System.out.println();
    	 System.out.println("            "+thisis + "rat");
    	 mault();
    	 jack();     
    	 System.out.println();
    	 System.out.println("            "+thisis + "cat");
    	 rat();
    	 mault();
    	 jack(); 
     	 System.out.println(); 
     	 System.out.println("            "+thisis + "dog,"); 
     	 cat();
     	 rat();
     	 mault();
     	 jack(); 
     	 System.out.println();
     	 System.out.println("  "+thisis + "cow with the crumpled horn,");
     	 dog();
     	 cat();
     	 rat();
     	 mault();
     	 jack(); 
     	 System.out.println();
     	 System.out.println("     "+thisis + "maiden all forlorn");
     	 cow();
     	 dog();
     	 cat();
     	 rat();
     	 mault();
     	 jack(); 
     	 System.out.println();
     }
     public static void jack()
     {
         System.out.println("  That lay in the house that Jack built."); 
     }
     public static void mault()
     {
         System.out.println("           That ate the malt");
     }
     public static void rat()
     {
         System.out.println("          That killed the rat,");
     }
     public static void cat()
     {
         System.out.println("          That worried the cat,"); 
     }
     public static void dog()
     {
         System.out.println("          That tossed the dog,"); 
     }
     public static void cow()
     {
         System.out.println("That milked the cow with the crumpled horn,"); 
     }
}