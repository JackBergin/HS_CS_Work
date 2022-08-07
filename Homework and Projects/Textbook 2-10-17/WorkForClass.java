/*
Programmer: Jack Bergin
Class: Computer Science
Date: 1/16/17
Description: This is the completed array 
worksheet that we were assigned last week
*/
import java.util.*;

public class WorkForClass
{
   public static void main (String []args)
   {
      int [] arrayOne = {7,12,15,24,29,31,37,42};
      int [] arrayTwo = {2,7,8,6,8,12,13,8,8,4,8,20,8};
      //Question A - 1
      for (int i = 0; i < arrayOne.length; i++)
      {
         System.out.print(arrayOne[i] +" ");
      }
       
      System.out.println();
      
      //Question B - 1
      for (int x: arrayOne)
      {
         System.out.print(x+" ");
      }
       
      System.out.println();
       
      //Question C - 1
      System.out.println(Arrays.toString(arrayOne));
       
      //Question 2
      int numberOfEight = count(arrayTwo, 8);
      System.out.println(numberOfEight);
       
      //Question 3 
      int indexOf = indexOf(arrayOne, 7);
      System.out.println(indexOf);
       
      //Question 4
      replaceAll(arrayTwo, 8, 5);
       
      //Question A - 5
      boolean equals1 = equalsA(arrayOne, arrayTwo);
      System.out.println(equals1);
      //Question B - 5
      boolean equals2 = equalsB(arrayOne, arrayTwo);
      System.out.println(equals2);
      //Question 6
      reverse(arrayOne);
   }
   //Question 2
   public static int count (int[] arrayName, int target)
   {
      int count = 0;
      for(int n : arrayName)
      {
         if(target == n)
         {
            count++;
         }
       
      }
      return count;
   }
   //Question 3
   public static int indexOf (int[] list, int target)
   {
      for(int i = 0; i<list.length; i++)
      {
         if (list[i] == target)
         {
            return i;
         }
      }
      return -1;
   }
   //Question 4
   public static void replaceAll(int[] list, int target, int replacement)
   {
      for( int j = 0; j <list.length; j++)
      {
         if(list[j]==target)
         {
            list[j] = replacement;
         }
      }
      System.out.println(Arrays.toString(list));
   }
   //Question 5 a
   public static boolean equalsA (int []list1, int []list2)
   {
      if (list1.length != list2.length)
      {
         return false;
      }
      for (int i = 0; i < list1.length; i++)
      {
         if(list1[i] !=list2[i])
         {
            return false;
         }
      }
      return true;
   }
   //Question 5 b
   public static boolean equalsB (int []list1, int []list2)
   {
      if (list1.equals(list2))
      {
         return true;
      }
      else
      {
         return false;
      }
   }
     
   //Question 6
   public static void reverse(int []list)
   {
      for (int i = 0; i < list.length-(list.length/2); i++)
      {
         int temp = list[i];
         list[i] = list[list.length - i - 1];
         list[list.length - i -1] = temp;
      
      }
      System.out.println(Arrays.toString(list));
   } 
}