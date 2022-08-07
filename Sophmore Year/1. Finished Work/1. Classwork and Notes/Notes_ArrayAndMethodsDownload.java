/*
Java Practice
*/

import java.util.*;

public class Notes_ArrayAndMethodsDownload
{
   public static void main (String[] args)
   {
      int[] myArray = new int[4];
      myArray[0]=1;
      myArray[1]=3;
      myArray[2]=5;
      myArray[3]=7;
      
      //incrementAll(myArray); //method call
      
      //System.out.println(myArray);
      //System.out.println(Arrays.toString(myArray));
      
      int [] jackArray = buildOddArray(7);
      System.out.println(Arrays.toString(jackArray));

   }
   
   public static int[] buildOddArray(int size)
   {
      int[] data = new int[size];
      for (int i = 0; i < data.length; i++) //creates an odd number
      {
         data[i] = 2 * i + 1;
      }
      //System.out.println(data);
      return data;
   }   
   /*
   public static void incrementAll(int[] data)
   {
      for (int i = 0; i < data.length; i++) //adds one to each element in array
      {
         data[i]++;
      }
      System.out.println(data);
      System.out.println(Arrays.toString(data));
   }
   */
      
   
   /*
   public static void fillWithOdds(int[] data)
   {
      for (int i = 0; i < data.length; i++) //creates an odd number
      {
         data[i] = 2 * i + 1;
      }
   }
   */  
   
   

}//end class