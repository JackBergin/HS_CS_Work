/*
Java Practice
*/

public class Circle
{
   //FIELDS
   private double radius;
   private double circumference;
   private double area;
   
   //CONSTRUCTORS
   public Circle(double r)
   {
      radius = r;
      circumference = 2 * Math.PI * radius;
      area = calculateArea();
   }
   
   //INSTANCE METHODS
   public double getRadius() {return radius;}
   public double getCircumference() {return circumference;}
   public double getArea() {return area;}
   
   
   public double calculateArea()
   {
      double temp = Math.PI * getRadius() * getRadius();
      return temp;
   }
   
   public String toString()
   {
      return "Radius of Circle: " + getRadius() + "\nCircumference of Circle: " 
            + getCircumference() + "\nArea of Circle: " + getArea();
   }
}