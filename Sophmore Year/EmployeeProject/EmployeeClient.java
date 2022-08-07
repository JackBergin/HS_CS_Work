public class EmployeeClient 
{
   public static void main (String []args)
   {
      CompanyABC[] myCompany = new CompanyABC[4];
      
      myCompany[0] = new Secretary();
      myCompany[1] = new Lawyer();
      myCompany[2] = new Secretary();
      myCompany[3] = new Employee();
      
      for (int i = 0; i < myCompany.length; i++)
      {
         System.out.println(myCompany[i]);
         System.out.println();
      }
      practice(myCompany[1]);
   }
   
   
   public static void practice(CompanyABC abc) 
   {
      System.out.println(abc.calculateYearlyWage());
   }
   
   
}      
      
      /*
      //Employee Edna
      Employee edna = new Employee();
      System.out.println(edna);
      System.out.println(edna.getYearlyWage());
      
      
      //Employee Stan
      Secretary stan = new Secretary();
      System.out.println(stan);    
      stan.takeDictations("Hello World");
      System.out.println();
      
      
      //Lawyer Scott
      Lawyer scott = new Lawyer();
      System.out.println(scott);    
      System.out.println();
      */