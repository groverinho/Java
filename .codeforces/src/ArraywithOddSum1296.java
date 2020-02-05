import java.util.Scanner;

/**

 */


/**
 * @author Grover Irusta
 * @company Coderoad - Mojix
 * @date 05-02-20
 */
public class ArraywithOddSum1296 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int cases = in.nextInt();
for (int i = 0; i < cases; i++) {
	int n = in.nextInt();
	int[] a = new int[2];
	while (n-- > 0)
		a[in.nextInt() % 2]++;
	System.out.println(a[1] % 2 == 1 || (a[0] > 0 && a[1] > 0) ? "YES" : "NO");
}

	}

}
