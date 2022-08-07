/*
Name of Program: Subtractions
Programmer: Jack Bergin
Class Block: E
Date Completed: 1/24/17
Description of what program does:
Each method will possibly find somthing 
wrong with your password and will go 
against the passwords rated complexity.
*/

public class Subtractions
{
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
   //Makes Uppercase consectuive
   public static int consecutiveUpperCase(String passWord, int passLength)
   {
   
      int count = 0;
      int i = 0;
   
      while (i<passLength-1)
      {
         char nextLetter = passWord.charAt(i);
      
         if(Character.isUpperCase(nextLetter))
         {
            nextLetter = passWord.charAt(i+1);
         
            while(Character.isUpperCase(nextLetter))
            {
               count = count +1;
               i = i +1;
            
               if (i <passWord.length()-1)
               {
                  nextLetter=passWord.charAt(i+1);
               }
               else
               {
                  nextLetter = 'a';
               }
            }
         }
         i = i+1;
      }
      return count;
   }
   //Makes Lowercase consectuive
   public static int consecutiveLowerCase(String passWord, int passLength)
   {
   
      int count = 0;
      int i = 0;
   
      while (i<passLength-1)
      {
         char nextLetter = passWord.charAt(i);
      
         if(Character.isLowerCase(nextLetter))
         {
            nextLetter = passWord.charAt(i+1);
         
            while(Character.isLowerCase(nextLetter))
            {
               count = count +1;
               i = i +1;
            
               if (i <passWord.length()-1)
               {
                  nextLetter = passWord.charAt(i+1);
               }
               else
               {
                  nextLetter = 'A';
               }
            }
         }
         i = i+1;
      }
      return count;
   }
   //Makes numbers consectuive
   public static int consecutiveNumbers(String passWord, int passLength)
   {
   
      int count = 0;
      int i = 0;
   
      while (i<passLength-1)
      {
         char nextChar = passWord.charAt(i);
      
         if(Character.isDigit(nextChar))
         {
            nextChar = passWord.charAt(i+1);
         
            while(Character.isDigit(nextChar))
            {
               count = count +1;
               i = i +1;
            
               if (i <passWord.length()-1)
               {
                  nextChar=passWord.charAt(i+1);
               }
               else
               {
                  nextChar = 'a';
               }
            }
         }
         i = i+1;
      }
      return count;
   }
      //Consec Letters
   public static int sequentialLetters(String passWord, int passLength)
   {
   
      int count = 0;
      int i = 0;
   
      while(i<passLength-1)
      {
         char eachLetter = passWord.charAt(i);
      
         if (Character.isLetter (eachLetter))
         {
            char nextLetter = passWord.charAt(i+1);
         
            if (nextLetter - eachLetter == 1)
            {
               eachLetter=nextLetter;
               i++;
              
                                      
               if(i<passWord.length()-1)
               {
                  nextLetter = passWord.charAt(i+1);
               }
               else
               {
                  nextLetter = '%';
               }
            
               while (nextLetter - eachLetter == 1)
               {
                  count = count+1;
                  eachLetter = nextLetter;
                  i++;
               
                  if(i<passWord.length()-1)
                  {
                     nextLetter = passWord.charAt(i+1);
                  }
                  else
                  {
                     nextLetter = '%';
                  }
               }
            }
         
            if (nextLetter - eachLetter == -1)
            {
               eachLetter = nextLetter;
               i++;
            
               if(i<passWord.length()-1)
               {
                  nextLetter = passWord.charAt(i+1);
               }
               else
               {
                  nextLetter = '%';
               }
            
               while (nextLetter - eachLetter == -1)
               {
                  count = count +1;
                  eachLetter = nextLetter;
                  i++;
               
                  if(i < passWord.length()-1)
                  {
                     nextLetter = passWord.charAt(i+1);
                  }
                  
                  else
                  {
                     nextLetter = '%';
                  }
               }
            }
         }
         i = i+1;
      }
      return count;
   }
   //Consec Numbers
   public static int sequentialNumbers(String passWord, int passLength)
   {
   
      int count = 0;
      int i = 0;
   
      while(i<passLength-1)
      {
         char eachDigit = passWord.charAt(i);
      
         if (Character.isDigit (eachDigit))
         {
            char nextDigit = passWord.charAt(i+1);
         
            if (nextDigit - eachDigit == 1)
            {
               eachDigit=nextDigit;
               i++;
              
                                      
               if(i<passWord.length()-1)
               {
                  nextDigit = passWord.charAt(i+1);
               }
               else
               {
                  nextDigit = '%';
               }
            
               while (nextDigit - eachDigit == 1)
               {
                  count = count+1;
                  eachDigit = nextDigit;
                  i++;
               
                  if(i<passWord.length()-1)
                  {
                     nextDigit = passWord.charAt(i+1);
                  }
                  else
                  {
                     nextDigit = '%';
                  }
               }
            }
         
            if (nextDigit - eachDigit == -1)
            {
               eachDigit = nextDigit;
               i++;
            
               if(i<passWord.length()-1)
               {
                  nextDigit = passWord.charAt(i+1);
               }
               else
               {
                  nextDigit = '%';
               }
            
               while (nextDigit - eachDigit == -1)
               {
                  count = count +1;
                  eachDigit = nextDigit;
                  i++;
               
                  if(i < passWord.length()-1)
                  {
                     nextDigit = passWord.charAt(i+1);
                  }
                  
                  else
                  {
                     nextDigit = '%';
                  }
               }
            }
         }
         i = i+1;
      }
      return count;
   }
   //sequential Symbols NOT MANDITORY
   /*
   public static int sequentialSymbols(String passWord, int passLength)
   {
  
      int count = 0;
      int i = 0;
  
      while(i<passLength-1)
      {
         char eachDigit = passWord.charAt(i);
     
         if (Character.isDefined (eachDigit))
         {
            char nextDigit = passWord.charAt(i+1);
        
            if (nextDigit - eachDigit == 1)
            {
               eachDigit=nextDigit;
               i++;
              
                                      
               if(i<passWord.length()-1)
               {
                  nextDigit = passWord.charAt(i+1);
               }
               else
               {
                  nextDigit = '%';
               }
           
               while (nextDigit - eachDigit == 1)
               {
                  count = count+1;
                  eachDigit = nextDigit;
                  i++;
              
                  if(i<passWord.length()-1)
                  {
                     nextDigit = passWord.charAt(i+1);
                  }
                  else
                  {
                     nextDigit = '%';
                  }
               }
            }
        
            if (nextDigit - eachDigit == -1)
            {
               eachDigit = nextDigit;
               i++;
           
               if(i<passWord.length()-1)
               {
                  nextDigit = passWord.charAt(i+1);
               }
               else
               {
                  nextDigit = '%';
               }
           
               while (nextDigit - eachDigit == -1)
               {
                  count = count +1;
                  eachDigit = nextDigit;
                  i++;
              
                  if(i < passWord.length()-1)
                  {
                     nextDigit = passWord.charAt(i+1);
                  }
                 
                  else
                  {
                     nextDigit = '%';
                  }
               }
            }
         }
         i = i+1;
      }
      return count;
   }
   */
}