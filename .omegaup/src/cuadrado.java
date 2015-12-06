import java.util.Scanner;


public class cuadrado {

	public static 	int n;
	public static  int[][] ret ; 
	public static int[][] RotateMatrix(int[][] matrix, int n)
	{ 
		
		for (int i = 0; i < n; ++i) 
		{ 
			for (int j = 0; j < n; ++j)
			{ 
				ret[i][ j] = matrix[n - j - 1][ i];
			} 
		} 
		return ret; 
	}
	public static void mostrar(int[][] matrix)
	{ 
		for (int i = 0; i < matrix.length; i++) 
		{
			for (int j = 0; j < matrix.length; j++) {
				System.out.println(matrix[i][j]);
			}
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		 n = in.nextInt();
		 ret = new int[n][ n];
		for (int i = 0; i < ret.length; i++) 
		{
			for (int j = 0; j < ret.length; j++) {
				ret[i][j] = in.nextInt();
			}
		}
		RotateMatrix(ret, n);
		mostrar(ret);

	}

}
