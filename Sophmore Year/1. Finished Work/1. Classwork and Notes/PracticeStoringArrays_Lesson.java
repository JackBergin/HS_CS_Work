import java.util.*;

public class PracticeStoringArrays_Lesson
{
   public static void main (String[] args)
   {
      int[] listA = new int [5];
      listA[0] = 1;
      listA[1] = 2;
      listA[2] = 3;
      listA[3] = 4;
      listA[4] = 5;
      
      int[] listB = {1,2,3,4};
      
      System.out.println(Arrays.toString(listA));
      System.out.println(Arrays.toString(listB));
      
      int[]listC = listB;
      
      System.out.println(Arrays.toString(listC));
   
   }
}