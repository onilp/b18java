package strings;
import java.util.*;
public class StringExample {
	
	public static void main(String args[]){  
		String s1 = "Sachin";//creating string by java string literal    
		String s2 = new String("Sachin");//creating java string by new keyword    
		String s3 = "Sachin";
		String s4 = new String ("sachin");
		String s5 = "Tendulkar";
		int x = 10;
		StringBuffer sb = new StringBuffer("Hello ");
		Student abdul = new Student(5,"abdulansari",20);
		String s6 = s1+ " " +s5;
		System.out.println(abdul);
		StringTokenizer st = new StringTokenizer(s6," ");
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken() + " ");
		}
		
		
	/**	System.out.println(sb);
		sb.append(s1);
		System.out.println(sb);
		System.out.println(sb.replace(2, 4, "temp"));

		System.out.println(s1.equals(s2));
		System.out.println(s1==s3);
		System.out.println(s1.compareTo(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s3==s4);
		System.out.println(s3.compareTo(s4));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		System.out.println(s1.concat(s5));
		System.out.println(s1+s2+10);
		System.out.println(10 + 20 +s1+s2);
		System.out.println(s1.substring(2));
		System.out.println(s5.substring(3,6));
		System.out.println(String.valueOf(x));
		**/
		
	}
}
