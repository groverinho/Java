import java.util.Scanner;


public class CaisaAndSugar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int s = in.nextInt();
		int max = -1;
		for (int i = 0; i < n; i++)
		{
			int dolar = in.nextInt();
			int centavos = in.nextInt();
			if (dolar + centavos / 100.0 <= s) 
                max = Math.max(max, (100 - centavos) % 100);
		}
			System.out.println(max);

	}

}
