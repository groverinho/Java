package BEGINNER;
import java.util.Scanner;


public class PUM {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 1; i <= n*4; i++)
		{
			if (i%4==0)
				System.out.println("PUM");
			else
				System.out.print(i+" ");		
		}
	}
}
