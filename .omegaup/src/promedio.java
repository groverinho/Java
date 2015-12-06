import java.util.Scanner;


public class promedio {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int vector [] = new int [n];
		int aux =0;
		for (int i = 0; i < n; i++)
		{
			vector[i] = in.nextInt();
			aux = aux + vector[i];
			
		}
		double total = aux / n;
		System.out.printf("%.2f\n",total);
	}
}
