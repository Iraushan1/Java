package String;

//wap to reverse the word in a given string input as:
//Ex: welcome to java => java to welcome.

public class ReverseWordByWord 
{
	public static void printReverseString(String s)
	{
		String[] a=s.split(" ");
		for(int i=a.length-1; i>=0; i--) {
			System.out.print(a[i]+" ");
		}
	}
}





