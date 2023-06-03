package String;

/*Que-2)
____________________________________________
Create a method to check if a number is an increasing number

Method Name 	        checkNumber 
Method Description 	Check if a number is an increasing number 
Argument 	        String number 
Return Type 	        boolean 

Logic 	A number is said to be an increasing number if no digit is exceeded by the digit to its left. 
For Example : 134468 is an increasing number 
*/

import java.util.Scanner;
public class IncNo 
{
	public static boolean checkNumber(String s)
	{
		boolean f=true;
		String a="";
		for(int i=1,j=0; i<s.length(); i++,j++)
		{
			a+=s.charAt(j);
			if(s.charAt(i)<a.charAt(j))
			{
				f=false;
				break;
			}
		}
		return f;
	}
	public static void main(String[] args) 
	{
		String s;
		try( Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter String number: ");
			s=sc.nextLine();
		}
		//System.out.println(s);
		System.out.println(checkNumber(s));
	}
}
