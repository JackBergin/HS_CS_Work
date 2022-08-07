/*
Source File Name:Questionnaire
Programmer:Jack Bergin
Class:Ap Computer Science
Date:09/28/16
Description:This program will print 
out an ad libed paragraph
*/
public class Questionnaire
{
   public static void main (String[] args)
   {
      String firstName = "Jack";
      String lastName = "Bergin";
      String midInital = "C.";
      String city = "Gloucester";
      String state = "Massachusetts";
      String adress="30 Decatur St.";
      String zipCode = "01930";
      int yearBorn = 2000;
      String monthBorn = "September";
      String dayBorn = "Sunday";
      int currentYear = 2016;
      String currentMonth = "September";
      int currentDay = 29;
      int myAge = 16;
      int myDayAge = 4;
      double myHeight = 5.9; 	//record height in feet and inches, like 5 feet 9 inches
      int myTime = 584000000*myAge;
      int hrsSleep = 365*8*myAge;
      int foodIEat = 365*6*myAge; //Amount of food eaten for 15 yrs.
      boolean iLikePugs = true;  //I love pugs
      boolean iLikeProgramming = true; //Love to progeram
      boolean noSchool = true; //No School!
      boolean noFootball = false; // Cool to watch not very fun to play
      String favoriteQuote = "Say hello to my little friend!";
      
      //Prints out my name and where I live
      System.out.print("Hello, my first name is "+firstName+", my last name is "+lastName);
      System.out.println(", and my middle initial is "+midInital);
      System.out.println("I currently live in " + city + ", " + state);
      
      //Prints out how to send a letter to me and how to adress me
      System.out.println();
      System.out.println("If you were to send me a letter, you would address it as:");
      System.out.println("Mr. "+firstName+ " "+ lastName); 
      System.out.println(adress);  //you can make up any address
      System.out.println(city + ", " + state + " " + zipCode);
      
      //Prints out my age in yrs, days, hours and seconds and the date
      System.out.println();
      System.out.print("I have been alive for " + myAge+ " years and " + myDayAge+" days, ");
      System.out.println("which means:");
      System.out.println("My age in days is: "+ (myAge*365) + " days.");
      System.out.println("My age in hours is: " + (myAge*365*24)+" hours.");
      System.out.println("My age in seconds is: "+ (myAge*365*24*60*60)+" seconds.");
      System.out.println("Today is "+ currentMonth + " " + currentDay +", " + currentYear);
     
      //Prints out how many hours I slept and how long I slept in my life
      System.out.println();
      System.out.println("Since the time I have been alive:");
      System.out.print("The Earth has traveled through space about "  + myTime); 
      System.out.println(" miles while I have been alive.");
      System.out.print("Assuming 8 hours of sleep per day, I have slept about "+ hrsSleep);
      System.out.println(" hours.");
      
      //Prints out how much I eat
      System.out.println();
      System.out.print("Assuming I eat about 6 pounds of food per day, I have eaten about ");
      System.out.println(foodIEat+" pounds");
      System.out.print("of food, which is the equivalent to the weight of about ");
      System.out.println((foodIEat/9000) +" elephant.");
     
      //My likes and dislikes are the output
      System.out.println();
      System.out.println("A few of my likes and dislikes...");
      
      if (iLikePugs == true)
      {
         System.out.println("I love pugs!");
      }
      else
      {
         System.out.println("I do not like pugs");
      }
   
      if (iLikeProgramming == true)
      {
         System.out.println("I like to program!");
      }
      else
      { 
         System.out.println("I do not like to program");
      }
   
      if (noSchool == false)
      {
         System.out.println("I like school!"); 
      }
      else
      {
         System.out.println("I do not like school!");
      }
   
      if (noFootball == false)
      {
         System.out.println("I do not like football."); 
      }
      else
      {
         System.out.println("I love football!");
      }
      
      //Prints out my favorite quote 
      System.out.println();
      System.out.println("My favorite movie quote is: " +favoriteQuote);
      System.out.println();
      //Ending the note
      System.out.println("Sincerely,");
      System.out.println(firstName+" "+lastName);   
   }
}