import java.util.Scanner;

public class StringManipulatorMain
{
	
	public static void main(String[] args) 
	{
		StringManipulator stringManipulator = new StringManipulator();
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter 1 for the noVowels method and 2 for the reverse method: ");
		int method = in.nextInt();
		in.nextLine();
		
		if (method == 1)
		{
			System.out.print("Please enter a word: ");
			String str = in.nextLine();
			System.out.print("Manipulated string: " + stringManipulator.noVowels(str));
		}
		else if (method ==2)
		{
			System.out.print("Please enter a word: ");
			String str = in.nextLine();
			System.out.print("Manipulated string: " + stringManipulator.reverse(str));
		}
		
		System.out.print("Would you like to play again? Enter 3 for yes and 4 for no: ");
		int answer = in.nextInt();
		in.nextLine();
		
		if (answer == 3)
		{
			boolean playAgain = true;
			while (playAgain)
			{
				
			}
		}
		else if (answer == 4)
		{
			System.out.print("Maybe next time!");
		}
	
	}

}
