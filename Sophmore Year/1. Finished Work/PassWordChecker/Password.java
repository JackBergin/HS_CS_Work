
import java.util.*;

public class Password
{
   public static void main (String []args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the password you want to be tested for strenght: ");
      String password = input.nextLine();
      
      int passLength = password.length();
      
      System.out.println();
      System.out.println("Additions:");
      //Addition:
      //1. Num of characters
      int numbOfCharacters = passLength;
      int bounuNumberOfCharacters = passLength*4;
      
      //2. Uppercase Letters
      int numbOfUppercase = numbOfUppercase(password, passLength); //return method call 
      int bonusNumbOfUppercase = (passLength-numbOfUppercase)*2;
      System.out.println("This is uppercase: "+numbOfUppercase);
     
      //3. Lowercase Letters
      int numbOfLowercase = numbOfLowercase(password, passLength); //return method call 
      int bonusnumbOfLowercase = (passLength-numbOfLowercase)*2;
      System.out.println("This is lowercase: "+numbOfLowercase);
      
      //4.Numbers 
      int numbOfNumbers = numbOfNumbers(password, passLength); //return method call 
      int bonusNumbOfNumbers = (numbOfNumbers)*4;
      System.out.println("This is the amount of numbers: "+numbOfNumbers);
      
      //5. Symbols
      int numbOfSymbols = numbOfSymbols(password, passLength); //return method call 
      int bonusnumbOfSymbols = (numbOfSymbols)*6;
      System.out.println("This is the amount of symbols: "+numbOfSymbols);
      
      //6. Middle numbers or symbols
      int numbOfMid = numbOfMid(password, passLength); //return method call 
      int bonusNumbOfMid = (numbOfMid)*2;
      System.out.println("This is the amount of mid symbols or numbers: "+numbOfMid);
   
      
      //7. Requirements
      int Requirements = Requirements(password, passLength); //return method call 
      int bonusRequirements = (Requirements)*2;
      System.out.println();
      System.out.println("Deductions:");
      
      //Deductions
      //1. Letters Only
      int numbOfLettersOnly = numbOfLettersOnly(password, passLength); //return method call 
      int bonusNumbOfLettersOnly = (numbOfLettersOnly)*2;
      System.out.println("All Lettes: "+numbOfLettersOnly);
   
      //2. Numbers Only
      int numbOfNumbersOnly = numbOfNumbersOnly(password, passLength); //return method call 
      int bonusNumbOfNumbersOnly = (numbOfNumbersOnly)*2;
      System.out.println("All Numbers: "+numbOfNumbersOnly);
   }
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
   public static int Requirements(String pW, int pL)
   {
      int count = 0;
      if(pL > 8)
      {
          count++;
      }
      for (int i = 0; i < pL; i++)
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
   //Deductions-----------------------------------------------------------------------------------------
   //All Letters
   public static int numbOfLettersOnly(String pW, int pL)
   {
      int count = 0;
      int dumb = 0;
      
      for (int i = 0; i < pL; i++)
      {
         String eachLetter = pW.substring(i, i+1);
         
         boolean greaterThanA = eachLetter.compareTo("A") >=0;
         boolean lessThanZ = eachLetter.compareTo("Z") <=0;
         boolean greaterThana = eachLetter.compareTo("a") >=0;
         boolean lessThanz = eachLetter.compareTo("z") <=0;
          
         if (greaterThanA && lessThanZ||greaterThana && lessThanz)
         {        
            count = count + 1;  
         }      
      }
      if(count == pL)
      {
         return count;
      }
      else 
      {
         return dumb;
      }
   }
   
   //All Numbers
   public static int numbOfNumbersOnly(String pW, int pL)
   {
      int count = 0;
      int dumb = 0;
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
      if(count == pL)
      {
         return count;
      }
      else 
      {
         return dumb;
      }   
   }
}