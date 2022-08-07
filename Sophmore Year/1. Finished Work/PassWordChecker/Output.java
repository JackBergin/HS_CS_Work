/*
Name of Program: Output
Programmer: Jack Bergin
Class Block: E
Date Completed: 1/24/17
Description of what program does:
This program prints out every method 
defined in driver, additions and 
subtractions while also 
finishing the product and printing out 
an organized table for password checker. 
It also gives you the strength of a 
password a user can enter in.
*/

import java.util.*;

public class Output
{
   public static void main(String[]args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the password you want to be tested for strenght: ");
      String password = input.nextLine();
      int passLength = password.length();
      
      //First line is the vairable for the score and the second 
      //line is a variable for the bonus
      //Number count
      int numCharScore = Driver.calcNumCharactersScore(passLength);
      int numCharBonus = Driver.calcNumCharactersBonus(passLength);
      
      //Number of Caps
      int upperCaseLettersScore = Driver.calcUpperCaseLettersScore(password, 
            passLength);
      int upperCaseLettersBonus = Driver.calcUpperCaseLettersBonus(password, 
            passLength);
      
      //Number of lowercase
      int lowerCaseLetterScore = Driver.calcLowerCaseLettersScore(password, 
            passLength);
      int lowerCaseLetterBonus = Driver.calcLowerCaseLettersBonus(password,
            passLength);
      
      //Number of numbers
      int numberScore = Driver.calcNumberCountScore(password, passLength);
      int numberBonus = Driver.calcNumberCountBonus(password, passLength);
      
      //Number of Symbol
      int symbolScore = Driver.calcSymbolCountScore(password, passLength);
      int symbolBonus = Driver.calcSymbolCountBonus(password, passLength);
      
      //Number of middle numbers
      int middleNumberScore = Driver.calcMiddleNumSymbolCountScore(password, 
            passLength);
      int middleNumberBonus = Driver.calcMiddleNumSymbolCountBonus(password, 
            passLength);
      
      //Number of satisfied requirements
      int requirementsScore = Driver.calcRequirementsScore( password,  
            passLength, upperCaseLettersScore, lowerCaseLetterScore,  
            symbolScore,  numberScore) ;
      int requirementsBonus = Driver.calcRequirementsBonus( password,  
            passLength,upperCaseLettersScore, lowerCaseLetterScore,  
            symbolScore, numberScore) ;
      
      //Deductions
      //Letters Only
      int lettersOnlyScore = Driver.calclettersOnlyScore(password, passLength);
      int lettersOnlyBonus = Driver.calclettersOnlyBonus(password, passLength);
      
      //Numbers only
      int numbersOnlyScore = Driver.calcNumbersOnlyScore(password, passLength);
      int numbersOnlyBonus = Driver.calcNumbersOnlyBonus(password, passLength);
      
      //Consec Upper
      int consecUpperScore = Driver.calcConsecUpperCaseScore(password, 
            passLength);
      int consecUpperBonus = Driver.calcConsecUpperCaseBonus(password, 
            passLength);
      
      //Consec Lower
      int consecLowerScore = Driver.calcConsecLowerCaseScore(password, 
            passLength);
      int consecLowerBonus = Driver.calcConsecLowerCaseBonus(password, 
            passLength);
      
      //Consec Numbers
      int consecNumberScore = Driver.calcConsecNumbersScore(password, 
            passLength);
      int consecNumberBonus = Driver.calcConsecNumbersBonus(password, 
            passLength);
      
      //Sequential Numbers
      int sequencNumberScore = Driver.calcSequenNumbersScore( password, 
            passLength);
      int sequencNumberBonus = Driver.calcSequenNumbersBonus( password, 
            passLength);
      
      //Sequential Letters
      int sequencLetterScore = Driver.calcSequenLettersScore( password,  
            passLength);
      int sequencLetterBonus = Driver.calcSequenLettersBonus( password,  
            passLength);
      
      //Sequential Symbols
      //int sequenceSymbolsScore = Driver.calcSequenSymbolsScore(password, 
      //passLength);
      //int sequenceSymbolsBonus = Driver.calcSequenSymbolsBonus(password,
      //passLength);
   
      
      int totalScore = numCharScore + upperCaseLettersScore + 
         lowerCaseLetterScore + numberScore + symbolScore + 
         middleNumberScore + requirementsScore+ lettersOnlyScore + 
         numbersOnlyScore+ consecUpperScore + consecLowerScore + 
         consecNumberScore + sequencNumberScore+sequencLetterScore;
         //+ sequenceSymbolsScore;
      
      int totalBonus = numCharBonus + upperCaseLettersBonus + 
         lowerCaseLetterBonus + numberBonus +symbolBonus + middleNumberBonus+ 
         requirementsBonus + lettersOnlyBonus + numbersOnlyBonus+
         consecUpperBonus + consecLowerBonus + consecNumberBonus + 
         sequencNumberBonus + sequencLetterBonus ;
         //+ sequenceSymbolsBonus;
      
      //This entire nested if else statement is 
      //used to determine the strength of a password
      if(totalBonus >101)
      {
         totalBonus = 100;
      }
   
      System.out.println("Password: " + password);
      System.out.println("Score: "+totalBonus +"%");
      String complexity = "";
      if (totalBonus <= 19)
      {
         complexity = "Very Weak";
      }
      else
      {
         if (40>totalBonus && totalBonus>20)
         {
            complexity = "Weak";
         }
         else
         {
            if(60>totalBonus&&totalBonus>39)
            {
               complexity = "Good";
            }
            else
            {
               if(80>totalBonus&&totalBonus>59)
               {
                  complexity = "Strong";
               }
               else
               {
                  if(101>totalBonus&&totalBonus>79)
                  {
                     complexity = "Very Strong";
                  }
                      
               }
            }
         }
      }
      
      System.out.println("Complexity: " +complexity);
      System.out.println();
      System.out.println("Additions:                          Score:	  Bonus:");					
      System.out.print("01. Number of Characters              ");	
      System.out.println(numCharScore+"\t\t\t "+ numCharBonus);
      
      //Driver.numCharacters(passLength);
      
      System.out.print("02. Uppercase Letters		           ");
      System.out.println(upperCaseLettersScore+"\t\t\t "+ upperCaseLettersBonus);
      
      System.out.print("03. Lowercase Letters		           ");
      System.out.println(lowerCaseLetterScore+"\t\t\t "+ lowerCaseLetterBonus);
      
      System.out.print("04. Numbers                           ");		
      System.out.println(numberScore+"\t\t\t "+ numberBonus);
      			
      System.out.print("05. Symbols                           ");
      System.out.println(symbolScore+"\t\t\t "+ symbolBonus);
      						
      System.out.print("06. Middle Numbers or Symbols         ");	
      System.out.println(middleNumberScore+"\t\t\t "+middleNumberBonus);
            		
      System.out.print("07. Requirements					        ");
      System.out.println(requirementsScore+"\t\t\t " +requirementsBonus);
      
      System.out.println();
      System.out.println("Deductions:				              Score:		 Bonus:");
      System.out.print("08. Letters Only                      ");			
      System.out.println(lettersOnlyScore+"\t\t\t"+lettersOnlyBonus);
   
      System.out.print("09. Numbers Only                      ");	
      System.out.println(numbersOnlyScore+"\t\t\t"+numbersOnlyBonus);
      
      System.out.print("10. Repeat Characters (skip)          ");
      System.out.println("x"+"\t\t\t"+"x");
      
      System.out.print("11. Consecutive Uppercase Letters     ");	
      System.out.println(consecUpperScore+"\t\t\t"+consecUpperBonus);
      
      System.out.print("12. Consecutive Lowercase Letters     ");	
      System.out.println(consecLowerScore+"\t\t\t"+consecLowerBonus);
     
      System.out.print("13. Consecutive Numbers               ");	
      System.out.println(consecNumberScore+"\t\t\t"+consecNumberBonus);
         
      System.out.print("14. Sequential Letters                ");
      System.out.println(sequencLetterScore+"\t\t\t"+sequencLetterBonus);
   
      System.out.print("15. Sequential Numbers                ");
      System.out.println(sequencNumberScore+"\t\t\t"+sequencNumberBonus);
   
      System.out.print("16. Sequential Symbols                ");
      System.out.println("x"+"\t\t\t"+"x");
            
      System.out.println();
      System.out.println("Total Bonus: "+totalBonus);
   }
}