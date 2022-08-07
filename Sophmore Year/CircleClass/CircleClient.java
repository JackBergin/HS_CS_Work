public class CircleClient
{
   public static void main (String []args)
   {
       Circle cir1 = new Circle (6);
       System.out.println(cir1);
       System.out.println();
       
       Cylinder cy1 = new Cylinder (6,23);
       System.out.println(cy1);
       System.out.println();
       
       Columns col2 = new Columns (6,23, 12);
       System.out.println(col2);
       System.out.println();
   }
}