/**
Name: Grover Irusta Miranda
University: UPDS Tarija
Date: 20-10-16
 */


	 
	import java.util.Scanner;

	public class eleccionGeneral{
		public static void main(String[] args) {		
			Scanner in = new Scanner(System.in);
			int casos = in.nextInt();
			while (casos-->0) {
				int n = in.nextInt();
				int m = in.nextInt();
				int candidatos[][] = new int[m][n];

				for (int i = 0; i < m; i++) 
					for (int j = 0; j < n; j++)
						candidatos[i][j] = in.nextInt();

				int sumas[] = new int[n];
				for (int j = 0; j < n; j++) 
				{
					int sum = 0;
					for (int i = 0; i < m; i++) 
						sum = sum + candidatos[i][j];
					sumas[j] = sum;
				} 
				int mayor = 0;
				 for (int j = 0; j < n; j++)
				 {
					 mayor = Math.max(sumas[j], mayor);
				 } 
				 int auxI=0;
				 for (int i = 0; i < sumas.length; i++) 
				 {
					if (sumas[i]==mayor) 
					{
						auxI=i;
						break;
					}
				}
				 System.out.println(auxI+1);
			}
		}

			
		
	}