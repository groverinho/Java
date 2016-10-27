import java.util.Scanner;

/**
Name: Grover Irusta Miranda
University: UPDS Tarija
Date: 26-10-16
 */

public class FindtheWeddingCakeVolume2415 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos =in.nextInt();
		while (casos -->0)
		{
			int n = in.nextInt();
			//area += R * R * pi * H
			double area = 0;
			for (int i = 0; i < n; i++) {
				int r = in.nextInt();
				int h = in.nextInt();
				area += r *r * h * Math.PI; 
			}
			System.out.printf("%.2f\n",area);
		}

	}

}
