import java.util.Scanner;


public class AcontarLapices {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[]vector = new int[n];
		int query = in.nextInt();
		int c =0;
		for (int i = 0; i < vector.length; i++) 
		{
			vector[i]= in.nextInt();
			if (vector[i]== query)
				c++;
		}
		System.out.println(c);
	}

}
