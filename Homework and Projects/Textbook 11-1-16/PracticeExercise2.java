import java.util.Scanner;

public class PracticeExercise2
{
    public static void main (String[] args)
    {
        inputBirthday();
    }	
    public static void inputBirthday()
    {
        @SuppressWarnings("resource")
		  Scanner input = new Scanner(System.in);
        System.out.println("On what day of the month were you born?");
        String bdayDay = input.nextLine();
        System.out.println("What is the name of the month in which you were born?");
        String bdayMonth = input.nextLine();
        System.out.println("During what year were you born?");
        String bdayYear = input.nextLine();
        System.out.println("You were born on " + bdayMonth+ " " + bdayDay+ ", "+ 
            bdayYear+".");    
    }
}