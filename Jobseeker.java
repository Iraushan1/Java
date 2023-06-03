package String;

/*Que-3)
You are asked to create an application for registering the details of jobseeker. The requirement is: 
Username should always end with _job and there should be atleast minimum of 8 characters to the left of _job. 
Write a function to validate the same. Return true in case the validation is passed. In case of validation failure return false.

Method Name 	        validateUserName 
Method Description 	Checks if the username is valid 
Argument 	        String userName 
Return Type 	        boolean 

Logic 	Checks if the username ends with _job and contains at least 8 characters to the left of _job.
If valid return true. Else return false. 
*/

import java.util.Scanner;
public class Jobseeker 
{
	public static boolean validateUserName(String s)
	{
		
		String s1="";
		String x="boj_";
		boolean b=false;
		if(s.length()-4>=8)
		{
			for(int i=s.length()-1,j=1; i>=0; i--,j++)
			{
				s1+=s.charAt(i);
				if(j==4)break;
			}
			if(x.equals(s1))
				b=true;
		}
	return b;		
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
