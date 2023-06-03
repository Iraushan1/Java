package String;

import java.util.Scanner;

/*Que-1)
A company transmits its String data over the network as encrypted data. The encryption logic is as shown given below. 
For a String ad the logic is as given 

a------->a+9=j 
d-------->d+9=m 

So the encrypted word would be jm. 
If on addition of 9 results in a char greater than z (ASCII value 122) do the encryption in a cyclic manner starting from 
a. So if any character is ‘z’ it should be (z+9) which is equal to 127>122. In this case the character would be 9 
character starting from ‘a’ which ‘i’ so for adz the encrypted value should be jmi Method Name 	encryptString.

Method Description 	  Encrypt the entered string 
Argument 	          String 
Return Type 	          String 

Logic 1. Perform the arithmetic operation of char data. 
*/

																			// || s.charAt(i)>113
public class Encrypted 
{
	public static String encryptedString(String s) 
	{
		String a="";
		for(int i=0; i<s.length(); i++)
		{ 
			if(s.charAt(i)>=65 && s.charAt(i)<=90)
			{
				if(s.charAt(i)>81)
					a+=(char)(s.charAt(i)-17);
				else
					a+=(char)(s.charAt(i)+9);
			}
		}
		return a;
	}
	public static void main(String[] args) 
	{
		String s;
		try( Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter Captal Letter String: ");
			s=sc.nextLine();
		}
		System.out.println(encryptedString(s));	
	}
}
