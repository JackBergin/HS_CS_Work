import java.awt.*; //required for Graphics class

public class TriangleClient
{
   public static void main (String []args)
   {
      DrawingPanel panel = new DrawingPanel(1000,1000);
      Graphics g = panel.getGraphics();
      MyPoint point1 = new MyPoint (7,12);
      MyPoint point2 = new MyPoint (43,43);
      MyPoint point3 = new MyPoint (17,22);
      
      TriangleClass t1 = new TriangleClass (point1, point2, point3);
      
      System.out.println(t1.getType());
      System.out.println(t1.getArea());
      System.out.println(t1.getPerimeter());
      
      t1.setPointA(new MyPoint (2,3));
      System.out.println(t1);
      
      t1.draw(g);
      
   }
}