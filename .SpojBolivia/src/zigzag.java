

import java.util.Scanner;

 class zigzag {

	
	public static String Verificar(int matriz[][], int n ,int m)
	{
		int i=0, j =0;
		int cont=0;
		boolean bandera= true;
		while (cont<m) 
		{
			if (matriz[i][j]==1 && i+1==n) 
			{
				i--;
				j++;
				cont++;
				bandera=false;
			}
			else if (matriz[i][j]==1 &&i==0)
			{
				i++;
				j++;
				cont++;
				bandera=true;
			}
			else  if (matriz[i][j]==1 && j+1==m) 
				return "YES";
			else if (matriz[i][j]==1 && bandera ==true) 
			{
				i++;
				j++;
				cont++;
			}
			else if (matriz[i][j]==1 && bandera == false) 
			{
				i--;
				j++;
				cont++;
			}
			else
				return "NO";
		}
		return "YES";

	
	}

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		int n,m;
		n = entrada.nextInt();
		m = entrada.nextInt();
		int [][]matriz = new int [n][m];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++) 
				matriz [i][j] = entrada.nextInt();
	System.out.println(Verificar(matriz, n, m));
	}
}
