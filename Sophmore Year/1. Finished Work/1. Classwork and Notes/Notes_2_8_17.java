import java.util.*;

public class Notes_2_8_17
{
    public static void main (String []args)
    {
       //assigns values to the first row
       int [][] myArray2 = new int[3][5];
       myArray2 [0][0] = 3;
       myArray2 [0][1] = 6;
       myArray2 [0][2] = 9;
       myArray2 [0][3] = 12;
       myArray2 [0][4] = 15;
       
       //assigns values to 2nd row using a for loop
       for(int i = 0; i < myArray2[0].length; i++){
       myArray2[1][i] = 2*i+4;
       }
       
       //what are the default values for integers? ==> 0
       //System.out.println(Arrays.deepToString(myArray2));
       
       //proint out individual lockers/rows
       //System.out.println(myArray2[0][0]);
       
       double [][] myArray = {{1.1,2.1,3.3,4.4},
                              {5.5,6.6,7.7,8.8},
                              {9.9,10.1,11.11,12.12}};
                              
        System.out.println(Arrays.deepToString(myArray));
        
        //How many rows in your array
        System.out.println(myArray.length);
        //How many columns in your array
        System.out.println(myArray[0].length);
       
    }
}