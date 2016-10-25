/**
Name: Grover Irusta Miranda
University: UPDS Tarija
Date: 24-10-16
 */

import java.util.*;

public class PerfectPermutation {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		if (x % 2 == 1) {
			System.out.print(-1);
		} 
		else
		{
			for (int i = 0; i < x; i++) 
			{
				if (i % 2 == 0) {
					System.out.print((i + 2) + " ");
				} else {

					System.out.print(i + " ");

				}
			}
		}
		System.out.println();
	}
}