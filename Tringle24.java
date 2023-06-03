package Patterns;

public class Tringle24 
{
	public void tringle(int n)
	{
		int i,j,s;
		for(i=0; i<n; i++)
		{
			for(s=n-1; s>i; s--)
				System.out.print("  ");
			for(j=0; j<=i; j++)
				System.out.print("* ");
			System.out.println();
		}
		for(i=1; i<n; i++)
		{
			for(s=0; s<i; s++)
				System.out.print("  ");
			for(j=n; j>i; j--)
				System.out.print("* ");
			System.out.println();
		}
	}
}
