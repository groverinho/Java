import java.util.Arrays;
import java.util.Scanner;


public class OrdenCreciente {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int []vector = new int[n];
		int []aux = new int[n];
		for (int i = 0; i < n; i++) 
		{
			vector[i]= in.nextInt();
			aux[i]= vector[i];
		}
		Arrays.sort(vector);
		boolean bandera = true;
jaja:   for (int i = 0; i < n; i++) 
		{
			if (vector[i]!= aux[i])
			{
				bandera = false;
				break jaja;
			}
		}
		if (bandera)
			System.out.println("SI");
		else
			System.out.println("NO");
	}

}
