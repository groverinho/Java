import java.util.*;

public class Hartals10050 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);		
		int casos = in.nextInt();
		while (casos-- > 0) 
		{
			int N = in.nextInt();
			int P = in.nextInt();
			int[] h = new int[P];
			
			for (int i = 0; i < P; ++i)
				h[i] = in.nextInt();
			int res = 0;
			
			for (int i = 1; i <= N; ++i)
			{
				if ((i + 1) % 7 == 0 || i % 7 == 0)
					continue;
				for (int j = 0; j < P; j++)
					if (i % h[j] == 0) 
					{
						res++;
						break;
					}
			}
			System.out.println(res);
		}
	}
}