package Patterns;

public class Tringle1 
{
	public void tringle(int r)
	{
		for(int i=0; i<r; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
