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
   
   private MyPoint pA; //points from our MyPoint class
   private MyPoint pB;
   private MyPoint pC;
   
   private double area;
   private double perimeter;
   
   private double legA; //length of leg
   private double legB;
   private double legC;
   
   private String type; //scalene, isosceles, right, equilateral
   
   
   
   //..........................................................
   //CONSTRUCTORS
   
   //constructor 1: receives 3 point objects
   public TriangleClass(MyPoint ptA, MyPoint ptB, MyPoint ptC)
   {
      pA = ptA; //assigns the point just passed to the field
      pB = ptB;
      pC = ptC;
      
      legA = calculateLength(pB, pC); //return method to calculate leg length
      legB = calculateLength(pA, pC);
      legC = calculateLength(pA, pB);
   }
   
   
   //..........................................................
   //INSTANCE METHODS
   
   //Setters (Mutators)
   public void setPointA(MyPoint pA) 
   {
      
   }
   
   public void setPointB(MyPoint pB) 
   {
   
   }
   
   public void setPointC(MyPoint pC) 
   {
      
   }
   
   //Getters (Accessors)
   
   
   
   
   

   //METHOD: determines the type of triangle based on length of legs
   
   /*
   private String calculateType()    
   {
   
      
   }
   
   //METHOD: calculates the area of the triangle based on Heron's theorem
   private double calculateArea()
   {
   
   
   } 
   */
   
   //METHOD: calculates the length of a leg given two points using the distance formula
   private double calculateLength(MyPoint p1, MyPoint p2)
   {
      double distance = Math.sqrt(Math.pow( (p2.getY() - p1.getY()), 2 ) 
                                + Math.pow( (p2.getX() - p1.getX()), 2 ));
      return distance;
   
   
   }
   
   /*
   
   //METHOD: determines if right triangle: tests pythagorean theorem
   public boolean isRight()
   {
   
   
   }
   
   //METHOD: determines if isosceles triangle: tests if any 2 sides are equal
   public boolean isIsosceles()
   {
   
   
   }
   
   //METHOD: determines if equilateral triangle: tests if all 3 sides are equal
   public boolean isEquilateral()
   {
   
   
   }
   
   //METHOD: draws the triangle using DrawingPanel
   public void draw(Graphics g)
   {
   
   
   }
   
   //METHOD: custom toString
   public String toString()
   {
   
   
   }
   
   */
}//end class
   
