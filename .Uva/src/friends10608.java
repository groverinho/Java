/*
2
3 2
1 2
2 3
10 12
1 2
3 1
3 4
5 4
3 5
4 6
5 2
2 1
7 1
1 2
9 10
8 9
 */
import java.io.*;
import java.util.Scanner;

public class friends10608 {
	static int[] pset;
	static int[] rank;
	
	static void initSet(int N) {
		pset = new int[N];
		rank = new int[N];
		
		for (int i = 0; i < N; ++i) 
		{
			pset[i] = i;
			rank[i] = 0;
		}
	}
	
	static int findSet(int i) {
		return (pset[i] == i) ? i : (pset[i] = findSet(pset[i]));
	}
	
	static void unionSet(int i, int j) {
		int pi = findSet(i);
		int pj = findSet(j);
		
		if (rank[pi] > rank[pj])
			pset[pj] = pi;
		else
			pset[pi] = pj;
		if (rank[pi] == rank[pj])
			++rank[pj];
	}
	
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		
		int casos = in.nextInt();
		while (casos-- > 0) {
			
			int n = in.nextInt();
			int m = in.nextInt();
			
			if (n == 0 && m == 0)
				break;
			
			initSet(n);
			
			for (int i = 0; i < m; ++i) 
			{
				int x = in.nextInt() - 1;
				int y = in.nextInt() - 1;
				unionSet(x, y);
			}
			
			int[] contador = new int[n];
			for (int i = 0; i < n; i++)
				contador[findSet(i)]++;
			
			int max = 0;
			for (int i = 0; i < n; i++)
				max = Math.max(max, contador[i]);
			System.out.println(max);
		}

	}
}
