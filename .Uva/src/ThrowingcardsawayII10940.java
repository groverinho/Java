import java.util.*;
import java.io.*;

/**
Name: Grover A. Irusta Miranda
Company: CodeRoad - xTime
Date 22/10/2018
 */

public class ThrowingcardsawayII10940 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int[] v = new int[500001];
		v[1] = 1;
		v[2] = 2;

		int next = 2;

		for (int i = 3; i <= 500000; i++) {
			if (i < next)
				next = 2;
			v[i] = next;
			next += 2;
		}

		int n = Integer.parseInt(in.readLine());
		while (n != 0) {

			System.out.println(v[n]);
			n = Integer.parseInt(in.readLine());
		}

	}

}
