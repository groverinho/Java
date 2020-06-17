import java.util.Scanner;

/**
 * @author Grover Irusta Miranda
 * @date 17/06/2020
 * @company Mojix/Xtime
 */
public class inputAndOutputCharacter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		String c = in.next();
		System.out.println("A = " + a + ", B = " + b + ", C = " + c + "\nA = " + b + ", B = " + c + ", C = " + a
				+ "\nA = " + c + ", B = " + a + ", C = " + b);
	}
}
