import java.util.Scanner;


public class TablerodeAjedrez {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos  = in.nextInt();
		while (casos-->0)
		{
			int blancas = 0 ;
			int fila =in.nextInt();
			int columna =in.nextInt();
			int matriz[][]= new int [fila][columna];
			for (int i = 0; i < fila; i++) 
				for (int j = 0; j < columna; j++) 
					matriz[i][j] = in.nextInt();
			for (int i =0; i < fila; i++) 
			{
				if (i%2==0)
				{
					for (int j = 0; j < columna; j+=2)
					{
						blancas +=matriz[i][j];
					}
				}
				else
				{
					for (int j = 1; j < columna; j+=2)
					{
						blancas +=matriz[i][j];
					}
				}
				
			
				}
			System.out.println(blancas);
			}

	}

}
