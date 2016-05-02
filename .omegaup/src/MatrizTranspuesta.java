import java.util.Scanner;


public class MatrizTranspuesta {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int [][]  matriz = new int[n][m];
		for (int i = 0; i < n; i++) 
			for (int j = 0; j < m; j++) 
				matriz[i][j] = in.nextInt();

	        for(int j = 0; j < matriz[0].length; j++){
	            for(int i = 0; i <matriz.length; i++){
	                System.out.print(matriz[i][j]+" ");
	            }
	            System.out.println();
	        }
		
	}

}
