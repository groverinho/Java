import java.util.Scanner;

/**
Name: Grover Irusta M.
Date: 2017
 */
public class MatrizSemejanteDiagonal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int [][]matriz = new int [n][n];
	for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz.length; j++) {
			matriz [i][j]=in.nextInt();
		}
	}
	boolean bandera = false;
	for (int i = 0; i < matriz.length; i++) {
		if (matriz[i][i]!=matriz[0][0]) {
			bandera = true;
			break;
		}
	}
	int j=n-1;
	for (int i = 0; i < matriz.length; i++) {
		if (matriz[i][j]!=matriz[0][n-1]) {
			bandera = true;
			break;
		}
		j--;
	}
	
	System.out.println(bandera?"NO":"SI");

	}

}
