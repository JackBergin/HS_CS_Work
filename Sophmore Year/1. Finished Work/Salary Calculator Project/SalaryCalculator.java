/*
Source File Name:SalaryCalculator
Programmer: Jack Bergin
Class: AP Computer Science
Date: 10/11/16
Description: This program will allow someone to 
calculate their weekely and even yearly wage
*/

public class SalaryCalculator
{
   public static void main(String[] args)
   {
      int hoursWorkedPerWeek = 40;
      int overtimeHoursWorked = 8;
      double wagePerHour = 10.0;
      double overtimeFactor = 1.5;
      
      double weeklyHour = ((hoursWorkedPerWeek*wagePerHour)+(overtimeHoursWorked*overtimeFactor));
      int con = (int)(weeklyHour);
      weeklyHour = Math.round(weeklyHour * 100);

   
      
      System.out.println("Salary Calculator:");
      System.out.println("================================================");
      System.out.println("hourly wage = " + wagePerHour + " / hour");
      System.out.println("hours per week = " + hoursWorkedPerWeek + " hours");
      System.out.println("overtime hours per week = " + overtimeFactor + " hours");
      System.out.println();
      System.out.println("money earned per week = $" + weeklyHour/100);
      System.out.println("Salary Calculator: $" + con*52);
      System.out.println("================================================");
   }
}
