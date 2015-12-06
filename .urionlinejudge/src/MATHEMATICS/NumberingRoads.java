package MATHEMATICS;

import java.util.Scanner;

public class NumberingRoads {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int R = in.nextInt(), N = in.nextInt();
		int t=0;
		while (R!=0 && N!=0)
		{
			int res = (R - 1) / N;
			System.out.print("Case " + ++t + ": ");
			
			if (res <= 26)
				System.out.print(res + "\n");
			else
				System.out.print("impossible\n");
			R = in.nextInt(); N = in.nextInt();

		}

	}

}
