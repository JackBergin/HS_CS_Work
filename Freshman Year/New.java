/**********************
Programmer: Jack Bergin
Class: Intro to comp. sci.
Date: 12/10/15
Description: Math Method learner
************************/

public class New{
   public static void main(String [] args){
   
      int n = I0.readInt();
      n=Math.abs(n);
   
      while(n>= 2){
         n = n/2 -1;
      }
      System.out.println(n);
   }
}