import java.util.Scanner;

/**
Name: Grover Irusta M.
Date: 2017
 */
public class generandoBuscaminas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		String[][]tablero = new String [m+10][n+10];
		String[][]tablero2 = new String [m+10][n+10];
		int p = in.nextInt();
		for (int i = 0; i < p; i++) {
			tablero[in.nextInt()][in.nextInt()]="M";
		}
		for(int i=1; i<=m; i++){
			for(int j=1; j<=n; j++){
				int aux=0;
				if (tablero[i][j]!="M") {				
					if(	tablero[i-1][j-1]=="M" ) aux++;
					if(	tablero[i-1][j]=="M" ) aux++;
					if(	tablero[i-1][j+1]=="M" ) aux++;
					if(	tablero[i][j-1]=="M" ) aux++;
					if(	tablero[i][j+1]=="M" ) aux++;
					if(	tablero[i+1][j-1]=="M" ) aux++;
					if(	tablero[i+1][j]=="M" ) aux++;
					if(	tablero[i+1][j+1]=="M" ) aux++;
					tablero2[i][j]=aux+"";
				}
				else
					tablero2[i][j]="M";
				}
			}
		
		for(int i=1; i<=m; i++){
			for(int j=1; j<=n; j++){		
				System.out.print(tablero2[j][i]);
			}
			System.out.println();
		}
	}

}
