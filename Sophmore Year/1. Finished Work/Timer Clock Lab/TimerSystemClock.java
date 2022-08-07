/*
Source File Name:TimerSystemClock
Programmer:Jack Bergin
Class:Ap Computer Science
Date:09/30/16
Description:This program will print 
out the date in seconds, years, days etc. 
since 1970 and also print out the current 
time and date.
*/

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimerSystemClock 
{
   public static void main (String[] args)
   {
      //Time in milliseconds 
      long currentTimeMilliseconds = System.currentTimeMillis();
      //Time in seconds 
      long currentTimeSeconds = currentTimeMilliseconds/1000;
      //Time in minutes 
      long currentTimeMinutes = currentTimeSeconds/60;
      //Time in hours 
      long currentTimeHours = currentTimeMinutes/60;
      //Time in days 
      long currentTimeDays = currentTimeHours/24;
      //Time in years 
      long currentTimeYears = currentTimeDays/365;
   
      System.out.println("===================================================");
      System.out.print("Current system time is "+currentTimeMilliseconds);
      System.out.println(" milliseconds");
      System.out.println();
      System.out.println("It has been:");
      System.out.println(currentTimeYears+" years");
      System.out.println(currentTimeDays+" days");
      System.out.println(currentTimeHours+" hours");
      System.out.println(currentTimeMinutes+" minutes, and");
      System.out.println(currentTimeSeconds+" seconds");
      System.out.println();
      System.out.println("since midnight, January 1, 1970 UTC."); 
      System.out.println("===================================================");
      System.out.println();
      //get current date time with Calendar()
      DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
      Calendar cal = Calendar.getInstance();
      System.out.print("The current date and time is: ");
      System.out.println(dateFormat.format(cal.getTime()));
   }
}