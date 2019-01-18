import java.util.Scanner;

public class GradeReport 
{
	public static void main(String[] args)
	{
		int grade, category;
		
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		
		 do
		 {
			 System.out.println("This program lets you know how you did in your class!\n"
			 		+ "Once you have entered in 5 grades the program will exit!");
			 System.out.println("------------------------------------------------------");
			 System.out.println("Enter a numeric grade (0 to 100): ");
				grade = scan.nextInt();
				category = grade / 10;
			 System.out.print("The result from your entered grade: ");
		{
		switch(category)
		{
		case 10:
			System.out.println("Congrats on the perfect score!");
			count++;
			break;
		case 9:
			System.out.println("You got an A! Woohoo!");
			count++;
			break;
		case 8:
			System.out.println("You got a B! Not too shabby!");
			count++;
			break;
		case 7:
			System.out.println("C's get degrees!");
			count++;
			break;
		case 6:
			System.out.println("Oh No! You need to improve that grade!");
			count++;
			break;
		default:
			System.out.println("Uh oh you failed! :(");
			count++;
		}
		
		}
	  }
		while(count < 5);
	 }
}

