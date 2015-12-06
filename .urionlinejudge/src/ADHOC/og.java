package ADHOC;
import java.util.Scanner;


public class og {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		while (a!=0 & b!=0)
		{
			System.out.println(a+b);
			 a = in.nextInt();
			 b = in.nextInt();
		}
	}

}
