import java.util.Arrays;
import java.util.Scanner;


public class lowPower1577 {


	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	while (in.hasNext())
	{
		int n = in.nextInt();
		int m = in.nextInt();
			int N = 2 * n * m; 
			int A []=new int[N];
			for (int i = 0; i < N; i++)
				A[i] = in.nextInt();
			Arrays.sort(A);
			int l = A[1] - A[0], r = A[N-1] - A[0], mid;
			int ret = l;
			while (l <= r)
			{
				mid = (l + r)/2;
				int cnt = 0, used = 0;
				for (int i = 0; i < N - 1; i++) 
				{
					if (A[i+1] - A[i] <= mid)
					{	
						cnt++; i++; used += 2;
					}
					else 
						used++;
					if (used > cnt * 2 * m || cnt == n)
						break;
				}
				if (cnt == n)
				{
					ret = mid; r = mid - 1;
				}
				else
					l = mid + 1;
			}
			System.out.println(ret);
		}	
	}
	
}
