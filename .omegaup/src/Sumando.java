import java.util.Scanner;


public class Sumando {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int matriz [][]=  new int [n][n];	
		int vector[] = new int[n];
		int k = 0;
		for (int i = 0; i < matriz.length  ; i++)
		{
			for (int j = 0; j < matriz.length ; j++ )
			{
				matriz [i][j] = in.nextInt();
				vector [k]+= matriz[i][j];
				k++;
			}
			k=0;
		}
		for (int i = 0; i < vector.length; i++) {
			if (i+1!=vector.length) 
			{
				System.out.print(vector[i]+" ");
			}
			else
			{
				System.out.print(vector[i]);
			}
		}
	
		/*for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) 
			{
				vector [i]+= matriz[j][i];
			}
			if (i+1!=vector.length) 
			{
				System.out.print(vector[i]+" ");
			}
			else
			{
				System.out.print(vector[i]);
			}
		}*/
	}

}
