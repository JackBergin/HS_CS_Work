public class ExtraExercises
{
   public static void main(String []args)
   {
       //Self check # 28:
       int [] [] table = new int [5][10];
       
       for(int i = 0; i < 5; i++)
       {
          for (int j = 0; j<10; j++)
          {
             table [i][j] = i*j;
          }
       }
       //Self Check # 29:
       int [][] matrix = new int [6][8];
       
       for (int i = 0; i<6; i++)
       {
          matrix [i][4] = matrix [i][1];
       }
       //Self Check # 30:
       int [][] jagged = new int [5][];
       int value = 1;
       
       for(int i = 0; i <5; i++)
       {
          jagged [i] = new int [i+1];
          for (int j = 0; j < i + 1; j++)
          {
             jagged[i][j] = value;
             value++;
          }
       } 
   }
}