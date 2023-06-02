package String;

public class SwapString 
{
	public static void swapTwoString(StringBuffer s1, StringBuffer s2)
	{
		System.out.println("Method 1 using third variable");
		StringBuffer s3;
		System.out.println(s1);
		System.out.println(s2);
		s3=s1;
		s1=s2;
		s2=s3;
		System.out.println(s1);
		System.out.println(s2);
		
	}
	public static void swapTwoString1(String s1, String s2)
	{
		System.out.println("Method 2 without using third variable");
		System.out.println(s1);
		System.out.println(s2);
		s2=s1+s2;
		s1=s2.substring(s1.length());
		s2=s2.substring(0,s1.length());
		System.out.println(s1);
		System.out.println(s2);
		
	}
}
