import java.util.*;
import java.io.*;

public class Commandos11463 {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int casos = Integer.parseInt(in.readLine());
		for (int caso = 1; caso <= casos; ++caso) 
		{
			int N = Integer.parseInt(in.readLine());
			int[][] matrizAdyacencia = new int[N][N];
			
			for (int i = 0; i < N; ++i) {
				Arrays.fill(matrizAdyacencia[i], 1000000000);
				matrizAdyacencia[i][i] = 0;
				
			}
	
			
			int R = Integer.parseInt(in.readLine());
			for (int i = 0; i < R; ++i) {
				String[] parts = in.readLine().split("[ ]+");
				int u = Integer.parseInt(parts[0]);
				int v = Integer.parseInt(parts[1]);
				
				matrizAdyacencia[u][v] = matrizAdyacencia[v][u] = 1;
			}
			
			String[] parts = in.readLine().split("[ ]+");
			int s = Integer.parseInt(parts[0]);
			int e = Integer.parseInt(parts[1]);
			
			matrizAdyacencia = floyd(matrizAdyacencia, N);
			
			int ans = 0;
			for (int i = 0; i < N; ++i)
				ans = Math.max(ans, matrizAdyacencia[s][i] + matrizAdyacencia[i][e]);
			System.out.println("Case " + caso + ": " + ans);
		}
	}
	static int[][] floyd (int w[][],int n)
	{
		for (int k = 0; k < n; k++) 
		{
			for (int i = 0; i < n; i++) 
			{
				for (int j = 0; j < n; j++) 
				{
					if(i!=j)
					w[i][j]=Math.min(w[i][j],w[i][k]+w[k][j]);//anadimos ruta minima en la posision
				}
			}
		}
		return w;
	}
}
