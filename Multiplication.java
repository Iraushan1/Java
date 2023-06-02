package array;

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the order of 1st array :");
		System.out.print("Enter row :");
		int r1=sc.nextInt();
		System.out.print("Enter column :");
		int c1=sc.nextInt();
		int arr1[][]=new int[r1][c1];
		System.out.println();
		for(int i=0; i<r1; i++) {
			for(int j=0; j<c1; j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the order of 2st array :");
		System.out.print("Enter row :");
		int r2=sc.nextInt();
		System.out.print("Enter column :");
		int c2=sc.nextInt();
		int arr2[][]=new int[r2][c2];
		System.out.println();
		for(int i=0; i<r2; i++) {
			for(int j=0; j<c2; j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		mul(arr1, arr2);
	}
	public static void mul(int arr1[][], int arr2[][]) {
		int sum=0;
		for(int r=0; r<arr1.length; r++) {
			for(int c=0; c<arr2.length; c++) {
				sum=0;
				for(int k=0; k<arr1.length; k++) {
					sum+=arr1[r][k]*arr2[k][c];
				}
				System.out.print(sum+" ");
			}
			System.out.println();
		}
	}
}
