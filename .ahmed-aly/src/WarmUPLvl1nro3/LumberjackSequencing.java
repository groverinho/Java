package WarmUPLvl1nro3;

import java.util.Scanner;

public class LumberjackSequencing {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
			int casos, c, p;
			boolean up, down;

			casos = in.nextInt();
			System.out.println("Lumberjacks:");

			while (casos>0) {
				up = down = false;
				p = in.nextInt();
				for (int i = 0; i < 9; i++)
				{
					c = in.nextInt();
					if (p < c)
						up = true;
					else
						down = true;
					p = c;
				}

				if (up && down)
					System.out.println("Unordered");
				else
					System.out.println("Ordered");
				casos--;
			}


	}

}
