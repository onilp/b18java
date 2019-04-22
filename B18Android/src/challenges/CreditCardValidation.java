package challenges;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CreditCardValidation {

	static String [] cardNumbers;
	static String [] prefix;
	// Map <String,String> result = new HashMap<>();

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File ("/Users/onil/git/b18javalocal/B18Android/src/challenges/input001.txt");
		Scanner scanner = new Scanner (file);

		while(scanner.hasNextLine())

		{
			prefix = scanner.next().split(",");
			int size = Integer.parseInt(scanner.next());
			cardNumbers= new String[size];
			for(int i=0; i < size;i++)
			{
				cardNumbers[i]=scanner.next();
			}

		}
		for(int i=0; i<cardNumbers.length;i++)
		{
			System.out.println("{card :" + cardNumbers[i] + ", isValid :" + isValid(cardNumbers[i])+", isAllowed :" + isAllowed(cardNumbers[i])+"}");
		}
	}
	public static int checkDigit(String s) {
		int sum = 0, digit = 0;
		for(int i=0; i < s.length()-1; i++)
		{
			digit = Integer.parseInt(s.charAt(i)+"");
			sum += (2*digit);
		}
		return(sum%10);
		//	return digit;
	}
	public static boolean isValid(String card)
	{
		if(checkDigit(card) == (int)(card.charAt(card.length()-1)))
			return true;
		return false;
	}
	public static boolean isAllowed(String number)
	{
		//for( String number : cardNumbers)
		for(int i=0; i<prefix.length;i++)
			if(number.startsWith(prefix[i]))
			{
				return false;
			}
		return true;		
	}
}