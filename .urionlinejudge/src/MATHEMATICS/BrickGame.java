package MATHEMATICS;
import java.util.Scanner;


public class BrickGame {

	public static void main(String[] args) 
	{
	Scanner in = new Scanner(System.in);
	int casos = in.nextInt();
	int c=1;
	while (casos>0) 
	{
		int n = in.nextInt();
		int[]vector = new int[n];
		int aux=0;
		int a=0;
		for (int i = 0; i < n; i++)
		{
			vector[i] = in.nextInt();
		}
		 aux = n/2;
		   a = vector[aux];

		System.out.print("Case "+c+++": ");
		System.out.printf("%.0f\n",Math.ceil(a));
	casos--;	
	}
	}

}
