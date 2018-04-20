import java.util.Arrays;
import java.util.Scanner;

/**
Name: Grover A. Irusta Miranda
Company: CodeRoad - xTime
Date 20/04/2018
 */

public class Lightsabers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int arrayN[] = new int[n];
		int arrayM[] = new int[m];
		boolean flag = false;
		for (int i = 0; i < arrayN.length; i++) {
			arrayN[i] = in.nextInt();
			arrayN[i]--;
		}
		for (int i = 0; i < arrayM.length; i++) {
			arrayM[i] = in.nextInt();
		}
		int[] count = new int[m];
		for (int left = 0; left < arrayN.length; left++) {
			for (int right = left; right < arrayN.length; right++) {
				Arrays.fill(count, 0);
				for (int i = left; i <= right; i++) {
					count[arrayN[i]]++;
				}
				boolean ok = true;
				for (int i = 0; i < count.length; i++) {
					if (count[i] != arrayM[i]) {
						ok = false;
					}
				}
				if (ok) {
					System.out.println("YES");
					return;
				}
			}
		}
		System.out.println("NO");
	}

}
