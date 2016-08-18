import java.util.Scanner;


public class BafanaBafana11805 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		int c=1;
		while (casos-->0)
		{
			int n = in.nextInt();
			int k = in.nextInt();
			int p = in.nextInt();
			int aux =0;
			while (aux<p)
			{
				if (k==n)
				{
					k=1;
				}
				else
				{
					k++;
				}
				aux++;
			}
			System.out.println("Case "+c+": "+k); 
			c++;
		}

	}

}
