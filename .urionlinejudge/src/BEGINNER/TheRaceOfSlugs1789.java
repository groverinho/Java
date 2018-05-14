/**
Name: Grover A. Irusta Miranda
Company: CodeRoad - xTime
Date 14/05/2018
 */
package BEGINNER;

import java.util.Scanner;

public class TheRaceOfSlugs1789 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			int array[] = new int[n];
			int sum = 0;
			for (int j = 0; j < array.length; j++) {
				array[j] = in.nextInt();
				sum = Math.max(sum, array[j]);
			}
			if (sum < 10) {
				System.out.println("1");
			} else if (sum >= 10 && sum < 20) {
				System.out.println("2");
			} else {
				System.out.println("3");
			}
		}

	}
}
