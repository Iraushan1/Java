package String;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any binary no: ");
		int n=sc.nextInt();
		int count  = 0;
		int sum = 0;
		while(n!=0) {
			int r=n%10;
			sum = (int) (sum+r*Math.pow(2, count));
			count++;
			n/=10;
		}
		System.out.println("After conversion decimal no = "+sum);
	}
}
