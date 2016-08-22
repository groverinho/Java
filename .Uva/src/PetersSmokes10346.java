import java.util.Scanner;

// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 22-08-16

public class PetersSmokes10346 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext())
		{
			int n = in.nextInt();
			int k = in.nextInt();
			System.out.println( n + (n - 1) / (k - 1));
		}

	}

}
