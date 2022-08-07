

public class ApPrep
{
     public static void main (String[] args)
     {
          char count = 0;
		    int inVal = 0;
		    int out; 
		    int kk=1; 
		    int mm=32767;
		    while (kk > 0){
		        inVal = (mm + kk)/kk;
		        //out = myFunction(inVal);
		        mm /= 2;
		        kk = kk + 3;
              	     System.out.println("KK Value: " + kk);

		    }
	     System.out.println("MM Value: " + mm);
	     System.out.println("In_Val Value: " + inVal);
	     System.out.println("Count Value: " +count);
     }
}

