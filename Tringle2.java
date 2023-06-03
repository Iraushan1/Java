package Patterns;

public class Tringle2 
{
	public void tringle(int n)
	{
		for(int i=0; i<n; i++) 
		{
			for(int s=n-1; s>i; s--)
				System.out.print("  ");		//Due to Two Spaces are there then only proper answer comes
			for(int j=0; j<=i; j++)
				System.out.print("* ");		//Single space are there
			System.out.println();
		}
		
	}
	
	public void tringle1(int n)
	{
		for(int i=0; i<n; i++) 
		{
			for(int s=n-1; s>i; s--)
				System.out.print(" ");		//Due to single Spaces are there.
			for(int j=0; j<=i; j++)
				System.out.print("* ");		//Single space are there
			System.out.println();
		}
		
	}
	
}
