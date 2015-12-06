import java.util.Scanner;


public class MatrizDiagonal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
		int n = in.nextInt();
		int [][] matriz = new int[n][n];
		for (int i = 0; i < matriz.length; i++) 
			for (int j = 0; j < matriz.length; j++) 
				matriz[i][j] = in.nextInt();

		int aux = matriz[0][0];
		boolean bandera = true;
		for (int i = 0; i < matriz.length; i++) 
		{
			if (matriz[i][i]!= aux)
			{
				bandera=false;
				break;
			}
		}
		if (bandera) 
			System.out.println("SI");
		else
			System.out.println("NO");
	}

}
