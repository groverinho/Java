import java.util.Scanner;


public class AngryProfessor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos  = in.nextInt();
		while (casos-->0)
		{
			int n = in.nextInt();
			int k = in.nextInt();
			int aux = 0;
			for (int i = 0; i < n; i++)
			{
				int estudiante = in.nextInt();
				if (estudiante<=0)
				{
					aux++;
				}
			}
			if (aux>=k)
			{
				System.out.println("NO");
			}
			else
				System.out.println("YES");
		}

	}

}
