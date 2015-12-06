import java.util.Arrays;
import java.util.Scanner;


public class Ordenar {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n =in.nextInt();
		int []vector = new int [n];
		for (int i = 0; i < vector.length; i++) {
			vector[i]=in.nextInt();
		}
		Arrays.sort(vector);
		for (int i = 0; i < vector.length; i++) 
		{
			if (i!=vector.length)
				System.out.print(vector[i]+" ");	
			else
				System.out.print(vector[i]);
		}
	}

}
