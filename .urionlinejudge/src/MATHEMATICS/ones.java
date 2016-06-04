package MATHEMATICS;

import java.util.Scanner;

public class ones {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int l, c,n;
		while (in.hasNext()) 
		{
			n=in.nextInt();
			l = 1;c = 1;
			 
			while(l % n != 0)
			{
				l = (10 * l + 1) % n;
				c++;
			}
			System.out.println(c);
		}
	}
}
