

import java.util.Arrays;
import java.util.Scanner;

 class fashion1025 
{
	public static void main(String[] args) {

	Scanner in = new Scanner(System.in);
	int casos = in.nextInt();
	for (int i = 0; i < casos; i++) 
	{
		int n = in.nextInt();
		int[] men = new int[n];
		int[] women = new int[n];
		for (int j = 0; j < n; j++)
			men[j] = in.nextInt();
		for (int j = 0; j < n; j++)
			women[j] = in.nextInt();
		Arrays.sort(men);
		Arrays.sort(women);
		int sum = 0;
		for (int j = 0; j < n; j++)
			sum += men[j] * women[j];
		System.out.println(sum);
	}
	
	}

}
