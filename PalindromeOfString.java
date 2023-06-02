package String;

import java.util.Scanner;

public class PalindromeOfString {
	public static void findPalindromeWord(String s) {
		String s1[]=s.split(" ");
		
		for(String word:s1) {
			String temp="";
			for(int i=word.length()-1; i>=0; i--) {
				temp+=word.charAt(i);
			}
			if(word.equals(temp))
				System.out.print(word+", ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string");
		String s=sc.nextLine();		
		findPalindromeWord(s);
	}
}
