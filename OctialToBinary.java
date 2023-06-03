package String;

import java.util.Scanner;

public class OctialToBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Octal no(0-7): ");
		int n = sc.nextInt();
		String s="";
		while(n!=0) {
			int r = n%10;
			while(r!=0) {
				int c=r%2;
				s=c+s;
				r/=2;
			}
			for(int i=1; i<=s.length()%3; i++) {
				s=0+s;
			}
			n/=10;
		}
		
		if(n==0 && s.length()==0)
			s="000";
		System.out.println(s);
		int x=Integer.parseInt(s);
		int count  = 0;
		int sum = 0;
		while(x!=0) {
			int r=x%10;
			sum = (int) (sum+r*Math.pow(2, count));
			count++;
			x/=10;
		}
		System.out.println("After conversion decimal no = "+sum);
	}
}
