/*
Java Practice for cumulative algorithms
*/

public class PracticeCumulativeAlgorithms
{
   public static void main (String[] args)   
   {
      //1. cumulative sum
      int sum = 0;
      
      for (int i = 1; i <=1000000; i++)
      {
         sum = sum + i;
      
      }
      System.out.println(sum);
    }
}
      
      
      
      //2. max and min
      int max = 0;
      
      for (int i = 1; i <=100; i++)
      {
         int rand1 = (int)((Math.random()*100)*(int)(Math.random()*3 + -1)); //random between -99 and 99
         if (rand1 > max)
         {
            max = rand1;
         }
      }
      System.out.println(max);
      
      
      //3. counters
      int count = 0;
      
      for (int i = 1; i <=100; i++)
      {
         int rand1 = (int)(Math.random()*100); //generates random number between 0 and 99
         if (rand1 % 2 == 0)
         {
            count = count + 1;
         }
      }
      System.out.println(count);
   }
}

