import java.util.*;

public class Rendezvous11015 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String[]  nombres;
        int n,e,x,y,c = 0, cont=1;
        int [][] matrizAdyacencia;
        n = in.nextInt();
        e = in.nextInt();
        
        while(n!=0)
        {
            nombres = new String[n];
            matrizAdyacencia = new int [n][n];
            for (int i = 0; i < n; i++) 
            {
                nombres[i] = in.next();
                for (int j = 0; j < n; j++) 
                {
                    matrizAdyacencia[i][j] = 2000;
                    if(i == j)
                        matrizAdyacencia[i][j] = 0;
                }
            }
            for (int i = 0; i < e; i++) 
            {
                x = in.nextInt()-1;
                y = in.nextInt()-1;
                c = in.nextInt();
                matrizAdyacencia[x][y] = c; matrizAdyacencia[y][x] = c;
            }
           matrizAdyacencia = floyd(matrizAdyacencia, n);
            int min = Integer.MAX_VALUE, mejor = 0 ,curr;
            for (int i = 0; i < n; i++) 
            {
                curr = 0;
                for (int j = 0; j < n; j++) 
                {
                    curr += matrizAdyacencia[i][j];
                }
                if(curr < min)
                {
                    min = curr;
                    mejor = i;
                }
            }
            System.out.println("Case #"+(cont)+" : "+nombres[mejor]);
            cont++;
            n = in.nextInt();
            e = in.nextInt();;
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