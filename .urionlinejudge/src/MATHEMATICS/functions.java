package MATHEMATICS;

import java.util.Scanner;

public class functions {

	public static void main(String[] args) {
	/*	The function that Rafael chose is r(x, y) = (3x)² + y².
		Beto chose the function b(x, y) = 2(x²) + (5y)².
		Carlos, however, chose the function c(x, y) = -100x + y³.*/
		Scanner in  = new Scanner(System.in);
		int casos  = in.nextInt();
		while (casos>0)
		{
			int x = in.nextInt();
			int y = in.nextInt();
			double r=0, b=0, c=0;
			r = Math.pow(3*x, 2)+ Math.pow(y, 2);
			b = (2*Math.pow(x, 2))+ Math.pow(5*y, 2);
			c =(-100*x)+ Math.pow(y, 3);
			if((r>b) && (r>c))
				System.out.println("Rafael ganhou");
			else
			{
				if((b>r) && (b>c))
					System.out.println("Beto ganhou");
				else
					System.out.println("Carlos ganhou");
			}
			casos--;
		}
		

	}

}
