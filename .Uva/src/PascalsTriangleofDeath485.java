

import java.math.*;

public class PascalsTriangleofDeath485 {
	public static void main(String[] args) {
		int MAXN = 300;

		BigInteger[][] C = new BigInteger[MAXN][MAXN];
		
		for (int i = 0; i < MAXN; ++i)
			C[i][0] = C[i][i] = BigInteger.ONE;
		
		BigInteger max = BigInteger.TEN.pow(60);
		for (int i = 1; i < MAXN; ++i)
			for (int j = 1; j < i; ++j)
				C[i][j] = C[i - 1][j - 1].add(C[i - 1][j]);
		
		boolean ok = true;
		for (int i = 0; i < MAXN && ok; ++i) {
			for (int j = 0; j <= i; ++j) {
				if (C[i][j].compareTo(max) >= 0)
					ok = false;
				if (j > 0)
					System.out.print(" ");
				System.out.print(C[i][j]);
			}
			System.out.println();
		}
	}
}
