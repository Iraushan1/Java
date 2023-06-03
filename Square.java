package Patterns;

public class Square 
{
	public void print(int r, int c) {
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
