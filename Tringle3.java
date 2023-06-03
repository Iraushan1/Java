package Patterns;

public class Tringle3 
{
	public void tringle(int n)
	{
		for(int i=0; i<n; i++) 
		{
			for(int j=n; j>i; j--)
				System.out.print("* ");
			System.out.println();
		}
	}
}
