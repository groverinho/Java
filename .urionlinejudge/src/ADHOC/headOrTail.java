package ADHOC;
import java.util.Scanner;

public class headOrTail 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();;
		while (casos!=0)
		{
			int juan=0, maria=0;
			while (casos>0)
			{
				casos--;
				int n = in.nextInt();
				if (n==0)
					maria++;	
				else
					juan++;
			}
			System.out.println("Mary won "+maria+" times and John won "+juan+" times");
			casos = in.nextInt();
		}
		
	}
}
