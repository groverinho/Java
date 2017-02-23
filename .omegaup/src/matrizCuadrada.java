import java.util.Scanner;

/**
Name: Grover Irusta M.
Date: 2017
 */
public class matrizCuadrada {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int r,c,p,r1;
		r = in.nextInt();
		c = in.nextInt();
		p = in.nextInt();
		int [][]matriz = new int[p][2]; 
		for( int i=0; i<p;i++)
		{ 
			for( int j=0; j<2;j++)
			{ 
				matriz[i][j]= in.nextInt();; 
			} 
		} 
		for(int i=0;i<p;i++)
		{ 
			System.out.print(((matriz[i][0]-1)*c)+matriz[i][1] + " ");
		} 
	}
}


