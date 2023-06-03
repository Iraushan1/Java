package Patterns;

import java.util.Scanner;

public class MainClass 
{
	public static void main(String[] args) 
	{
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter size of rows: ");
			int r=sc.nextInt();
			//int c=sc.nextInt();
			new Tringle1().tringle(r);
		}
	}
}
