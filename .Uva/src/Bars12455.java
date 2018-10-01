import java.util.Scanner;

/**
Name: Grover A. Irusta Miranda
Company: CodeRoad - xTime
Date 01/10/2018
 */

public class Bars12455 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		for (int c = 0; c < cases; c++) {
			int n = in.nextInt();
			int p = in.nextInt();
			int[] bars = new int[p];
			for (int i = 0; i < p; ++i)
				bars[i] = in.nextInt();
			boolean flag = false;
			for (int mask = 0; mask < (1 << p); ++mask) {
				int sum = 0;
				for (int i = 0; i < p; ++i)
					if ((mask & (1 << i)) != 0)
						sum += bars[i];
				if (sum == n) {
					flag = true;
					break;
				}
			}
			System.out.println(flag ? "YES" : "NO");
		}
	}

}
