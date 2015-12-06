

import java.util.Scanner;

public class Egypt {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int a  = in.nextInt();
		int b  = in.nextInt();
		int c  = in.nextInt();
		while (a!=0 && b!=0 && c!=0)
		{		
			a = a*a;
			b = b*b;
			c=c*c;
			if ((a+b)==c || (b+c) == a || (c+a) == b)
				System.out.println("right");
			else
				System.out.println("wrong");
			 a  = in.nextInt();
			 b  = in.nextInt();
			 c  = in.nextInt();
		}
	}

}
