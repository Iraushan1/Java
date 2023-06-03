package Patterns;

public class Tringle1234 
{
	public void tringle(int n) {
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
	for(i=1; i<n+n; i++)
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