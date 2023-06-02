package String;

public class Reverse 
{
	public static void reverseString(String s)
	{
		System.out.println("Original string is: "+s);
		String s1="";
		for(int i=s.length()-1; i>=0; i--) {
			s1+=s.charAt(i);
		}
		System.out.println("Reverse string is: "+s1);
	}
	public static String reverseString1(String in) {
		if (in == null)
			throw new IllegalArgumentException("Null is not valid input");

		StringBuilder out = new StringBuilder();

		char[] chars = in.toCharArray();

		for (int i = chars.length - 1; i >= 0; i--)
			out.append(chars[i]);

		return out.toString();
	}
}
