public class PracticeExercise_02
{
	public static void main(String[]args)
	{
		String one = "two";
		String two = "one";
		String three = "1";
		
		int number = 20;
		
		sentence(one, two, 3);
		sentence(two, three, 14);
		sentence(three, three, number + 1);
		sentence(three, two, 1);
		sentence("eight", three, number / 2);
	}
	
	public static void sentence (String three, String one, int number)
	{
		System.out.println(one+" time " + three + " = " + (number *2));
	}
}