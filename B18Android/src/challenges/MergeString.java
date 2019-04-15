package challenges;

public class MergeString {
	
	public static void main(String [] args)
	{
		String a = "xyz";
		String b = "abcdefg";
		System.out.println(mergeStrings(a,b));
	}	
	public static String mergeStrings(String a, String b)
	{
		String ab="";
		int i=0, j=0;
		while(i!=a.length()&&j!=b.length())
		{
			ab+=a.charAt(i++);
			ab+=b.charAt(j++);
		}
		while(i!=a.length())
		{
			ab+=a.charAt(i++);
		}
		while(j!=b.length())
		{
			ab+=b.charAt(j++);
		}
		return ab;
	}
}
