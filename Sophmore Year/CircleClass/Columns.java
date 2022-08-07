public class Columns extends Cylinder
{
   //Feilds:
   private int number;
   private double totalVolumeAll;
   
   //Constructor:
   public Columns (double r, double h, int n)
   {
      super(r, h);
      number = n;
      totalVolumeAll = calculateVolume2();
   }
   //Instance methods:
   //Getters:
   public int getNumber(){return number;}
   public double getTotalVolume(){return totalVolumeAll;}
   
   public double calculateVolume2()
   {
      return super.calculateVolume() * getNumber();
   }

   public String toString()
   {
      return super.toString() + "\nTotal Number of Column(s): " + getNumber() 
                              + "\nTotal Amount of Volume: " + getTotalVolume();
   }
}