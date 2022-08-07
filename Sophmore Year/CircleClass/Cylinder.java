public class Cylinder extends Circle
{
   //Feilds:
   private double height;
   private double surfaceArea;  
   private double volume;
   //Constructor:
   public Cylinder (double r, double h)
   {
      super(r);
      
      height = h;
      surfaceArea = getCircumference() * getHeight() * 2 * super.getArea();
      volume = calculateVolume();
   }
   //Instance methods:
   //Getters:
   public double getHeight(){return height;}
   public double getSurfaceArea(){return surfaceArea;}
   public double getVolume(){return volume;}
   
   public double calculateVolume()
   {
      return getArea() * getHeight();
   }
   public String toString()
   {
      return super.toString() + "\nHeight of the Cylinder: " + getHeight() + 
                               "\nSurfaceArea of Cylinder: " + getSurfaceArea() + 
                                    "\nVolume of Cylinder: " + getVolume();
   }
}