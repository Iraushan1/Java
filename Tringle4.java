package Patterns;

public class Tringle4 
{
	public void tringle(int n)
	{
		for(int i=0; i<n; i++) {
			for(int s=0; s<i; s++)
				System.out.print("  ");
			for(int j=i; j<n; j++)
				System.out.print("* ");
			System.out.println();
		}
	}
}
