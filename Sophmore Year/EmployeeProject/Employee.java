public class Employee implements CompanyABC
{
   //FIELDS
   private int hours;
   private double wage;
   private int vacationDays;
   private String vacationForm;
   
   //CONSTRUCTORS
   public Employee()
   {
      hours = 40;
      wage = 20;
      vacationDays = 10;
      vacationForm = "Yellow";
   }
   //INSTANCE METHODS:
   
   //Getters:
   public int getHours () {return hours;}
   public double getWage () {return wage;}
   public int getVacationDays () {return vacationDays;}
   public String getVacationForm () {return vacationForm;}
   
   public void setVacationDays(int vacationDays){this.vacationDays = vacationDays;}
   public void setVacationForm(String vacationForm){this.vacationForm = vacationForm;}
   public void setWadge(double wage){this.wage = wage;}
   
   //Setters:
   public double calculateYearlyWage()
   {
      double tot = getHours()*getWage()*52;
      return tot;
   }
   
   //Another getter for yearly wage
   public double getYearlyWage() 
   {
      double yearsWadge = 0;
      yearsWadge = calculateYearlyWage();
      return yearsWadge;
   }

   
   public String toString()
   {
      return "Hours per week: " + getHours() + "\n" +
             "Hourly wage: $" + wage + "\n" +
             "Vacation days: " + vacationDays + "\n" +
             "Vacation form: " + vacationForm + "\n" +     
             "Wage per year: $" + calculateYearlyWage(); 
   }
}