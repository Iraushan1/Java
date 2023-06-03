package String;

import java.util.Scanner;

//wap to convert all the case character with uppur case 
//ex: CoReJavA =>cOrEjAVa

//import java.util.Scanner.*;
public class UpperLower 
{
	public static String changeUpperToLower(String s)
	{
		String a="";
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
				a+=(char)(s.charAt(i)+32);
	
			else if(s.charAt(i)>='a' && s.charAt(i)<='z')
				a+=(char)(s.charAt(i)-32);	
		}
	return a;
	}
	public static void main(String[] args) 
	{
		String s;
		try( Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter String: ");
			s=sc.nextLine();
		}
		System.out.println(changeUpperToLower(s));
	}
}
