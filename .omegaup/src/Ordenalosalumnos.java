import java.util.Arrays;
import java.util.Scanner;


public class Ordenalosalumnos {

	public static void main(String[] args) 
	{

		Scanner in = new Scanner(System.in);
		int n =in.nextInt();
		int []vector = new int [n];
		for (int i = 0; i < vector.length; i++) {
			vector[i]=in.nextInt();
		}
		Arrays.sort(vector);
		for (int i = vector.length-1; i >=0; i--)
		{
			if (i!=0)
				System.out.print(vector[i]+" ");	
			else
				System.out.print(vector[i]);
		}
	}

}
