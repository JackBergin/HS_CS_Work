public class Secretary extends Employee
{
   //you can also comment this entire thing out because there is no need for it. 
   //It uses the super class constructor because we are not really changing any 
   //parameters inside of the super class.
   /*
   public Secretary()
   {
      super();
   }
   */
   
   public void takeDictations (String text)
   {
      System.out.println("Dictation text: " + text);
   }
}