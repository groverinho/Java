package BEGINNER;
import java.util.Scanner;

public class Bill {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n  =in.nextInt();
	while (n-->0)
	{
		int m = in.nextInt();
		if (m%2==0) 
		{
			System.out.println(0);
		}
		else
			System.out.println(1);
		
	}

	}

}
