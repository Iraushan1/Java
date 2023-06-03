package String;

import java.util.Scanner;

public class JobSeeker1 
{
	public static boolean validateUserName(String s)
	{
		if(s.length()-4>=8) {
			if(s.endsWith("_job"))
				return true;
			else  
				return false;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		String s;
		try( Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter user name: ");
			s=sc.nextLine();
		}
		System.out.println(validateUserName(s));
	}
}
