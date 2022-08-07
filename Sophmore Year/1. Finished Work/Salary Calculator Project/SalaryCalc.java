/*
SourceFile: Salary Calc
Programmer: Jack Bergin
Date: 10/13/16
Class: Ap Computer Science
Description: This program calculates a weekly and a 
yearly salary based on hours worked and hourly wage.
*/
public class SalaryCalc
{
   public static void main (String[] args)
   {      
      int hoursWorkedPerWeek = 40;
      int overtimeHoursWorked = 8;
      double overtimeFactor = 1.5;
      double wagePerHour = 10.0;
      //Regular wage calculations
      double regWagePerWeek = (hoursWorkedPerWeek*wagePerHour);
      double wagePerWeekExtra = (overtimeHoursWorked*overtimeFactor);
      double wagePerWeek = wagePerWeekExtra+regWagePerWeek;
      //Conversions to specific wage calculations.
      int conToInt = (int)(wagePerWeek*52);
      
      System.out.println("Salary Calculator:");
      System.out.println("==============================================");
      System.out.println("hourly wage = " + wagePerHour + " / hour");
      System.out.println("hours per week = " + hoursWorkedPerWeek + " hours");
      System.out.println("overtime hours per week = " + overtimeHoursWorked + " hours");
      System.out.println();
      System.out.println("money earned per week = $" + wagePerWeek);
      System.out.println("money earned per year = $" + conToInt);
      System.out.println("==============================================");
   }  
}