import java.util.Scanner;

public class StringManipulatorMain
{
	
	public static void main(String[] args) 
	{
		StringManipulator stringManipulator = new StringManipulator();
		Scanner in = new Scanner(System.in);
		
		boolean play = true;
		while (play)
		{
			System.out.print("Please enter 1 for the noVowels method and 2 for the reverse method: ");
			int method = in.nextInt();
			in.nextLine();
			
			if (method == 1)
			{
				System.out.print("Please enter a word: ");
				String str = in.nextLine();
				System.out.println("Manipulated string: " + stringManipulator.noVowels(str));
				play = false;
			}
			else if (method == 2)
			{
				System.out.print("Please enter a word: ");
				String str = in.nextLine();
				System.out.println("Manipulated string: " + stringManipulator.reverse(str));
				play = false;
			}
			else
			{
				System.out.print("Not an acceptable number. Please try again: ");
				method = in.nextInt();
				in.nextLine();
			}	
		}
			
		System.out.print("Would you like to play again? Enter 3 for yes and 4 for no: ");
		int answer = in.nextInt();
		in.nextLine();
		
		boolean playAgain = true;
		while (playAgain)
		{
			if (answer == 3)
			{
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
					System.out.println("Manipulated string: " + stringManipulator.reverse(str));
				}
				
				System.out.print("Would you like to play again? Enter 3 for yes and 4 for no: ");
				answer = in.nextInt();
				in.nextLine();
			}	
			else if (answer == 4)
			{
				System.out.print("Maybe next time!");
				playAgain = false;
			}
			else
			{
				System.out.print("Not an acceptable number. Try again: ");
				answer = in.nextInt();
				in.nextLine();				
			}
		}
	}
}
