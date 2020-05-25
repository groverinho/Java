import java.util.Scanner;

/**
 * @author Grover Irusta Miranda
 * @date 25/5/2020
 * @company Mojix/Xtime
 */

public class HoneyReservoir2029 {

	/**
	 * 1450.00 25.00 760.00 40.00 7500.00 15.00
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			double v = in.nextDouble();
			double d = in.nextDouble();
			double ratio = d / 2;
			double pi = 3.14;
			System.out.printf("ALTURA = %.2f\n", v / (pi * (ratio * ratio)));
			System.out.printf("AREA = %.2f\n", (ratio * ratio) * pi);

		}
	}

}
