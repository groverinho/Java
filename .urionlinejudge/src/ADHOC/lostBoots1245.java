import java.util.Scanner;

/**
 * @author Grover Irusta Miranda
 * @date 12/05/2020
 * @company ---
 */

public class lostBoots1245 {

	/**
	
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {

			int cases = in.nextInt();
			int[] array1 = new int[101];
			char[] array2 = new char[101];
			for (int i = 0; i < cases; i++) {
				int m = in.nextInt();
				char l = in.next().charAt(0);
				if (l == 'D')
					array1[m]++;
				else
					array2[m]++;
			}
			int result = 0;
			for (int i = 0; i < array1.length; i++) {
				result += Math.min(array1[i], array2[i]);
			}
			System.out.println(result);

		}
	}

}
