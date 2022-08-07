public class InsultGeneratorProgram
{
   public static void main (String []args)
   {
     String[] collomnA = {"artless", "beslubbering", "craven", "dorning","meuling"}; 
     String[] collomnB = {"clabbering", "rambling", "quivvering", "elf-skinned","knotty-pated "}; 
     String[] collomnC = {"toad", "acorn", "peanut", "fish", "frog"}; 
    
     int random1 = (int)(Math.random()*4+0);
     int random2 = (int)(Math.random()*4+0);
     int random3 = (int)(Math.random()*4+0);
     
     System.out.println("Thou art a " + collomnA[random1]+ ", " + collomnB[random2]+ ", "+ collomnC[random3]+"!!!");
   }
}