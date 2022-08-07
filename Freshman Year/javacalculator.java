/**********************
Programmer: Jack Bergin
Class: Intro to comp. sci.
Date: 12/15/15
Description: 12/15/15 program will add and 
or subtract and or multiply and or devide a 
specific number.
************************/
//Max damage in assassins creed
public class javacalculator
{
   public static void main (String[] args) 
   {
   double str = 220;
   double dex = 150;
   double BootMinDam = 83;
   double skill_bonus = 1440;
   double StrBonus = 120;
   double MinDamage = (str + dex - 20) / 4 * (100 + skill_bonus) / 100 + 
   BootMinDam * (100 + (str * StrBonus / 100) + skill_bonus) / 100;
  
   //Because we're using Dtail, we multiply the result by the Dtail bonus to find the damage 
   //done in the area of effect.Dtail = (MinDamage * 240 / 100) + MinDamage

   double Damagetotal = (MinDamage * 240 / 100) + MinDamage;
   System.out.print( Damagetotal);
   System.out.println(" is the minimum damage (MinDamage) that would be displayed ");
   System.out.println("on the char screen after doing a kick attack. ");
   System.out.println("It would take five of these kicks to kill a bad guy. ");
   }
}