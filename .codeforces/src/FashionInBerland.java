import java.util.Scanner;


public class FashionInBerland {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c = 0;
		boolean bandera = false;
		if (n==1) {
			
			int b = in.nextInt();
			if (b==0)
			{
				System.out.println("NO");
			}
			else System.out.println("YES");
		}
		else
		{
			for (int i = 0; i < n; i++)
			{
				int m = in.nextInt();
				if (m==0)
				{
					c++;
				}
				if (c>1) 
				{
					break;
				}
			}
			if (c==0)
			{
				System.out.println("NO");
			}
			else if (c==1) {
				System.out.println("YES");
			}
			else
				System.out.println("NO");
				

		}
		
	}

}
