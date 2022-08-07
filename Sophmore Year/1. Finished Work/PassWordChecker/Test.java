public class Test
{
   public static void main(String []args)
   {
      String passWord = "Ba$e789BaLL";
      System.out.println();
      System.out.println();
                     
      int passLength = passWord.length(); 
   
   //Deductions Count
   
      //11. Consecutive Uppercase
      int consecutiveUpperCase = consecutiveUpperCase(passWord, passLength);
      System.out.println(consecutiveUpperCase);
      //12. Consecutive Lowercase
      int consecutiveLowerCase = consecutiveLowerCase(passWord, passLength);
      System.out.println(consecutiveLowerCase);
      //13. Consecutive Numbers
      int consecutiveNumbers = consecutiveNumbers(passWord, passLength);
      System.out.println(consecutiveNumbers);
      //14. Sequential Letters
      int sequentialLetters = sequentialLetters(passWord,passLength);
      System.out.println(sequentialLetters);
   
   }
   // Makes consecutive Uppercase
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
   //Shows consec. numbers
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
}

