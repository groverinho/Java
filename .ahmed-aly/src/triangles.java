import java.util.Scanner;


public class triangles {

	
	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		long vector[] = new long [64001];
		vector[0]=0;
		int m =0;
		for (int i = 1; i < vector.length; i++)
		{
			m += i;
			vector[i] = m *3 + vector[i - 1];
		}
		int k = in.nextInt();
		while (k-->0) 
		{
			int n = in.nextInt();
			System.out.println(vector[n]);
		}

	}

}
