public class StringCoderLab
{
   public static void main(String[] args) 
   {


   String origText = "Hello "; 
   System.out.println(origText);    
   
   char ch1 = origText.charAt(1); 
   System.out.println(ch1); 
     
   int temp = ch1 + 11;
   System.out.println(temp); 
   
   ch1 = (char)temp;//Type casting number back to character
   System.out.println(ch1); 

   }
}
