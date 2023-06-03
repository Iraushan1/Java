package String;

/*Program-1
=========
Create a class containing a method to create the mirror image of a String. The method should return the two Strings separated with a pipe(|) symbol .

Method Name 	getImage 
Method Description 	Generate the mirror image of a String and add it to the existing string. 
Argument	 	String 
Return Type 	String 
Logic 			Accepts One String 
Find the mirror image of the String 
Add the two Strings together separated by a pipe(|) symbol. 
For Example 
Input : EARTH 
Output : EARTH|HTRAE 
Hint: Use StringBuffer API (Ex: For this problem reverse method in Stringbuffer can be used) 
Note: Learn the other APIs in StringBuffer 
*/

import java.util.Scanner;
public class Image 
{
	public static String getImage(String s)
	{
		String a="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			a=a+s.charAt(i);
		}
		 return s+"|"+a;
	}
	public static void main(String[] args) 
	{
		String s;
		try( Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter string value: ");
			s=sc.nextLine();
		}
		System.out.println(getImage(s));
	}
}
