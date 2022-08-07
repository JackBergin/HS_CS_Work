import java.awt.*; //required for Graphics class

public class TriangleClient
{
   public static void main (String []args)
   {
      MyPoint point1 = new MyPoint (5,8);
      MyPoint point2 = new MyPoint (20,17);
      MyPoint point3 = new MyPoint (1,30);
      
      TriangleClass tr1 = new TriangleClass (point1, point2, point3);      
   }
}