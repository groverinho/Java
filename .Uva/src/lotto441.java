import java.util.Scanner;


public class lotto441 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		int vector[]= new int[12], cont = 0;
		while (n!=0) 
		{
			if (cont!=0)
				System.out.println();
			for (int i = 0; i < n; i++)
				vector[i] = in.nextInt();

			for (int a = 0; a < n - 5; a++)
				for (int b = a + 1; b < n - 4; b++)
					for (int c = b + 1; c < n - 3; c++)
						for (int d = c + 1; d < n - 2; d++)
							for (int e = d + 1; e < n - 1; e++)
								for (int f = e + 1; f < n; f++)
									System.out.printf("%d %d %d %d %d %d\n", vector[a], vector[b], vector[c], vector[d], vector[e], vector[f]);
			cont++;
			n = in.nextInt();
		}


	}

}
