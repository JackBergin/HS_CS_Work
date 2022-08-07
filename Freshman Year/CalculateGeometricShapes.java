/*
File: CalculateGeometricShapes.java
Programmer: Your Name
Class: Intro CS, E-block
Date: 12/16/15

This program is for practicing writing formulas to calculate
areas, volumes, and surface areas for numerouse geometric shapes.
*/


public class CalculateGeometricShapes
{
   public static void main (String[] args)
   {
      //constants
      final double PI = 3.14159;  //could also use Math.PI
      
      //input values
      //declare and assign variables
      double side_a = 18;     // a, side of shape
      double side_b = 15;     // b, side of shape
      double side_c = 10;     // c, side of shape
      
      double height = 25;     // h, height
      
      double side_s = 4.5;    // s, side of a square 
      
      double radius = 12;     // r, radius of a circle
      
      
      //values that will be calculated
      //declare variables
      double perimeter;       // P
      double area;            // A
      double volume;          // V
      double surfaceArea;     // S
   
      //Now, calculate Area, Perimeter, and Surface Area for the following shapes
      System.out.println("Square:");
      perimeter = 4*side_s;
      area = side_s*side_s;
      System.out.println("The perimiter is " + perimeter);
      System.out.println("The area is " + area);
      System.out.println();
      
      System.out.println("Rectangle:");
      perimeter = (side_a*2)+ (side_b*2);
      area = side_a*side_b;
      System.out.println("The perimiter is " + perimeter);
      System.out.println("The area is " + area);
      System.out.println();
      
      System.out.println("Circle:");
      perimeter = 2*PI*radius;
      area = PI*(radius*radius);
      System.out.println("The perimiter is " + perimeter);
      System.out.println("The area is " + area);
      System.out.println();
      
      System.out.println("Triangle:");
      perimeter = side_a + side_b + side_c;
      area = (0.5 * side_b) * height;
      System.out.println("The perimiter is " + perimeter);
      System.out.println("The area is " + area);
      System.out.println();
      
      System.out.println("Parallelogram:");
      perimeter = 2*side_a + 2*side_b;
      area = side_b * height;
      System.out.println("The perimiter is " + perimeter);
      System.out.println("The area is " + area);
      System.out.println();

      System.out.println("Sphere:");
      surfaceArea = 4*PI*(radius*radius);
      volume = (4.0*PI*radius*radius*radius)/3;
      System.out.println("The Surface Area is " + surfaceArea);
      System.out.println("The Volume is " + volume);
      System.out.println();

      System.out.println("Rectangular Box:");
      surfaceArea = (2*side_a*side_b)+(2*side_b*side_c)+(2*side_c*side_a);
      volume = surfaceArea*surfaceArea*surfaceArea;
      System.out.println("The Surface Area is " + surfaceArea);
      System.out.println("The Volume is " + volume);
      System.out.println();
       
      System.out.println("Cube:");
      surfaceArea = 6 * side_s;
      volume = side_s * side_s * side_s;
      System.out.println("The Surface Area is " + surfaceArea);
      System.out.println("The Volume is " + volume);
      System.out.println();
      
      System.out.println("Cylinder:");
      surfaceArea = (radius+height)*PI*2*radius;
      volume = PI*(radius*radius)*height;
      System.out.println("The Surface Area is " + surfaceArea);
      System.out.println("The Volume is " + volume);
      System.out.println();
           
   }
}