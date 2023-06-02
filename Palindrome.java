package String;
//Comparing to string
public class Palindrome 
{
	public static void checkStringArePalindrome(String s)
	{
		int i;
		String s1="";
		for(i=s.length()-1; i>=0; i--) {
			s1+=s.charAt(i);
		}
		if(s1.compareTo(s)==0)
			System.out.println("Palindrome string: ");
		else
			System.out.println("Not a palindrome string: ");
	}
}
