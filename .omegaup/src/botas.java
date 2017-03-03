import java.util.Scanner;

public class botas {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int []cartas = new int [1000000];
		for (int i = 0; i < n; i++) {
			cartas[in.nextInt()]++;
		}
		int c =0;
		for (int i = 0; i < cartas.length; i++) {
			if (cartas[i]%2!=0) {
				c++;
			}
		}
		System.out.println(c);

	}

}
