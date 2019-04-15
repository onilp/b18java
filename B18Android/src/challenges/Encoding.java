package challenges;
import java.util.*;

public class Encoding {

	static char [] letters;
	/**
	 * if a,e,i,o,u --> 1,2,3,4,5
	 * if y --> " "
	 * if numbers, use valueOf ().reverse();
	 * if constant charAt
	 * use String toLowerCase();
	 
	public static String replaceVowels(String string)
	{
		string.replace('a','1');
		string.replace('e','2');
		string.replace('i','3');
		string.replace('o','4');
		string.replace('u','5');
		
		return string;
	}**/
	
	public static void isVowel(char c)
	{
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' ||c == 'u')
			System.out.println(c + " is a Vowel.");
		
	}
	public static void isConsonant(char c)
	{
		String s = c +"";
		if (s.matches("[a-zA-Z&&[^aeiouy]]"))
			System.out.println(c + " is a Consonant.");
	}
	public static void isY(char c) 
	{
		String s = c+"";
		if(s.matches("[yY]"))
			System.out.println(c + " is Y.");
	}
	public static void isSpace(char c) 
	{
		if(c == ' ')
			System.out.println(c +" is a Space.");
	}
	public static void isSpecialChar(char c)
	{
		String s = c +"";
		if(s.matches("[^a-zA-Z&&[^0-9&&]]"))
			System.out.println(c + " is Special Character.");
			
			
	}
	
	
	
	public static void main(String [] args)
	{
		String input = "Hello World!";
		//expected output g2kk4yv4qkc!
		//System.out.println(replaceVowels(input));
		
		stringEncode(input);
		
	}
	
	//String s = "abcdefghijklmnopqrstuvwxz";
	
	public static void stringEncode(String str)
	{
		//String str1 = "";
		
		letters = str.toCharArray();
		for (char c : letters)
		{
			isConsonant(c);
			isY(c);
			isVowel(c);
			isSpace(c);
			isSpecialChar(c);
			
				
		}
		

		
		
		
	}
}
