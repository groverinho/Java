import java.util.Scanner;


public class CinemaLine {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		 int n = in.nextInt();
		 int a = 0, b = 0, c = 0;

			boolean ok = true;

			for (int i = 0; i < n; ++i) 
			{
				int cur= in.nextInt();
				if (cur == 25) 
					++a;
				else if (cur == 50) 
				{
					if (a == 0) 
						ok = false;
					else 
					{
						--a;
						++b;
					}
				} 
				else 
				{
					if (a >= 1 && b >= 1) 
					{
						++c;
						--a;
						--b;
					} 
					else if (a >= 3) 
					{
						a -= 3;
						++c;
					} 
					else 
						ok = false;
				}
			}

			if (ok) System.out.println("YES");
			else System.out.println("NO");
		    
	}

}
