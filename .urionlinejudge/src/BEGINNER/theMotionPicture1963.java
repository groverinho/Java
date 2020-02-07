import java.util.Scanner;

/**
 * 
 */

/**
 * @author Grover Irusta
 * @company Coderoad - Mojix
 * @date 06-02-20
 */
public class theMotionPicture1963 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		double b = in.nextDouble();
		System.out.printf("%.2f", 100*(b-a)/a);
		System.out.println("%");

	}

}
