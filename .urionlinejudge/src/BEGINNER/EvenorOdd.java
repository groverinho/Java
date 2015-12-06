package BEGINNER;
import java.util.Scanner;


public class EvenorOdd {

	public static void main(String[] args)
	{
	Scanner in = new Scanner(System.in);
	int casos=in.nextInt();
	while (casos>0) 
	{
		int n = in.nextInt();
		if (n==0)
		{
			System.out.println("NULL");
		}
		else if (n>0)
		{
			if (n%2==0) 
			{
				System.out.println("EVEN POSITIVE");
			}
			else
			{
				System.out.println("ODD POSITIVE");
			}
		}
		else if(n<0)
		{
			if (n%2==0) 
			{
				System.out.println("EVEN NEGATIVE");
			}
			else
			{
				System.out.println("ODD NEGATIVE");
			}
		}
		
		casos--;
	}

	}

}
