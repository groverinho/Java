package GRAPH;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class MillasToChicago
{

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		while (true) 
		{
			int nodo = entrada.nextInt();//cantidad de nodos
			if (nodo== 0)
				break;
			
			int n = entrada.nextInt();//cantidad de vertices - conexiones
			double [][] matrizAdyacencia = new double[nodo][nodo];
			// inicio todas las posiciones de mi matriz en 0
			for (int i = 0; i < matrizAdyacencia.length; i++) 
				for (int j = 0; j < matrizAdyacencia.length; j++) 
					matrizAdyacencia[i][j]=0.0;
			//cargamos inicio, fin y pesos hasta n (cant de conexiones)
			for (int i = 0; i < n; i++) 
			{
					int a = entrada.nextInt();
					int b = entrada.nextInt();
					int peso = entrada.nextInt();
					matrizAdyacencia[a-1][b-1]=peso/100.0;
					matrizAdyacencia[b-1][a-1]=peso/100.0;
			}
			double[][]nueva = floyd(matrizAdyacencia,nodo);
//			for (int i = 0; i < matrizAdyacencia.length; i++)
//			{
//				for (int j = 0; j < matrizAdyacencia.length; j++)
//				{
//					System.out.print(matrizAdyacencia[i][j]+"\t");
//				}
//				System.out.println();
//			}
			System.out.printf("%.6f percent\n",nueva[0][nodo-1]*100.0);
		}
	}
	//algoritmo de floyd-warshall
	static double[][] floyd (double w[][],int n)
	{
		for (int k = 0; k < n; k++) 
		{
			for (int i = 0; i < n; i++) 
			{
				for (int j = 0; j < n; j++) 
				{
					if(i!=j)
					w[i][j]=Math.max(w[i][j],w[i][k]*w[k][j]);//anadimos ruta minima en la posision
				}
			}
		}
		return w;
	}

}
