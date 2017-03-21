

import java.util.Scanner;

/**
Name: Grover Irusta M.
Date: 2017
 */
public class BuscayEncuentra {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int p = in.nextInt();
		int c=0;
		for (int i = 0; i < n; i++) {
			int r = in.nextInt();
			if (r==p) {
				System.out.println(i);
				c++;
			}
		}
		if (c==0) {
			System.out.println(p+" no encontrado");
		}
		
	}

}
