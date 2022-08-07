import java.util.*;

public class ArrayPractice
{
   public static void main (String[] args)
   {
      int[] arrayNick = {2,4,6,8};
      int[] arrayCaro = {2,4,6,8};
      int[] arrayJenna= {1,2,5,7};
      
      int[] arrayMax = Arrays.copyOf(arrayJenna, 8);
      System.out.println(Arrays.toString(arrayMax));
      
      arrayJenna = Arrays.copyOf(arrayJenna,8);
      
      double[] arrayJack = new double [10];
      Arrays.fill(arrayJack, 3.14);
      System.out.println(Arrays.toString(arrayJack));
      
      int[] arrayTyler = Arrays.copyOfRange(arrayCaro, 1, 3);
      System.out.println(Arrays.toString(arrayTyler));
      
   }
}