package Patterns;

public class Tringle21 
{
	public void tringle(int n)
	{
		int i,j,s;
		for(i=0; i<n; i++)
		{
			for(s=i; s<n-1; s++)
				System.out.print("  ");
			for(j=0; j<=i; j++)
				System.out.print("* ");
			for(j=1; j<=i; j++)
				System.out.print("* ");
			System.out.println();
		}
	}
}
