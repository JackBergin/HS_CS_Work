public class PracticeExercise3
{ 
   public static void main(String[] args)
   {
      printStrings(10);
   }
   
   public static void printStrings(int rep)
   {
       for(int i = 1; i<=rep; i++)
       {
          System.out.print("["+ i +"]");
       }
   }
}