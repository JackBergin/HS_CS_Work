/*
Name of Program: Additions
Programmer: Jack Bergin
Class Block: E
Date Completed: 1/24/17
Description of what program does:
Each method will possibly find somthing 
good with your password and will go 
to the passwords rated complexity.
*/

public class Additions 
{
   //Uppercase
   public static int numbOfUppercase(String pW, int pL)
   {
      int count = 0;
      
      for (int i = 0; i < pL; i++)
      {
         String eachLetter = pW.substring(i, i+1);
         
         boolean greaterThanA = eachLetter.compareTo("A") >=0;
         boolean lessThanZ = eachLetter.compareTo("Z") <=0;
          
         if (greaterThanA && lessThanZ)
         {
            count = count + 1;  
         }      
      }
      return count;
   }
  
   //Lowercase
   public static int numbOfLowercase(String pW, int pL)
   {
      int count = 0;
      
      for (int i = 0; i < pL; i++)
      {
         String eachLetter = pW.substring(i, i+1);
      
         boolean greaterThanA = eachLetter.compareTo("a") >=0;
         boolean lessThanZ = eachLetter.compareTo("z") <=0;
          
         if (greaterThanA && lessThanZ)
         {
            count = count + 1;  
         }      
      }
      return count;
   }
   
   //Numbers
   public static int numbOfNumbers(String pW, int pL)
   {
      int count = 0;
      
      for (int i = 0; i < pL; i++)
      {
         String eachLetter = pW.substring(i, i+1);
         
         boolean greaterThanA = eachLetter.compareTo("0") >=0;
         boolean lessThanZ = eachLetter.compareTo("9") <=0;
          
         if (greaterThanA && lessThanZ)
         {
            count = count + 1;  
         }      
      }
      return count;
   }
   
   //Symbols
   public static int numbOfSymbols(String pW, int pL)
   {
      int count = 0;
      
      for (int i = 0; i < pL; i++)
      {
         String eachLetter = pW.substring(i, i+1);
         
         boolean greaterThanSpace = eachLetter.compareTo(" ") >=0;
         boolean lessThanSpace = eachLetter.compareTo("/") <=0;
      
         boolean greaterThanColon = eachLetter.compareTo(":") >=0;
         boolean lessThanColon = eachLetter.compareTo("@") <=0;
      
         boolean greaterThanBracket = eachLetter.compareTo("[") >=0;
         boolean lessThanBracket = eachLetter.compareTo("`") <=0;
         
         boolean greaterThanBrace = eachLetter.compareTo("{") >=0;
         boolean lessThanBrace = eachLetter.compareTo("~") <=0;
          
         if (greaterThanSpace && lessThanSpace || 
         greaterThanColon && lessThanColon || 
         greaterThanBracket && lessThanBracket || 
         greaterThanBrace && lessThanBrace)
         {
            count = count + 1;  
         }      
      }
      return count;
   }
   
   //Mid Symbols and Numbers
   public static int numbOfMid(String pW, int pL)
   {
      int count = 0;
      
      for (int i = 1; i < pL-1; i++)
      {
         String eachLetter = pW.substring(i, i+1);
         
         boolean greaterThanA = eachLetter.compareTo("0") >=0;
         boolean lessThanZ = eachLetter.compareTo("9") <=0;
      
         boolean greaterThanSpace = eachLetter.compareTo("!") >=0;
         boolean lessThanSpace = eachLetter.compareTo("/") <=0;
      
         boolean greaterThanColon = eachLetter.compareTo(":") >=0;
         boolean lessThanColon = eachLetter.compareTo("@") <=0;
      
         boolean greaterThanBracket = eachLetter.compareTo("[") >=0;
         boolean lessThanBracket = eachLetter.compareTo("`") <=0;
         
         boolean greaterThanBrace = eachLetter.compareTo("{") >=0;
         boolean lessThanBrace = eachLetter.compareTo("~") <=0;
          
         if (greaterThanA && lessThanZ||
         greaterThanSpace && lessThanSpace|| 
         greaterThanColon && lessThanColon || 
         greaterThanBracket && lessThanBracket || 
         greaterThanBrace && lessThanBrace)
         {
            count = count + 1;  
         }      
      }
      return count;
   }
   //Requirements
   public static int Requirements(String pW, int pL, int uC, int lC, int S, int N)
   {
      int count = 0;
      if (pL>=8)
      {
         count++;
      }
      if (uC>0)
      {
         count++;
      }
      if (lC>0)
      {
         count++;
      }
      if (S>0)
      {
         count++;
      }
      if (N>0)
      {
         count++;
      }
      return count;
   }
}