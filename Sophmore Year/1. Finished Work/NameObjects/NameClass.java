/**********************
Programmer: Jack Bergin
Class: AP Computer Science
Date: 3/24/17
Description: This class will take 
from the client a name one enters 
and allowes for that person to print 
out the name they entered 
or get the reverse order of their 
name among other things.
************************/
public class NameClass
{
   //FEILDS:
   private String firstName;
   private String middleInitial;
   private String lastName;
   
   //CONSTRUCTORS--------------------------------------------------------------
   public NameClass ()
   {
      this.firstName = firstName;
      this.middleInitial = middleInitial;
      this.lastName = lastName;
   }
   //INSTANCE METHODS-----------------------------------------------------------
   //SETTERS:
   public void setFirstName()
   {
      System.out.println(firstName);
   }
   public void setMiddleInitial()
   {
      System.out.println(middleInitial);
   }
   public void setLastName()
   {
      System.out.println(lastName);
   }
   
   //GETTERS:
   //Gives the normal order of the name and then gives it to name1 to print
   public String getNormalOrder()
   {
      String temp = firstName + " " + middleInitial + ". " + lastName;
      return temp;
   }
   //Flips over then gives number1 the full name to print
   public String getReverseOrder()
   {
      String temp = lastName + ", " + firstName + " " + middleInitial+". ";
      return temp;
   }
   //Automatically puts the name into the "name1" String
   public String toString()
   {
      String temp = firstName + " " + middleInitial + ". " + lastName;
      return temp;
   }
   //Getters for the first, middle and last names 
   public String getFirstName(){
      return firstName;}
   public String getMiddleName(){
      return middleInitial;}
   public String getLastName(){
      return lastName;}
}//end class