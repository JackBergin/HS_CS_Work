/*
Programmer: Linehan
Date: 03/06/17
Description: Create a triangle class that uses the MyPoint class for
the vertices of the triangle

STATUS: Lesson
*/

import java.awt.*; //required for Graphics class

public class TriangleClass
{
   //FIELDS  (also called attributes or instance variables)
   
   private MyPoint pA; //these fields are point objects from the MyPoint class
   private MyPoint pB;
   private MyPoint pC;
   
   private double legA; //length of leg
   private double legB;
   private double legC;
   
   private double area;
   private double perimeter;
   
   private String type; //scalene, isosceles, right, or equilateral
   
   //..........................................................
   //CONSTRUCTORS
   
   //constructor 1: receives 3 points
   public TriangleClass(MyPoint pA, MyPoint pB, MyPoint pC)
   {
      this.pA = pA; //assigns new points to fields
      this.pB = pB;
      this.pC = pC;
      
      legA = calculateLength(pB, pC); // return method calcs leg length
      legB = calculateLength(pA, pC);
      legC = calculateLength(pA, pB);
      
      area = calculateArea(); //return method calcs area
      perimeter = legA + legB + legC;
      
      type = calculateType(); //return method calcs type
   }
   
   //constructor 2: receives 3 x-y values
   public TriangleClass(int aX, int aY, int bX, int bY, int cX, int cY)
   {
      MyPoint a = new MyPoint(aX, aY); //first create point objects from parameters
      MyPoint b = new MyPoint(bX, bY);
      MyPoint c = new MyPoint(cX, cY);
      
      pA = a; //assign points to fields
      pB = b;
      pC = c;
      
      legA = calculateLength(pB, pC); // return method calcs leg length
      legB = calculateLength(pA, pC);
      legC = calculateLength(pA, pB);
      
      area = calculateArea(); //return method calcs area
      perimeter = calculatePerimeter();
      
      type = calculateType(); //return method calcs type
   }
   
   //..........................................................
   //INSTANCE METHODS
   
   //Setters (Mutators)
   public void setPointA(MyPoint pA) 
   {
      this.pA = pA;
   }
   public void setPointB(MyPoint pB) 
   {
      this.pB = pB;
   }
   public void setPointC(MyPoint pC) 
   {
      this.pC = pC;
   }
   
   //Getters (Accessors)
   public String getType() 
   {return type;}
   public double getPerimeter() 
   {return perimeter;}
   public double getArea() 
   {return area;}
   
   public double getLegA() 
   {return legA;}
   public double getLegB() 
   {return legB;}
   public double getLegC() 
   {return legC;}
   

   //METHOD: determines the type of triangle based on length of legs
   private String calculateType()    
   {
      String temp = "Scalene";
      
      if (isRight())
         temp = "Right";
      if (isIsosceles())
         temp = "Isosceles";
      if (isEquilateral())
         temp = "Equilateral";
         
      return temp;
   }
   
   //METHOD: calculates the area of the triangle based on Heron's theorem
   private double calculateArea()
   {
      double p = (legA + legB + legC)/2.0;
      double areaOf = Math.sqrt(p * (p - legA) * (p - legB) * (p - legC));
      Math.round(areaOf);
      return areaOf;
   } 
   private double calculatePerimeter()
   {
      double per = legA + legB + legC;
      Math.round(per);
      return per;
   } 
   
   //METHOD: calculates the length of a leg given two points using the distance formula
   private double calculateLength(MyPoint p1, MyPoint p2)
   {
      double distance = Math.sqrt( (p2.getY() - p1.getY()) * (p2.getY() - p1.getY())  
            +  (p2.getX() - p1.getX()) * (p2.getX() - p1.getX()) );
      return distance;
   }
   
   //METHOD: determines if right triangle: tests pythagorean theorem
   public boolean isRight()
   {
      boolean test = false;
      
      if (legC*legC == legA*legA + legB*legB)
         test = true;
      if (legB*legB == legA*legA + legC*legC)
         test = true;
      if (legA*legA == legB*legB + legC*legC)
         test = true;
      
      return test;
   }
   
   //METHOD: determines if isosceles triangle: tests if any 2 sides are equal
   public boolean isIsosceles()
   {
      boolean test = false;
      
      if (legA == legB || legB == legC || legC == legA)
      {
         test = true;
      }
      
      return test;
   }
   
   //METHOD: determines if equilateral triangle: tests if all 3 sides are equal
   public boolean isEquilateral()
   {
      boolean test = false;
      
      if (legA == legB && legB == legC && legC == legA)
      {
         test = true;
      }
      
      return test;
   }
   
   //METHOD: draws the triangle using DrawingPanel
   public void draw(Graphics g)
   {
      int factor = 20; //multiplied sides by this factor to make triangle bigger
      g.fillLine(factor*pA.getX(), factor*pA.getY(), factor*pB.getX(), factor*pB.getY());
      g.fillLine(factor*pA.getX(), factor*pA.getY(), factor*pC.getX(), factor*pC.getY());
      g.fillLine(factor*pB.getX(), factor*pB.getY(), factor*pC.getX(), factor*pC.getY());
   }
   
   //METHOD: custom toString
   public String toString()
   {
      String temp = "point A(" + pA.getX() + ", " + pA.getY() + ")\n" +
                    "point B(" + pB.getX() + ", " + pB.getY() + ")\n" +
                    "point C(" + pC.getX() + ", " + pC.getY() + ")\n";
      
      return temp;
   }
}//end class