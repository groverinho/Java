package BEGINNER;
import java.util.Arrays;
import java.util.Scanner;


public class SimpleSort {

	public static void main(String[] args)
	{
		Scanner in  = new Scanner(System.in);
		int [] vector = new int[3];
		int [] aux = new int[3];
		for (int i = 0; i < vector.length; i++) {
			vector[i]= in.nextInt();
			aux[i] = vector[i];
		}
		Arrays.sort(vector);
		for (int i = 0; i < vector.length; i++)
		{
			System.out.println(vector[i]);
		}
		System.out.println();
		for (int i = 0; i < aux.length; i++)
		{
			System.out.println(aux[i]);
		}
	}

}
