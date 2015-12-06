import java.util.Scanner;


public class StockholmNumbers {


	public static int[] p = new int[31];

	public static void init()
	{
		p[0] = 1;
		for (int i = 1; i < 31; ++i) 
		{
			p[i] = p[i - 1] << 1;
		}
	}

	public static int solve(int n)
	{
		int ret = 0, cnt = 0;
		for (int i = 30; i >= 0; --i) {
			if (p[i] < n) {
				n -= p[i];
				ret += 1 << (i + 1);
				cnt++;
			}
		}

		return ret + cnt % 2;
	}

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int t, n;
		init();
		 t = in.nextInt();
		while (t>0) {
			 n= in.nextInt();
			System.out.println(solve(n + 1));
			t--;
		}

	}

}
