
public class Client
{
   public static void main (String [] args)
   {
      MyFirstObject p1 = new MyFirstObject(8,17);
      System.out.println(p1.x);
      System.out.println(p1.y);

      /*
      MyFirstObject p2 = new MyFirstObject();
      System.out.println(p2.x);
      
      p1.translate(5,-3);
      System.out.println(p1.x);
      */
      System.out.println(p1.distanceToOrigin());

   }//end main method
}//end class