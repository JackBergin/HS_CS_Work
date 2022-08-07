import java.util.*;
import java.util.Scanner;

public class REverserAttempt{

   public static void main (String []args){
      int [][] array = {{1,2,3,4,5}, {6,7,8,9,10}};
      
      for(int i = 0; i < array.length; i++){
         ArrayUtils.reverse(array[i]);
      }       
           
   }
}