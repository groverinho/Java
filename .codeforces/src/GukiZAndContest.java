import java.util.Scanner;


public class GukiZAndContest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int [] vector = new int [n];
		for (int i = 0; i < vector.length; i++) {
			vector[i]= in.nextInt();
		}
		for (int i = 0; i < vector.length; i++) 
		{
			int cont = 1;
			for (int j = 0; j < vector.length; j++) {
				if (vector[i]<vector[j]) {
					cont++;
				}
			}
			System.out.print(cont+" ");
		}

	}

}
