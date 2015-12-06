import java.util.Arrays;
import java.util.Scanner;


public class sedes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n =in.nextInt();
		int []vector = new int [n];
		for (int i = 0; i < vector.length; i++)
		{
			vector[i]= in.nextInt();
		}	
		Arrays.sort(vector);
		System.out.println(vector[n-1]-vector[0]);
	}

}
