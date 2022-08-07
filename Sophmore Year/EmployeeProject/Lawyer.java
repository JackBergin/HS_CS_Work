public class Lawyer extends Employee
{
   //FIELDS
   private double bonus;
   
   //CONSTRUCTORS
   public Lawyer ()
   {
      super();
      bonus = super.calculateYearlyWage() * 0.20;
      setVacationForm("Pink");
      setVacationDays(getVacationDays() + 5);
   }
   //INSTANCE METHODS:
   //Getter:
   public double getBonus() {return bonus;};
   //Setters:
   public double calculateYearlyWage()
   {
      double lawyerWage = getBonus() + super.calculateYearlyWage();
      return lawyerWage;
   }
   /*
   public double newWage()
   {
      double newWadge = calculateYearlyWage()/super.getHours()/56;
      super.getWage() = newWage;
      return;
   }
   */
   public void sue()
   {
       System.out.println("I'll see you in court!"); 
   }
}