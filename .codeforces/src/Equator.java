import java.util.Scanner;

/**
Name: Grover A. Irusta Miranda
Company: CodeRoad - xTime
Date 16/04/2018
 */
public class Equator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int problemsNumber[] = new int[n];
		int total = 0;
		for (int i = 0; i < problemsNumber.length; i++) {
			problemsNumber[i] = in.nextInt();
			total += problemsNumber[i];
		}
		int acu = 0, index = 0;
		for (int i = 0; i < problemsNumber.length; i++) {
			acu += problemsNumber[i];
			if (acu * 2 >= total) {
				index = i;
				break;
			}
		}
		System.out.println(index + 1);
	}
}
