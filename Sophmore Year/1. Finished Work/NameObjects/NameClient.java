public class NameClient
{
   public static void main(String [] args)
   {
      NameClass name1 = new NameClass ("Jack", "C", "Bergin");
      NameClass name2 = new NameClass ("Ryan", "G", "Argentino");
      
      //This can just print out the first 
      //name of the full name
      System.out.println(name1.firstName);
      
      //This is the normal full name
      System.out.println(name1.getNormalOrder());
      
      //Reverses the order of the name
      System.out.println(name1.getReverseOrder());
      
      //This will return the name regardless of the class
      System.out.println(name1);
      
      //This will return the first name as a getter
      System.out.println(name1.getFirstName);
   }
}