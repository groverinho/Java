import java.util.Scanner;

/**
Name: Grover Irusta M.
Date: 2017
 */
public class BarbullaMatemática {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	long acu=0;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=i; j++) {
				acu+=j;
			}
		}
		System.out.println(acu);
	}

}
