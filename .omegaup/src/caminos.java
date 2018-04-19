import java.util.Scanner;

/**
Name: Grover A. Irusta Miranda
Company: CodeRoad - xTime
Date 19/04/2018
 */

public class caminos {

	public static long f(int x) {
		int r = 1;
		for (int i = 2; i <= x; i++) {
			r *= i;
		}
		return r;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
	    n += 1;
	    m += 1;
	    int memo [][]= new int [33][33];
	    memo[n][m] = 1;
	    for( int i = n; i >= 0; i-- ){
	        for( int j = m; j >= 0 ; j-- ){
	            if( (i+1) <= n ){
	                memo[i][j] += memo[i+1][j];
	            }
	            if( (j+1) <= m ){
	                memo[i][j] += memo[i][j+1];
	            }
	        }
	    }
	    System.out.println(memo[1][1]);
	}

}
