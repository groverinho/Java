import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class graphConnectivity {
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
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int casos = Integer.parseInt(in.readLine());
		in.readLine();
		int n=0,a=0,b=0,c=0;
		while (casos-->0)
		{
			//System.out.println(cad);
			n = in.readLine().charAt(0)- 'A'+1;
			//System.out.println(n);
			initSet(n);
			String cad2;
			//String aux2 = in.nextLine();
			//int aux = Integer.parseInt(aux2);
			//while(aux-->0)
			while ((cad2= in.readLine() )!=null)
			{
				if (cad2.isEmpty())
					break;
				a = cad2.charAt(0)-'A'+1;
				b = cad2.charAt(1)-'A'+1;
				unionSet(a-1, b-1);
			}
			Set<Integer> set = new HashSet<Integer>();
			for (int i = 0; i < n; i++) 
			{
				set.add(findSet(i));
			}
			if (c==0)
			{
				System.out.println(set.size());
				c++;
			}
			else
				System.out.println("\n"+set.size());
		}

	}
	
}
