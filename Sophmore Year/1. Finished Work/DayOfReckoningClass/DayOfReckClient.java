public class DayOfReckClient
{
   public static void main (String []args)
   {
      MyPoint p1 = new MyPoint (1,0);
      MyPoint p2 = new MyPoint (0,1);
      
      DayOfReck reck1 = new DayOfReck(p1, p2);
      
      System.out.println(reck1);
   }
}
