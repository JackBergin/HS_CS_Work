public class ArrayPractice
{
   public static void main (String []args)
   {
      // make an array
      double[] newArray = new double [6];
      
      //assign values to the arrays
      newArray[0] = 0;
      newArray[1] = 1;
      newArray[2] = 2;
      newArray[3] = 3;
      newArray[4] = 4;
      newArray[5] = 5;
      
      /*
      can be used to declare an array too.
      double[] newArray = {1, 2, 3, 4, 5, 6};
      */
     
      System.out.println(newArray.length);
      
      //lets find the sum of those 6 numbers
      
      double sum = 0;
      //cant use <= to compare i because you cannot go beyond 
      //the length of the array
      //say array is 6, if you use <= youre compareing 6 to 7.
      for(int i = 0; i < newArray.length; i++)
      {
          sum = sum + newArray[i];
      }
      System.out.println(sum);//prints sum of all arrays
     
      double average = sum/newArray.length;
      System.out.println(average);//prints average of all arrays
      
      //find how many values are above the arrays average of 2.5
      
      int aboveAverage = 0;
      
      for(int i = 0; i < newArray.length; i++)
      {
         if (newArray[i] > average)
         {
           aboveAverage++;
         }
      }
      
      System.out.println("There are " + aboveAverage+ " numbers above the average of " +average);
   }
}
