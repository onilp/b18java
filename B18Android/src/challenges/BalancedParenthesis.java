package challenges;
import java.util.*;

public class BalancedParenthesis {

	public static void main(String[] args) {
		String s = "{}()((())){}[{}]";
		balancedParenthesis(s);


	}
	public static void balancedParenthesis(String s) {
		Stack<Character> stack = new Stack<Character>();

		for(int i =0; i < s.length();i++)
		{
			/*
			 * if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i)=='[') {
			 * stack.push(s.charAt(i)); } else if(s.charAt(i) == ')' || s.charAt(i) == '}'
			 * || s.charAt(i)==']') { if((s.charAt(i) == ')' && (char)stack.peek() == '(')
			 * || (s.charAt(i) == '}' && (char)stack.peek() == '{') || (s.charAt(i) == ']'
			 * && (char)stack.peek() == '['))
			 * System.out.println("It is not a balanced parenthesis."); }
			 */
			try {
				
			switch(s.charAt(i)) {
			
			case '(': case '{': case '[': case '<':
				stack.push(s.charAt(i));
				break;
			case ')':
				if(stack.peek() == '(') {
					stack.pop();
					break;
					}
				else System.out.println("Not Balanced 1");
				return;
				
				
			case '}':
				if(stack.peek() == '{') {
					stack.pop();
					break;
					}
				else System.out.println("Not Balanced 2");
				return;
				
			case ']':
				if(stack.peek() == '[') {
					stack.pop();
					break;
					}
				else System.out.println("Not Balanced 3");
				return;
				
			case '>':
				if(stack.peek() == '<') {
					stack.pop();
					break;
				}
				else System.out.println("Not Balanced 4");
				return;
				
			}
			
		}
			catch (EmptyStackException e)
			{
				System.out.println(e);
			}
		}
		if(stack.isEmpty())
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");
		
	}
}
/**
 * [], ((())), {[()]},
 * /
 */