/*
Name of Program: Driver
Programmer: Jack Bergin
Class Block: E
Date Completed: 1/24/17
Description of what program does: 
This defines all of the additions and 
subtractions methods and makes them into 
two integers; bonus and score so that the 
output can print out add and do whatever 
to these values
*/

import java.util.*;

public class Driver
{

   public static int totalScore = 0;
   public static int bonusScore = 0;
         
   //Addition:
   //1. Num of characters     
   //Calculate the score for the number of characters
   public static int calcNumCharactersScore(int passLength)
   {
      return passLength;
   }

   // Caculate the bonus associated with the number of characters
   public static int calcNumCharactersBonus(int passLength)
   {
      return passLength*4;
   }   
     
   //2. Uppercase Letters
   //All this method does is find the bonus and regular 
   //score for the needed requirement
   public static int calcUpperCaseLettersScore(String password, int passLength) 
   {
      return Additions.numbOfUppercase(password, passLength);
      //This will return an int to output for it to be added and then printed
   }
   
   public static int calcUpperCaseLettersBonus(String password, int passLength)
   {
      int numbOfUppercase = Additions.numbOfUppercase(password, passLength);
      return (passLength-numbOfUppercase)*2;
      //This will return an int to output for it to be added and then printed
   }
  
   //3. Lowercase Letters
   public static int calcLowerCaseLettersScore(String password, int passLength) 
   {
      return Additions.numbOfLowercase(password, passLength);
   }
   
   public static int calcLowerCaseLettersBonus(String password, int passLength)
   {
      int numbOfLowercase = Additions.numbOfLowercase(password, passLength);
      return (passLength-numbOfLowercase)*2;
   }

   
   //4.Numbers
   public static int calcNumberCountScore(String password, int passLength) 
   {
      return Additions.numbOfNumbers(password, passLength);
   }
   
   public static int calcNumberCountBonus(String password, int passLength)
   {
      int numbOfNumbers = Additions.numbOfNumbers(password, passLength);
      return (numbOfNumbers)*4;
   }

   //5. Symbols
   public static int calcSymbolCountScore(String password, int passLength) 
   {
      return Additions.numbOfSymbols(password, passLength);
   }
   
   public static int calcSymbolCountBonus(String password, int passLength)
   {
      int numbOfSymbols = Additions.numbOfSymbols(password, passLength);
      return (numbOfSymbols)*6;
   }
   
   //6. Middle numbers or symbols
   public static int calcMiddleNumSymbolCountScore(String password, int passLength) 
   {
      return Additions.numbOfMid(password, passLength);
   }
   
   public static int calcMiddleNumSymbolCountBonus(String password, int passLength)
   {
      int numbOfMid =Additions.numbOfMid(password, passLength);
      return (numbOfMid)*2;
   }
  
   //7. Requirements
   public static int calcRequirementsScore(String password, int passLength, 
         int calcUpperCaseLettersScore, int calcLowerCaseLettersScore, 
   int calcSymbolCountScore, int calcNumberCountScore) 
   {
      return  Additions.Requirements( password,  passLength,  
            calcUpperCaseLettersScore, calcLowerCaseLettersScore,  
            calcSymbolCountScore,  calcNumberCountScore );       
   }
   
   public static int calcRequirementsBonus(String password, int passLength, 
         int calcUpperCaseLettersScore, int calcLowerCaseLettersScore, 
   int calcSymbolCountScore,int calcNumberCountScore )
   {
      int bonusRequirements = Additions.Requirements( password, passLength,  
            calcUpperCaseLettersScore, calcLowerCaseLettersScore,  
            calcSymbolCountScore, calcNumberCountScore );
      
      return (bonusRequirements)*2;
   }
   
   
   //Deductions
   //8. Letters Only
   public static int calclettersOnlyScore(String password, int passLength) 
   {
      return Subtractions.numbOfLettersOnly(password, passLength);
   }
   
   public static int calclettersOnlyBonus(String password, int passLength)
   {
      int numbOfLettersOnly = Subtractions.numbOfLettersOnly(password, passLength);
      return -1*(numbOfLettersOnly)*2;
   }
   
   //9. Numbers Only
   public static int calcNumbersOnlyScore(String password, int passLength) 
   {
      return Subtractions.numbOfNumbersOnly(password, passLength);
   }
   
   public static int calcNumbersOnlyBonus(String password, int passLength)
   {
      int numbOfNumbersOnly = Subtractions.numbOfNumbersOnly(password, passLength);
      return -1*(numbOfNumbersOnly)*2;
   }

   //10. NA Cannot do 
  
   //11. Consecutive Uppercase
   public static int calcConsecUpperCaseScore(String password, int passLength) 
   {
      return Subtractions.consecutiveUpperCase(password, passLength);
   }
   
   public static int calcConsecUpperCaseBonus(String password, int passLength)
   {
      int consecutiveUpperCase = Subtractions.consecutiveUpperCase(password, 
            passLength);
      return (-2*consecutiveUpperCase);
   }
   
   //12. Consecutive Lowercase
   public static int calcConsecLowerCaseScore(String password, int passLength) 
   {
      return Subtractions.consecutiveLowerCase(password, passLength);
   }
   
   public static int calcConsecLowerCaseBonus(String password, int passLength)
   {
      int consecutiveLowerCase = Subtractions.consecutiveLowerCase(password, 
            passLength);
      return (-2*consecutiveLowerCase);
   }
   
   //13. Consecutive Numbers
   public static int calcConsecNumbersScore(String password, int passLength) 
   {
      return Subtractions.consecutiveNumbers(password, passLength);
   }
   
   public static int calcConsecNumbersBonus(String password, int passLength)
   {
      int consecutiveNumbers = Subtractions.consecutiveNumbers(password, 
            passLength);
      return (-2*consecutiveNumbers);
   }
   
   //14. Sequential Numbers
   public static int calcSequenNumbersScore(String password, int passLength) 
   {
      return Subtractions.sequentialNumbers(password, passLength);
   }
   
   public static int calcSequenNumbersBonus(String password, int passLength)
   {
      int sequentialNumbers = Subtractions.sequentialNumbers(password, passLength);
      return (-3*sequentialNumbers);
   }
   
   //15. Sequential Letters
   public static int calcSequenLettersScore(String password, int passLength) 
   {
      return Subtractions.sequentialLetters(password, passLength);
   }
   
   public static int calcSequenLettersBonus(String password, int passLength)
   {
      int sequentialLetters = Subtractions.sequentialLetters(password, passLength);
      return (-3*sequentialLetters);
   }
   
   //16. Sequential Symbols
   /*
   public static int calcSequenSymbolsScore(String password, int passLength) 
   {
      return Subtractions.sequentialSymbols(password, passLength);
   }
   
   public static int calcSequenSymbolsBonus(String password, int passLength)
   {
      int sequentialSymbols = Subtractions.sequentialSymbols(password, passLength);
      return (-3*sequentialSymbols);
   }
   */
}