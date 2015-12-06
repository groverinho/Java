import java.util.Scanner;

public class Wie {

	public static void main(String[] args) 
	{
		Scanner entrada  = new  Scanner(System.in);
			int n = entrada.nextInt();
			char [][] matriz = new char[n][n];
			boolean [] filas = new boolean[n];
			boolean [] col = new boolean[n];
			int aux1 = 0;
			for (int i = 0; i < n; i++) 
			{
	
				String cad = entrada.next();
				for (int j = 0; j < n; j++)
				{
					matriz[i][j]= cad.charAt(j);
					if(matriz[i][j]=='W')
					{
						filas[i]=true;
						col[j]=true;
						aux1++;
					}
				}
			}
			int aux2 = n-aux1; 
			boolean bandera = true;
	dance:		for (int i = 0; i < n; i++)
			{
				if(aux2==0)
					break;
				if(bandera)
				{
					for (int j = 0; j <n ; j++) {
						if(aux2==0)
							break dance;
						if(!filas[j] && !col[i])
						{
							matriz[j][i]='W';
							filas[j]=true;
							col[i]=true;
							aux2--;
							break;
						}
					}
					bandera = false;
				}
				else
				{
					for (int j = n-1; j >=0; j--) {
						if(aux2==0)
							break dance;
						if(!filas[j] && !col[i])
						{
							matriz[j][i]='W';
							filas[j]=true;
							col[i]=true;
							aux2--;
							break;
						}
					}
					bandera = true;
				}
			}
			
			for (int i = 0; i < n; i++) 
			{
				for (int j = 0; j < n; j++) {
					System.out.print(matriz[i][j]);
				}
				System.out.println();
			}
	
		}

}
