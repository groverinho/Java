import java.util.Scanner;


public class savesetu12403 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		long sum = 0;
		while (casos -- >0) 
		{
			String s = in.next();

			if (s.equals( "donate"))
			{
				long x = in.nextLong();
				sum += x;
			} 
			else 
			{
				System.out.println(sum);
			}
		}

	}

}
