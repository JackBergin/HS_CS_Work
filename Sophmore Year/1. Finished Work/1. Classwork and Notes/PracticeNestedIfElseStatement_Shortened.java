/*
Practice Java
*/

public class PracticeNestedIfElseStatement_Shortened 
{
   public static void main(String[] args) 
   {
      //Suppose there are only 3 possible grades: A, B, anc C
      
      int testScore = 42;
      char grade = 'N';
   
      if (testScore >= 90) 
      {
         grade = 'A';
      } 
      else 
      {
         if (testScore >= 80) 
         {
            grade = 'B';
         } 
         else 
         {
            if (testScore >= 70) 
            {
               grade = 'C';
            }
         }
      } 
      System.out.println("Grade = " + grade);
   }
}
      
      
