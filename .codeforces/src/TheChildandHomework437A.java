import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Grover Irusta Miranda
 * @date 11/05/2020
 * @company ----
 */
public class TheChildandHomework437A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] a = new int[4];
		for (int i = 0; i < 4; i++)
			a[i] = in.next().length() - 2;
		int cnt = 0;
		char ans = 'C';
		for (int i = 0; i < 4; i++) {
			boolean c1 = true;
			boolean c2 = true;
			for (int j = 0; j < 4; j++) {
				if (i == j)
					continue;
				if (a[i] < 2 * a[j])
					c1 = false;
				if (a[i] * 2 > a[j])
					c2 = false;
			}
			if (c1 || c2) {
				cnt++;
				ans = (char) ('A' + i);

			}
		}
		if (cnt > 1)
			ans = 'C';
		System.out.println(ans);
	}

}
