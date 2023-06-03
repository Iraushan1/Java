package Patterns;

public class Tringle13 
{
	public void tringle(int n)
	{
		int i,j;
		for(i=0; i<n; i++)
		{
			for(j=0; j<=i; j++)
				System.out.print("* ");
			System.out.println();
		}
		for(i=1; i<n; i++)
		{
			for(j=n; j>i; j--)
				System.out.print("* ");
			System.out.println();
		}
	}
}
