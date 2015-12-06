

import java.io.*;
import java.util.Scanner;

public class BinomialShowdown530 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		
		while (true)
		{
			int n = in.nextInt();
			int k = in.nextInt();
			
			if (n == 0 && k == 0) 
				break;
			
			long resp = 1;
			k = Math.min(k, n - k);
			for (int i = 1; i <= k; ++i) 
			{
				resp = resp * (n - k + i);
				resp = resp / i;
			}
			System.out.println(resp);
		}
	}
}
