public class NotesOctTwentySeventh
{
   public static void main (String[] args)
   {
      String str1 = "Hello World";//stores the word gloucester into the variable str1
      String s2 = "Hello World";
      
      /*
      We will learn 6 methods to use with string
      
      str1.length();
      str1.substring(1,5);
      str1.indexOf("est");
      str1.charAt(6);
      str1.toUpperCase();
      str1.toLowerCase();
     
      System.out.println(str1.substring(1,5));
      System.out.println(str1.indexOf("est"));
      System.out.println((int)(str1.charAt(6)));
      */
      
      int temp = str1.compareTo(s2);
      System.out.println(temp); 
    }
}