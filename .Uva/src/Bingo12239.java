import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Bingo12239 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n, b;
		int vector[]= new int[100];
		n = in.nextInt();
		b= in.nextInt();
		while (n!=0 && b!=0) 
		{
			Set<Integer> checker = new HashSet<Integer>();
			for (int i = 0; i < b; i++) 
				vector[i]= in.nextInt();
			
			for (int i = 0; i < b; i++) 
			{
				for (int j = i; j < b; j++)
				{
					int d = Math.abs(vector[i] - vector[j]);
					if (d <= n)
						checker.add(d);
				}
			}

			if (checker.size() == n + 1)
				System.out.println("Y");
			else
				System.out.println("N");
			n = in.nextInt();
			b= in.nextInt();
		}

	}

}
