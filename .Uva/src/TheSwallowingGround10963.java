import java.util.Scanner;


public class TheSwallowingGround10963 {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		while (casos-- > 0) 
		{
			int n = in.nextInt();

			boolean yes = true;
			int up = in.nextInt();int down = in.nextInt();
			int d = up - down;

			for (int i = 0; i < n - 1; i++) {
				 up = in.nextInt(); down = in.nextInt();
				if (d != up - down)
					yes = false;
			}

			if (yes)
				System.out.println("yes");
			else
				System.out.println("no");
			if (casos==0) {
				System.out.println("");
			}
		}

	}

}
