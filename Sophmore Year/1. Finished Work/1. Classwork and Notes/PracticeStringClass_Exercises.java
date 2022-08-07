// Practice Java Concepts

public class PracticeStringClass_Exercises
{
	public static void main(String[] args)
	{
      //create 2 strings
      String str1 = "baseball";
      String str2 = "I live at 123 Main Street";
      
      System.out.println("str1 = " + str1);
      System.out.println("str2 = " + str2);
      
      //use .length()
      System.out.println("The length of str1 = " + str1.length());
      System.out.println("The length of str2 = " + str2.length());
      
      //use .substring()
      System.out.println("In str1, the characters between index 3 and index 5 is " + str1.substring(3,5));
      System.out.println("In str2, the characters between index 3 and index 5 is " + str2.substring(3,5));
      
      //use .charAt();
      System.out.println("In str1, the fifth character is " + str1.charAt(5));
      System.out.println("In str2, the fifth character is " + str2.charAt(5));
      
      //use .toUpperCase();
      System.out.println("str1 in all uppercase looks like this: " + str1.toUpperCase());
      System.out.println("str2 in all uppercase looks like this: " + str2.toUpperCase());
      
      //use .toLowerCase();
      System.out.println("str1 in all lowercase looks like this: " + str1.toLowerCase());
      System.out.println("str2 in all lowercase looks like this: " + str2.toLowerCase());
      
      //use .endsWith();
      System.out.println("str1 ends with the letters \"all\". True or False?" + str1.endsWith("all"));
      System.out.println("str1 ends begins with the letters \"fo\". True or False?" + str2.endsWith("fo"));
      
      //use .indexOf()
      System.out.println("In str1, the letters \"seb\" begin at index = " + str1.indexOf("seb"));
      System.out.println("In str2, the letters \"eet\" begin at index = " +str2.indexOf("eet"));
      
      //use .substring() and Integer.parseInt();
      int trent = 100 + Integer.parseInt(str2.substring(10,13));
      System.out.println("100 + my street address = " + trent);
      
      //use .compareTo();
      System.out.println("str1 compared to str2 returns a value of " + str1.compareTo(str2));
      
   }
}
     