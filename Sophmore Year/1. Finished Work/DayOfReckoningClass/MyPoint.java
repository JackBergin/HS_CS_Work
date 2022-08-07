/*
Java Practice Create a Point Object
*/

public class MyPoint
{
   //FIELDS (also called "Attributes" or "Instance Variables")
   //fields should always be private
   
   private int x;
   private int y;
   
   //............................................................
   //CONSTRUCTORS (job is to assign values to the fields)
   
   public MyPoint(int x, int y) //constructor for 2 parameters
   {
      this.x = x;
      this.y = y;
   }
   
   public MyPoint() //constructor for 0 parameters (default)
   {
      x = 0;
      y = 0;
   }
   
   //............................................................
   //INSTANCE METHODS: Methods for objects (no static)
   
   //"Accessors" (or "Getters") methods--returns existing values of private fields
   public int getX() {return x;}
   public int getY() {return y;}
   
   //"Mutators" (or "Setters") methods--changes values of private fields
   public void setX(int x) {this.x = x;}
   public void setY(int y) {this.y = y;}
   
   
   //METHOD: changes values of both x and y fields (mutator)
   public void setLocation(int x, int y)
   {
     this.x = x;
     this.y = y; 
   }
   
   //METHOD: translates point by given amount (mutator)
   public void setTranslate(int dx, int dy)
   {
      x = x + dx; 
      y = y + dy; 
   }
   
   //METHOD: calculates distance from point to origin (accessor)
   public double getDistanceToOrigin()
   {
      double d = Math.sqrt(x*x + y*y);
      return d;
   }
   
   //METHOD: A toString that will overwrite the default toString and
   //allow us to print out objects exactly how we want them
   public String toString() 
   {
      String temp = "(x = " + x + ", y = " + y + ")";
      return temp;
   }
}//end class