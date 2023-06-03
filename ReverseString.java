package String;


//wap to reverse the word in a given string input as:
//Ex: welcome to java => java to welcome.


import java.util.Scanner;
public class ReverseString 
{
	public static void printReverseString(String s)
	{
		String[] a=s.split(" ");
		for(int i=a.length-1; i>=0; i--)
			System.out.print(a[i]+" ");
	}

public static void main(String[] args) 
{
	String s;
	try( Scanner sc=new Scanner(System.in))
	{
		System.out.println("Enter String: ");
		s=sc.nextLine();
	}
	printReverseString(s);		
}
}





