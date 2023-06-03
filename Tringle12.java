package Patterns;

//This pattern is the combination of Tringle1 & Triangle2
public class Tringle12 
{
	public void tringle(int n)
	{
		int i,j,s;
		for(i=0; i<n; i++) 
		{
			for(j=0; j<=i; j++) 
				System.out.print("* ");
			for(s=n+n-2; s>i*2; s--) 
				System.out.print("  ");
			for(j=0; j<=i; j++)
				System.out.print("* ");
			System.out.println();
		}		
	}
}
