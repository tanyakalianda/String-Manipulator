
public class StringManipulator 
{
	public String noVowels(String someString)
	{
		for (int i = 0; i < someString.length(); i++) //position is 1 less than length -> continues until posiiton is 1 less than length (b/c thats the number of characters in the string)
		{
			char letter = someString.charAt(i);
			if (letter == 'a' || letter == 'A')
			{
				String symbol = "*";
				return symbol;
			}
			if (letter == 'e' || letter == 'E')
			{
				String symbol = "*";
				return symbol;
			}
			if (letter == 'i' || letter == 'I')
			{
				String symbol = "*";
				return symbol;
			}
			if (letter == 'o' || letter == 'O')
			{
				String symbol = "*";
				return symbol;
			}
			if (letter == 'u' || letter == 'U')
			{
				String symbol = "*";
				return symbol;
			}
			else
			{
				String somestring = "";
				someString += letter;
				return letter;
			}
		}
		
		
	public 	
	}
		
}

