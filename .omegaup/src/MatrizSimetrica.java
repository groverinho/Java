import java.util.Scanner;


public class MatrizSimetrica {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int [][]  matriz = new int[n][n];
		for (int i = 0; i < matriz.length; i++) 
			for (int j = 0; j < matriz.length; j++) 
				matriz[i][j] = in.nextInt();
		boolean bandera = false
				;
	jo:	for (int i = 0; i < matriz.length; i++) 
			for (int j = 0; j < matriz.length; j++) 
				if (matriz[i][j]!= matriz[j][i])
				{
					bandera = true;
					break jo;
				}
		if (bandera)
		{
			System.out.println("NO");
			
			
		}
		else
			System.out.println("SI");
	}

}
