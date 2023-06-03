package Patterns;

public class Tringle43 
{
	public void tringle(int n)
	{
		int i,j,s;
		for(i=0; i<n; i++)
		{
			for(s=0; s<i; s++)
				System.out.print("  ");
			for(j=i; j<n; j++)
				System.out.print("* ");
			for(j=i+1; j<n; j++)
				System.out.print("* ");
			System.out.println();
		}
	}
}
