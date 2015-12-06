
import java.util.Scanner;

class PageHopping821 {
 
    public static void main(String[] args) {
        final int maxxx = 65000, limite=101;
        int nodo1, nodo2, caso=0;
        int matrizAdyacencia[][];
 
        Scanner in = new Scanner(System.in);
 
        while(true)
        {
            //if last test case exit
            nodo1 = in.nextInt();
            nodo2 = in.nextInt();
 
            if(nodo1==0 && nodo2 ==0)   
            	break;
 
            //init variables
            caso++;
            matrizAdyacencia= new int[101][101];
 
            for(int i=0;i < limite; i++)
                for(int j=0;j<limite;j++)
                    matrizAdyacencia[i][j] = maxxx;
 
            //read inputs
            do
            {
                matrizAdyacencia[nodo1][nodo2] = 1;
                matrizAdyacencia[nodo1][nodo1] = matrizAdyacencia[nodo2][nodo2] = 0;
 
                nodo1 = in.nextInt();
                nodo2 = in.nextInt();
 
            }while(nodo1>0 && nodo2>0);
 
            //Floyd Warshall algorithm
            matrizAdyacencia = floyd(matrizAdyacencia, limite);
            int nodos=0;
            float sum=0;
           
            for(int i=1; i < limite; i++)
            {
                for(int j=1;j<limite;j++)
                {
                    if( i==j && matrizAdyacencia[i][i] == 0) 
                    	nodos++;
                    else if(i!=j && matrizAdyacencia[i][j] != maxxx)
                    {
                        sum+=matrizAdyacencia[i][j];
                    }
                    //System.out.print(length[i][j]+"  ");
                }
                //System.out.println("\n");
            }
 
            float pairs = nodos * (nodos - 1);
            //System.out.println(sum + "/" + pairs);
        System.out.print("Case "+caso+": average length between pages = ");
        System.out.printf("%.3f clicks\n", (float)(sum/pairs));
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