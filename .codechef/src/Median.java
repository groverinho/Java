import java.util.Arrays;
import java.util.Scanner;


public class Median {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		
			int[] vector = new int[casos];
			for (int i = 0; i < vector.length; i++) 
			{
				vector[i]=in.nextInt();
			}
			Arrays.sort(vector);
			System.out.println(vector[(casos-1)/2]);
			casos--;
		

	}

}
