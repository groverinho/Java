import java.util.Scanner;

/**
Name: Grover Irusta M.
Date: 2017
 */
public class matrizEspejo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int [][]matriz= new int [n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matriz[i][j]=in.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = m-1; j >=0; j--) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}

}
