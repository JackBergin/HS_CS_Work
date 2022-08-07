public class DayOfReck
{
   //FIELDS-------------------------------------------------------------
   private MyPoint p1;
   private MyPoint p2;
   private double slope;
   private double yInter;
   
   //CONSTRUCTORS-------------------------------------------------------
   public DayOfReck(MyPoint p1, MyPoint p2)
   {
      this.p1 = p1;
      this.p2 = p2;
      slope = calculateSlope();
      yInter = calculateYIntercept();
   }
   
   //INSTANCE METHODS---------------------------------------------------
   //GETTERS:
   public double slope()  {return slope;}
   public double yInter() {return yInter;}

   //SETTERS:
   public double calculateSlope()
   {
     double y = (p2.getY()-p1.getY());
     double x = (p2.getX()-p1.getX());
     double m = y/x;
     return m;
   }
   
   public double calculateYIntercept()
   {
      double yInter =  ((slope*p2.getX())-p2.getY())*-1;
      if(yInter == 0)
      {
         return 0;
      }
      return yInter;
   }
   
   public String toString()
   {
      String temp = "y = m * x + b" + 
                    "\n\nm = " + slope +
                    "\nb = " + yInter + 
                    "\n\ny = ("+ slope +") * x + (" + yInter + ")";
      return temp;
   }
}