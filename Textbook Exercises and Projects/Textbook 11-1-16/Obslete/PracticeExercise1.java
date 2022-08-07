public class PracticeExercise_07
{ 
   public static void main(String[] args)
   {
      printStrings("abc",10);
   }
   
   public static void printStrings(String abc, int rep)
   {
       for(int i = 1; i<=rep; i++)
       {
          System.out.print(abc + " ");
       }
   }
}