

import java.util.*;
import java.io.*;

public class TheBusDriverProblem11389 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		
		while (true)
		{
			
			int n = in.nextInt();
			int d = in.nextInt();
			int r =in.nextInt();
			
			if (n == 0 && d == 0 && r == 0)
				break;
			
			int[] manana = new int[n];
			int[] noche = new int[n];
			
			for (int i = 0; i < n; ++i)
				manana[i] = in.nextInt();
			
			for (int i = 0; i < n; ++i)
				noche[i] =in.nextInt();
			
			Arrays.sort(manana);
			Arrays.sort(noche);
			
			int ans = 0;
			for (int i = 0; i < n; ++i)
				ans += Math.max(0, manana[i] + noche[n - 1 - i] - d) * r;
			System.out.println(ans);
		}
	}
}
