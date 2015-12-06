package BEGINNER;

import java.util.Scanner;


public class EvenSquare {

	public static void main(String[] args)
	{
		Scanner in  = new Scanner(System.in);
		/*int n =in.nextInt();
		for (int i = 2; i <=n; i++) 
		{
			if (i%2==0) 
			{
				System.out.println(i+"^2 = "+(i*i));
			}
		}*/
		System.out.println(Euclides(0, 0));
		
//6^2 = 36
	}
	 public static int Euclides(int a, int b) {
			int r=b;
			while (b> 0){
			r=a%b;
			a=b;
			b=r;
			}
			return (a);
	}

}
