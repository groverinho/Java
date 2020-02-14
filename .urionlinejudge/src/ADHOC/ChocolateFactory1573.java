import java.util.Scanner;

/**
 * @author Grover Irusta Miranda
 * @date 14/02/2020
 * @company Mojix/Xtime
 */

public class ChocolateFactory1573 {

	/**
	170 867 253
452 378 368
5 6 7
2 4 5
0 0 0
	 */
	public static int findEdges(double s1, double s2, double s3) {

		return (int) Math.pow((s1 * s2 * s3), 1.0 / 3.0);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s1 = in.nextInt();
		int s2 = in.nextInt();
		int s3 = in.nextInt();
		while (s1 != 0 && s2 != 0 && s3 != 0) {
			System.out.println(findEdges(s1, s2, s3));
			s1 = in.nextInt();
			s2 = in.nextInt();
			s3 = in.nextInt();
		}
	}
}
