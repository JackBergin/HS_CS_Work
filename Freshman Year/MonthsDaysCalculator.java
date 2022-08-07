/*
File: Practice four loop
Programmer:Jack Bergin
Class: Comp sci
Date: 1/25/16

Description: Months days 
*/
import java.util.Scanner; // Must import this library for the scanner

public class MonthsDaysCalculator
{
   public static void main (String[] args)
   {
   Scanner input = new Scanner (System.in);
   
   System.out.println("What month would you like to find the day count of (pick a number).");
   System.out.println ("1 January      5 May      9 September ");
   System.out.println ("2 Feburary     6 June     10 October ");
   System.out.println ("3 March        7 July     11 November");
   System.out.println ("4 April        8 Augus    12 December");

   int month = input.nextInt();
   int year=0;
   double dayNumb = 0;

   
   if(month == 1 || month == 3 || month == 5|| month == 7 || month == 8 || month == 10)
   {
   System.out.println("Your month has 31 days." );
   }
   if(month == 4 || month == 6 || month == 9|| month == 11)
   {
   System.out.println("Your month has 30 days.");
   }
   if(month == 2)
   {
   System.out.println("Please enter the year.");
   year = input.nextInt();
   
   dayNumb = year%4;
   }
   if (month == 2 && dayNumb==0)
   {
   System.out.println("The month has 29 days");
   }
   if (month == 2 && dayNumb>0 || dayNumb<0)
   {
   System.out.println("The month has only 28 days");
   }
   
   }
}


/*
1 January - 31 days
2 February - 28 days; 29 days in Leap Years
3 March - 31 days
4 April - 30 days
5 May - 31 days
6 June - 30 days
7 July - 31 days
8 August - 31 days
9 September - 30 days
10 October - 31 days
11 November - 30 days
12 December - 31 days
*/