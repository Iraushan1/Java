package String;

//Write a program to take one string and find the no of maximum occurrence of character.
import java.util.Scanner;
public class StringOccurrence1 
{
	public static void findMaxOccuramce(String s) {
		int count=0;
		char ch3 = 0;
		int max = 0;
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			count=0;
			for(int j=0; j<s.length(); j++) {
				char ch1=s.charAt(j);
				if(ch==ch1)
					count++;
			}
			if(max<count) {
				max=count;
				ch3=ch;
			}
		}
		System.out.println(ch3+" "+max);
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String s=sc.nextLine();
		findMaxOccuramce(s);
	}
}
