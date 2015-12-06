
import java.util.Arrays;
import java.util.Scanner;


public class Moda {

	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		int a = 0, moda = 0;
		int n = entrada.nextInt();
		int vector[] = new int[n];
		for (int i = 0; i < vector.length; i++)
			vector[i]= entrada.nextInt();
		Arrays.sort(vector);
		moda =vector[0];
		for (int i = 0; i < vector.length; i++) 
		{
			for (int j = 0; j < vector.length; j++) 
			{
				
				if (vector[i] == vector[j])
				{
					moda = vector[i];
	
				}
			}
		}
		
	}

}
