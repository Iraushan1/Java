package array;

import java.util.Scanner;
public class PrimeNoBetween {
	public  static void findPrimeNo(int arr[]) {
		boolean b=false;
		for(int i=0; i<arr.length; i++) {
			b=false;
			int n=arr[i];
			for(int j=2; j<=n/2; j++) {
				if(n%j==0) {
					b=true;		//true means given no has a more than two factor.
					break;
				}					
			}
			if(b==false)
				System.out.println("It is a Prime No : "+arr[i]);
		}
	}
	static public void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++)
			arr[i]=sc.nextInt();
		
		findPrimeNo(arr);
		sc.close();
	}
}
