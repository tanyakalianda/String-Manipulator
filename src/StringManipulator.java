
public class StringManipulator 
{
	public String noVowels(String str)
	{
		String someString = "";
		for (int i = 0; i < str.length(); i++) //position is 1 less than length -> continues until posiiton is 1 less than length (b/c thats the number of characters in the string)
		{
			char letter = str.charAt(i);
			if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')
			{
				someString += "*";
			}
			else
			{
				someString += letter;		
			}
		}
		return someString;
	}
	
	
	public String reverse(String str)
	{
		String someString = "";
		for (int i = str.length()-1; i>=0; i--)
		{		
			char letter = str.charAt(i);
			someString += letter;	
		}
		return someString;
	}
}

