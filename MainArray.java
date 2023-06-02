package Array;

import java.util.Scanner;
public class MainArray 
{
	public static void main(String[] args) 
	{
		int opt=0;
		char ch;
		String s1;
		String s2;
		int n;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("************MENU OF Array************\n");
			System.out.println("1. Mearging of two arrays:");
			System.out.println("2. Reverse array element:");
			System.out.println("3. Remove duplicate element im an array:");
			System.out.println("4. Printl all missing array element in an array:");
			System.out.println("5. Enter -ve and +ve No. and arrange into alternate position:");
			System.out.println("6. Find the Union of two arrays:");
			System.out.println("7. Find Frequency of all the elements of the array:");
			System.out.println("8. Find mean of the subArray which is equal to k'th elements");
			System.out.println("0. Exit ");
			System.out.print("Enter your choice:");
			opt=sc.nextInt();
			
			switch(opt)
			{
			case 1: 
					System.out.print("Enter 1st array size: ");
					int n1=sc.nextInt();
					int a1[]=new int[n1];
					System.out.print("Enter "+n1+" element: ");
					for(int i=0; i<n1; i++)
						a1[i]=sc.nextInt();
					System.out.print("Enter 2nd array size: ");
					int n2=sc.nextInt();
					int a2[]=new int[n2];
					System.out.print("Enter "+n2+" element: ");
					for(int i=0; i<n2; i++)
						a2[i]=sc.nextInt();
					MeargeSortTwoArray.meargeTwoArray(a1, a2);
					break;
			case 2: 
					System.out.println("Enter array size: ");
			        n=sc.nextInt();
			        int a[]=new int[n];
			        System.out.print("Enter "+n+" element: ");
					for(int i=0; i<n; i++)
						a[i]=sc.nextInt();
					Reverse.reverseArray(a);
					break;
			case 4:
					System.out.print("Enter array size:");
					n=sc.nextInt();
					int x[]=new int[n];
					System.out.println("Enter "+n+" element:");
					for(int i=0; i<n; i++)
						x[i]=sc.nextInt();
					MissingEle.findElement(x);
					break;
			case 5:
					System.out.print("Enter array size:");
					n=sc.nextInt();
					int arr[]=new int[n];
					System.out.println("Enter "+n+" element:");
					for(int i=0; i<n; i++)
						arr[i]=sc.nextInt();
					AlternateDigit.alternateDigit(arr);
					break;
			case 6: 
					System.out.print("Enter the size of 1st ayyars: ");
					n1=sc.nextInt();
					int arr1[]=new int[n1];
					for(int i=0; i<n1; i++) {
						arr1[i]=sc.nextInt();
					}
					System.out.print("Enter the size of 2st ayyars: ");
					n2=sc.nextInt();
					int arr2[]=new int[n2];
					for(int i=0; i<n2; i++) {
						arr2[i]=sc.nextInt();
					}
					UnionOfTwoArray.meargeArray(arr1, arr2);
					break;
			case 7:
					System.out.print("Enter array size: ");
					n1 = sc.nextInt();
					int arr3[] = new int[n1];
					for(int i=0; i<n1; i++) {
						arr3[i] = sc.nextInt();
					}
					FrequencyOfElement.printFrequencyOfElement(arr3);
					break;
			case 8: 
					System.out.print("Enter array aize: ");
					n=sc.nextInt();
					int arr4[]=new int[n];
					System.out.println("Enter array elements");
					for(int i=0; i<n; i++) {
						arr4[i] = sc.nextInt();
					}
					System.out.println("Enter kth element");
					int k=sc.nextInt();
					MeanOfSubArray.print(arr4, k);
					break;
			default:
					System.out.println("Invalid option:");
			}
			System.out.print("\nDo you want to continue press Y/N:");
			ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
	}
}
