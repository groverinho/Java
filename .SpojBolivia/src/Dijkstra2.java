import java.util.*;


 class Dijkstra2 {
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt())
        {
        int v = in.nextInt();
        int origen = in.nextInt();
        int destino = in.nextInt();
        int[][] grafo = new int [v][v];
        for (int i = 0; i < v; i++) {
			for (int j = 0; j < v; j++) {
				grafo[i][j]=100000;
			}
			}
        for (int i = 0; i < v; i++) {
			for (int j = 0; j < v; j++) {
				grafo[i][j]= in.nextInt();
				if (grafo[i][j] == -1 || grafo[i][j] == 0)
					grafo[i][j] = 100000;
			}
		}
        int[][]result = null;
        result = floyd(grafo,v);
        System.out.println(result[origen-1][destino-1]);
        }
    }
    static int[][] floyd (int w [][],int v)
    {
    	for (int k = 0; k <v; k++) {
			for (int i = 0; i < v; i++) {
				for (int j = 0; j < v; j++) {
					if(i!=j)
						w[i][j]= Math.min(w[i][j],w[i][k]+w[k][j]);
				}
			}
		}
    	return w;
    }
}