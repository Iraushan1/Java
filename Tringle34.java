package Patterns;

public class Tringle34 
{
	public void tringle(int n)
	{
		int i,j,s;
		for(i=0; i<n+n; i++)
		{
			for(j=n; j>i; j--) 
				System.out.print("* ");
			for(s=0; s<i*2; s++)
				System.out.print("  ");
			for(j=i; j<n; j++)
				System.out.print("* ");
			System.out.println();
		}
	}
}
