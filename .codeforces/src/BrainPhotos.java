import java.util.Scanner;

// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 01-09-16

public class BrainPhotos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		//cyan, magenta or yellow
		boolean cyan = false;
		boolean magente= false;
		boolean yellow=false;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				char c = in.next().charAt(0);
				if (c == 'C') {
					cyan = true;
				}
				else if (c == 'M') {
					magente = true;
				}
				else if (c == 'Y') {
					yellow = true;
				}
			}
		}
		if (cyan || magente || yellow)
		{
			System.out.println("#Color");
		}
		else
			System.out.println("#Black&White");

	}
}
