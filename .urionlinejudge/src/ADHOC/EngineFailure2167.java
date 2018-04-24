/**
Name: Grover A. Irusta Miranda
Company: CodeRoad - xTime
Date 24/04/2018
 */
package ADHOC;

import java.util.Scanner;

public class EngineFailure2167 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int r[] = new int[n];
		for (int i = 0; i < n; i++) {
			r[i] = in.nextInt();
		}
		int index = 0;
		for (int i = 0; i < r.length - 1; i++) {
			if (r[i + 1] < r[i]) {
				index = i + 1;
				break;
			}
		}
		System.out.println(index == 0 ? 0 : index + 1);
	}

}
